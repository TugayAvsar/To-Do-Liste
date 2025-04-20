<template>
  <div>
    <h2>Meine To-Dos</h2>
    <ul>
      <li v-for="(todo, index) in todos" :key="index">
        <strong>{{ todo.title }}</strong>: {{ todo.description }}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'ToDoList',
  props: {
    todos: {
      type: Array,
      required: true
    }
  }
}
</script>
