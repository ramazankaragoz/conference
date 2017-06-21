var React=require('react');
var {Panel} =require('react-bootstrap');


var About=(props)=>{
    return(
        <div>
            <Panel header="About Me">
                <div className="text-center">
                <p>This is a SpringBoot&ReactBootstrap app build on React.The application is my first React project. </p>
                <p>Here are some of the tools I used;</p>
                </div>
            </Panel>
        </div>
    );
};

module.exports=About;