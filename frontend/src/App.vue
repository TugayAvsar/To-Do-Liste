<template>
  <div id="app">
    <ToDoList :todos="todoItems" />
  </div>
</template>

<script>
import ToDoList from './components/ToDoList.vue'

export default {
  name: 'App',
  components: {
    ToDoList
  },
  data() {
    return {
      todoItems: [
        { title: 'Projekt abgeben', description: 'Bis Sonntag 23:59 Uhr' },
        { title: 'Mail schreiben', description: 'Dozenten informieren' },
        { title: 'Entspannen', description: 'Pause machen' }
      ]
    }
  }
}
</script>
