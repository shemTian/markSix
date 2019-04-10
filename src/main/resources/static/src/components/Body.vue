<template>
  <el-main>
    <Carousel></Carousel>
    <Content></Content>
  </el-main>
</template>

<script>
  import Carousel from "./Carousel";
  import Content from "./Content"
  export default {
    components: {Carousel,Content},
    name: "Body"
  }
</script>

<style scoped>
.el-main {
  padding: 0px;
  margin-top: 80px;
}
</style>
