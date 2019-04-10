<template>
    <div>
      <el-row>
        <el-col :span="12">10</el-col>
        <el-col :span="12">10</el-col>
      </el-row>
      <el-card class="box-card">
        <div slot="header" class="clearfix">
          <span>卡片名称</span>
        </div>
        <h4>this is content</h4>
      </el-card>

    </div>
</template>

<script>
    export default {
        name: "Content"
    }
</script>

<style scoped>
  .clearfix:before,
  .clearfix:after {
    display: table;
    content: "";
  }
  .clearfix:after {
    clear: both
  }
</style>
