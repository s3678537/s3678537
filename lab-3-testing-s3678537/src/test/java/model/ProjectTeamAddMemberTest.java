package model;

import jdk.jshell.execution.JdiExecutionControlProvider;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

/**
 *  Implement and test {@link Project#addTeamMember(Employee)} } that respects the following:
 *
 * <ul>
 *     <li>A project of estimated duration of 3 months (inclusive) or less cannot have more that 5 members</li>
 *     <li>A project of estimated duration of more than 3 months can have any number of members</li>
 *     <li>Project class must ensure an employee is not added twice to the same project</li>
 * </ul>
 * NOTE: Consider all months are 30 days. Then a project of 2 months is estimated as 60 days.
 *
 * Throws an {@link IllegalTeamMemberException} if an Employee cannot be part of the team.
 * Exception MUST identify the Employee name, project name and reason of exception in the message.
 *
 *
 * Each test criteria must be in an independent test method and named as specified in the README.
 *
 * Initialize the test object with setUp method.
 *
 * TIPS:
 * <ul>
 *     <li>You can use assertJ (https://assertj.github.io/doc/)  </li>
 * </ul>
 */


class ProjectTeamAddMemberTest {
    @Test

     public void IntNull_ExpectedNull_DepartmentTest(){
        Department test = new Department();
        String result = test.getName();
        assertEquals(null, result);

    }
}
    @Test

    public void Int3month_Expected5members_DepartmentTest(){
        Project test = new Project();
        String result = test.addTeamMember();
        assertEquals(5, result);

    }
}
