var React = require('react');
var {ButtonGroup,Modal,Panel,Button,Tooltip,Popover,ModalTitle,ModalHeader,ModalBody,ModalFooter,FormGroup,Form,Col,FormControl,ControlLabel}=require('react-bootstrap');

const UpdateEmployee = React.createClass({
    getInitialState() {
        return {
            showModal: false,
            updateObject: {
                id: '',
                name: '',
                surname: '',
                salary: ''
            }};
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
                    Update
                </Button>

                <Modal show={this.state.showModal} onHide={this.close}>
                    <Modal.Header closeButton>
                        <Modal.Title>Update Employee</Modal.Title>
                    </Modal.Header>
                    <Modal.Body>
                        <Form horizontal>
                            <FormGroup controlId="formHorizontalName">
                                <ControlLabel/>
                                <Col componentClass={ControlLabel} sm={2}>
                                    Name
                                </Col>
                                <Col sm={10}>
                                    <FormControl type="text" placeholder="Name" />
                                </Col>
                            </FormGroup>

                            <FormGroup controlId="formHorizontalSurname">
                                <ControlLabel/>
                                <Col componentClass={ControlLabel} sm={2}>
                                    Surname
                                </Col>
                                <Col sm={10}>
                                    <FormControl type="text" placeholder="Surname" />
                                </Col>
                            </FormGroup>

                            <FormGroup controlId="formHorizontalSalary">
                                <ControlLabel/>
                                <Col componentClass={ControlLabel} sm={2}>
                                    Salary
                                </Col>
                                <Col sm={10}>
                                    <FormControl type="number" placeholder="Salary" />
                                </Col>
                            </FormGroup>

                            <FormGroup>
                                <Col smOffset={2} sm={10}>
                                    <Button
                                        bsSize="medium"
                                        type="submit">
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
    }
});

module.exports=UpdateEmployee;