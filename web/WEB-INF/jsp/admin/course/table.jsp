<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table class="table table-bordered table-striped table-hover">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Price</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
            <c:forEach var="course" items="${courses}">
                <tr>
                    <td>${course.id}</td>
                    <td>${course.name}</td>
                    <td>${course.price}</td>
                    <td>${course.status}</td>
                    <td>
                        <a href="javascript:void(0)" class="btn btn-success btn-lg edit-course" rel="${course.id}">Edit</a>
                        <a href="javascript:void(0)" class="btn btn-danger btn-lg delete-course" rel="${course.id}">Delete</a>
                    </td>

                </tr>
            </c:forEach>
</table>