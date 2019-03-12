<template>
  <el-footer class="footerMain">
    <el-row style="margin-bottom:0px">
      <el-col :span="3"></el-col>
      <el-col :span="18" class="content">
        <el-row>
          <el-col :span="7" class="about">
            <el-row class="mainLine">
              <el-col :span="24">关于我们</el-col>
            </el-row>
            <el-row>
              <el-col :span="24">关于我们</el-col>
            </el-row>
            <el-row>
              <el-col :span="24">关于我们</el-col>
            </el-row>
            <el-row>
              <el-col :span="24">关于我们</el-col>
            </el-row>
          </el-col>
          <el-col :span="7" class="news">
            <el-row class="mainLine">
              <el-col :span="24">新闻</el-col>
            </el-row>
            <el-row>
              <el-col :span="24">新闻</el-col>
            </el-row>
            <el-row>
              <el-col :span="24">新闻</el-col>
            </el-row>
            <el-row>
              <el-col :span="24">新闻</el-col>
            </el-row>
          </el-col>
          <el-col :span="10" class="contacts">
            <el-row class="mainLine">
              <el-col :span="24">联系我们</el-col>
            </el-row>
            <el-row>
              <el-col :span="24">联系我们</el-col>
            </el-row>
            <el-row>
              <el-col :span="24">联系我们</el-col>
            </el-row>
            <el-row>
              <el-col :span="24">联系我们</el-col>
            </el-row>
            <el-row>
              <el-col :span="24">联系我们</el-col>
            </el-row>
            <el-row>
              <el-col :span="24">联系我们</el-col>
            </el-row>
          </el-col>
        </el-row>
      </el-col>
      <el-col :span="3"></el-col>
    </el-row>
    <el-row class="icp">
      <el-col :span="24">Copyright©2013 YisideCo.,Ltd 京ICP备17006131号－1保留所有权利</el-col>
    </el-row>
  </el-footer>
</template>

<script>
export default {
  name: "Footer",
  data() {
    return {
      activeIndex: "1",
      activeIndex2: "1"
    };
  },
  methods: {
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
    }
  }
};
</script>
<style>
.content {
  margin-left: 20%;
}
.el-row {
  margin-bottom: 10px;
  background-color: #909399;
  padding: 0px;
}
.footerMain {
  position: absoulte;
  height: 300px;
  margin-top: 300px;
  padding: 0px;
}
.mainLine {
  margin-top: 15px;
  font-weight: bold;
}
.icp {
  margin-bottom: 0px;
  height: 30px;
  text-align: center;
  color: aliceblue;
  font-family: Cambria, Cochin, Georgia, Times, "Times New Roman", serif;
  background-color: #99a9bf;
}
</style>
