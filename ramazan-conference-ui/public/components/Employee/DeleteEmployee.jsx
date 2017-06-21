var React = require('react');
var {ButtonGroup,Modal,Panel,Button,Tooltip,Popover,ModalTitle,ModalHeader,ModalBody,ModalFooter,FormGroup,Form,Col,FormControl,ControlLabel}=require('react-bootstrap');

const DeleteEmployee = React.createClass({
    getInitialState() {
        return {
            showModal: false
        };
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
            <div >
                <Button
                    bsSize="medium"
                    onClick={this.open}>
                    Delete
                </Button>

                <Modal show={this.state.showModal} onHide={this.close}>
                    <Modal.Header closeButton>
                        <Modal.Title>Create Employee</Modal.Title>
                    </Modal.Header>
                    <Modal.Body>
                        <Panel bsStyle="danger">
                            <div className="text-center">
                            <p>Are you sure?</p>
                            <Form inline>
                                <Col sm={12}>
                                <Button type="submit" style={{marginRight:5}}>
                                    Yes
                                </Button>
                                <Button onClick={this.close}>
                                    No
                                </Button>
                                </Col>
                            </Form>
                            </div>
                        </Panel>
                    </Modal.Body>

                </Modal>
            </div>
        );
    }
});

module.exports=DeleteEmployee;