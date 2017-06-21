var React = require('react');
var ReactDOM = require('react-dom');
var {Route,Router,IndexRoute,hashHistory}=require('react-router');
var Main=require('Main');
var Conference=require('Conference');
var About=require('About');

ReactDOM.render(
    <Router history={hashHistory}>
        <Route path="/" component={Main}>
            <Route path="about" component={About}/>
            <IndexRoute component={Conference}/>
        </Route>
    </Router>,
    document.getElementById('app')
);
