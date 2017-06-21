var React=require('react');
var {Link,IndexLink}=require('react-router');
var {Navbar, Nav, NavItem,NavbarHeader,NavbarBrand,NavbarToggle,NavbarCollapse} =require('react-bootstrap');
//var { Collapse, Navbar, NavbarToggler, NavbarBrand, Nav, NavItem, NavLink } = require('reactstrap');
var NavR=React.createClass({


    render:function () {
        return (
            <div>
                <Navbar color="faded" light toggleable>
                <Navbar.Header>
                        <NavbarBrand>
                            <Link to="/" activeClassName="active" activeStyle={{fontWeight:"bold",color:"black"}}>SpringBoot & ReactBootstrap</Link>
                        </NavbarBrand>
                    <Navbar.Toggle />
                </Navbar.Header>
                    <Navbar.Collapse>
                        <Nav>
                            <NavItem  href="#">Link</NavItem>
                            <NavItem  href="#">Link</NavItem>
                        </Nav>
                        <Nav pullRight>
                            <NavItem>
                                <Link to="/about" activeClassName="active" activeStyle={{fontWeight:"bold",color:"black"}}>About</Link>
                            </NavItem>
                            <NavItem eventKey={2} href="#">Link Right</NavItem>
                        </Nav>
                    </Navbar.Collapse>
                </Navbar>
            </div>
        );
    }
});



module.exports=NavR;



