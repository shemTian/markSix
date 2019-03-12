<template>
  <el-container direction="vertical">
    <Header></Header>
    <el-main>
      <div id="app">
        <img src="./assets/logo.png">
        <router-view/>
      </div>
    </el-main>
    <Footer></Footer>
  </el-container>
</template>

<script>
import Header from "./components/Header.vue";
import Footer from "./components/Footer.vue"
export default {
  components: { Header,Footer },
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
