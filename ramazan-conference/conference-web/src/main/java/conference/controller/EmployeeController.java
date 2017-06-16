package conference.controller;

import conference.entities.imp.EmployeeImp;
import conference.entities.interfaces.IEmployee;
import conference.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
@RestController
@RequestMapping(value = "employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping(value = "findById",method = RequestMethod.GET)
    public @ResponseBody
    IEmployee findById(@RequestBody @RequestParam("id") Long id)
    {
        return (IEmployee) employeeService.getById(id);
    }

    @RequestMapping(value = "create",method = RequestMethod.POST)
    public @ResponseBody boolean create(@RequestBody EmployeeImp employee)
    {
        return employeeService.create(employee);
    }

    @RequestMapping(value = "update",method = RequestMethod.PUT)
    public @ResponseBody boolean update(@RequestBody EmployeeImp employee)
    {
        return employeeService.update(employee);
    }

    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    public @ResponseBody boolean delete(@RequestBody @RequestParam("id")Long id)
    {
        return employeeService.delete(id);
    }

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public @ResponseBody
    List<IEmployee> getList()
    {
        return employeeService.getList();
    }
}
