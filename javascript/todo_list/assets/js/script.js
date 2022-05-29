function addTask() {
    var task = document.getElementById("task").value
    var taskList = document.getElementById("tasks")
    taskList = taskList.innerHTML + "<li>" + task + "</li>"
}