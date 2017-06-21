var React = require('react');
var ReactBSTable = require('react-bootstrap-table');
var BootstrapTable = ReactBSTable.BootstrapTable;
var TableHeaderColumn = ReactBSTable.TableHeaderColumn;
var {ButtonGroup,Modal,Panel,Button}=require('react-bootstrap');
var CreateEmployee=require('CreateEmployee');
var UpdateEmployee=require('UpdateEmployee');
var DeleteEmployee=require('DeleteEmployee');
var axios = require('axios');

var Employee = React.createClass({

    getInitialState: function () {
        return {
            selectedEmployeeId: null,
            data: null
        }
    },

    onRowSelect: function(row, isSelected) {
        if(isSelected) {
            this.setState({ selectedEmployeeId: row.id });
        }else {
            this.setState({ selectedEmployeeId: null });
        }
    },

    componentDidMount: function () {

        this.getEmployees();

    },

    render:function () {

        var options={
            sizePerPage: 10
        };

        var selectRowProp = {
            mode: "radio",
            clickToSelect: true,
            className: "selected-row",
            bgColor: 'rgb(101, 148, 255)',
            onSelect: this.onRowSelect
        };

        if(!this.state.data){
            return (<div></div>);
        }

        return (
            <div>
                <Panel header=" ">

                    <div>
                        <CreateEmployee parent={this}/>
                        <UpdateEmployee/>
                        <DeleteEmployee/>
                    </div>

                <BootstrapTable
                    options={options}
                    height='450'
                    data={this.state.data}
                    striped={true}
                    hover={true}
                    pagination={true}
                    search={true}
                    selectRow={selectRowProp}
                >
                    <TableHeaderColumn  width='150' dataField="id" isKey={true} dataAlign="center" dataSort={true}>Employee ID</TableHeaderColumn>
                    <TableHeaderColumn  width='150' dataField="name">First Name</TableHeaderColumn>
                    <TableHeaderColumn  width='150'  dataField="surname">Last Name</TableHeaderColumn>
                </BootstrapTable>
                </Panel>
            </div>);
    },

    getEmployees: function () {

        /**return axios.get('http://localhost:9292/api/employee/getAll').then(function (response) {

            console.log(response.data);

            return response.data;

        }).catch(function (error) {
            console.log(error);
        });*/


        return axios.get('http://localhost:9292/api/employee/getAll').then(response => {

            this.setState({
                data:response.data
            });

            console.log(JSON.stringify(response.data[0]));

        }).catch(error => { console.log(error); });
    }


});

module.exports=Employee;