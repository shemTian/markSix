<template>
  <div>
    <Header></Header>
    <div id="app">
      <img src="./assets/logo.png">
      <router-view/>
    </div>
  </div>
</template>

<script>
import Header from "./components/Header.vue";
export default {
  components: { Header },
  name: "App"
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
