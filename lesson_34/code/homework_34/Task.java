package homework_34;

import java.time.LocalDateTime;

public class Task implements Comparable<Task> {
        private int id;
        private String task;
        private int taskNumber;
        private LocalDateTime createdAt;

        public Task(int id, String task, int taskNumber) {
            this.id = id;
            this.task = task;
            this.taskNumber = taskNumber;
            this.createdAt = LocalDateTime.now();
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTask() {
            return task;
        }

        public void setTask(String task) {
            this.task = task;
        }

        public int getTaskNumber() {
            return taskNumber;
        }

        public void setTaskNumber(int taskNumber) {
            this.taskNumber = taskNumber;
        }
        public LocalDateTime getCreatedAt() {
          return createdAt;
        }

        public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        }

        @Override
        public String toString() {
            return "#" + taskNumber + ": " + task;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Task task1 = (Task) o;
            return id == task1.id;
        }

        @Override
        public int compareTo(Task otherTask) {
            return Integer.compare(this.taskNumber, otherTask.taskNumber);
        }
    }

