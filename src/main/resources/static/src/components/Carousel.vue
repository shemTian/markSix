<template>
  <el-carousel height="500px" trigger="click" >
    <el-carousel-item>
      <img src="../assets/hong-kong-1990268_1920.jpg" height="500px" width="1920px">
    </el-carousel-item>
    <el-carousel-item>
      <img src="../assets/hong-kong-864884_1920.jpg" height="500px" width="1920px">
    </el-carousel-item>
    <el-carousel-item>
      <img src="../assets/hong-kong-1081704_1920.jpg" height="500px" width="1920px">
    </el-carousel-item>
  </el-carousel>
</template>

<script>
    export default {
        name: "Carousel"
    }
</script>

<style scoped>
.el-carousel{
  box-shadow: 12px 2px 12px 0 rgba(0, 0, 0, 0.3);
}
</style>
