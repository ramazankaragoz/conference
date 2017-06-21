var React = require('react');
var {ButtonGroup,Modal,Panel,Button,Tooltip,Popover,ModalTitle,ModalHeader,ModalBody,ModalFooter,FormGroup,Form,Col,FormControl,ControlLabel}=require('react-bootstrap');
var axios = require('axios');

const CreateEmployee = React.createClass({
    getInitialState() {
        return {
            showModal: false,
            addObject: {
                name: '',
                surname: '',
                salary: ''
            } };
    },

    close() {
        this.setState({ showModal: false });
    },

    open() {
        this.setState({ showModal: true });
    },

    render() {
        const popover = (
            <Popover id="modal-popover" title="popover">
                very popover. such engagement
            </Popover>
        );
        const tooltip = (
            <Tooltip id="modal-tooltip">
                wow.
            </Tooltip>
        );

        return (
            <div style={{float:"left"}}>

                <Button
                    bsSize="medium"
                    onClick={this.open}>
                    Create
                </Button>

                <Modal show={this.state.showModal} onHide={this.close}>
                    <Modal.Header closeButton>
                        <Modal.Title>Create Employee</Modal.Title>
                    </Modal.Header>
                    <Modal.Body>
                        <Form horizontal>
                            <FormGroup controlId="formHorizontalName">
                                <ControlLabel/>
                                <Col componentClass={ControlLabel} sm={2}>
                                    Name
                                </Col>
                                <Col sm={10}>
                                <FormControl type="text" placeholder="Name" value={this.state.addObject.name} onChange={this.onAddEmployeeNameChange} />
                                </Col>
                            </FormGroup>

                            <FormGroup controlId="formHorizontalSurname">
                                <ControlLabel/>
                                <Col componentClass={ControlLabel} sm={2}>
                                    Surname
                                </Col>
                                <Col sm={10}>
                                    <FormControl type="text" placeholder="Surname" value={this.state.addObject.surname} onChange={this.onAddEmployeeSurnameChange} />
                                </Col>
                            </FormGroup>

                            <FormGroup controlId="formHorizontalSalary">
                                <ControlLabel/>
                                <Col componentClass={ControlLabel} sm={2}>
                                    Salary
                                </Col>
                                <Col sm={10}>
                                    <FormControl type="number" placeholder="Salary" value={this.state.addObject.salary} onChange={this.onAddEmployeeSalaryChange} />
                                </Col>
                            </FormGroup>

                            <FormGroup>
                                <Col smOffset={2} sm={10}>
                                    <Button
                                        bsSize="medium"
                                        type="submit"
                                        onClick={this.onAddBtnClicked}>
                                        Save
                                    </Button>
                                </Col>
                            </FormGroup>
                        </Form>
                    </Modal.Body>
                    <Modal.Footer>
                        <Button onClick={this.close}>Close</Button>
                    </Modal.Footer>
                </Modal>
            </div>
        );
    },

    onAddEmployeeNameChange: function(event) {
        this.state.addObject.name = event.target.value;
        this.forceUpdate();
    },

    onAddEmployeeSurnameChange: function(event) {
        this.state.addObject.surname = event.target.value;
        this.forceUpdate();
    },

    onAddEmployeeSalaryChange: function(event) {
        this.state.addObject.salary = event.target.value;
        this.forceUpdate();
    },

    onAddBtnClicked: function() {

        //Save employee
        axios.post('http://localhost:9292/api/employee/create', this.state.addObject)
            .then(function (response) {
                this.close();
                this.props.parent.getEmployees();
                console.log(response);
            }.bind(this))
            .catch(function (error) {
                console.log(error);
            });
    }
});

module.exports=CreateEmployee;