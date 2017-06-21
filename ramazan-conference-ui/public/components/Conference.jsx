var React = require('react');
var Employee=require('Employee');

var ReactBSTable = require('react-bootstrap-table');
var BootstrapTable = ReactBSTable.BootstrapTable;
var TableHeaderColumn = ReactBSTable.TableHeaderColumn;
var {ButtonGroup,Modal,Tabs,Tab}=require('react-bootstrap');
var axios = require('axios');

var Conference=React.createClass({

    render:function () {
        return (
            <div>
                <Tabs defaultActiveKey={1} animation={false} id="noanim-tab-example">
                    <Tab eventKey={1} title="Employee"><Employee /></Tab>
                    <Tab eventKey={2} title="Department">Department</Tab>
                    <Tab eventKey={3} title="Meeting">Meeting</Tab>
                </Tabs>
            </div>
        );
    }
});

module.exports=Conference;