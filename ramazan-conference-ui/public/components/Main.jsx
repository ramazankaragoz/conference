var React=require('react');
var NavR=require('NavR');
var {Col} =require('react-bootstrap');
var Main=(props)=>{
    return (
        <div>
            <NavR/>
            <div className="container">
                <Col lg={12} md={12} >
                    {props.children}
                </Col>
            </div>
        </div>
    );
};

module.exports=Main;