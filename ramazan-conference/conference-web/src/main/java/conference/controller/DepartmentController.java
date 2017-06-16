package conference.controller;

import conference.entities.imp.DepartmentImp;
import conference.entities.interfaces.IDepartment;
import conference.interfaces.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
@RestController
@RequestMapping(value = "department")
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @RequestMapping(value = "findById",method = RequestMethod.GET)
    public @ResponseBody  IDepartment findById(@RequestBody @RequestParam("id") Long id)
    {
        return (IDepartment) departmentService.getById(id);
    }

    @RequestMapping(value = "create",method = RequestMethod.POST)
    public @ResponseBody boolean create(@RequestBody DepartmentImp department)
    {
        return departmentService.create(department);
    }

    @RequestMapping(value = "update",method = RequestMethod.PUT)
    public @ResponseBody boolean update(@RequestBody DepartmentImp department)
    {
        return departmentService.update(department);
    }

    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    public @ResponseBody boolean delete(@RequestBody @RequestParam("id")Long id)
    {
        return departmentService.delete(id);
    }

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public @ResponseBody
    List<IDepartment> getList()
    {
        return departmentService.getList();
    }
}
