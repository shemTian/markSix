<template>
  <el-footer class="footerMain">
    <el-row style="margin-bottom:0px">
      <el-col :span="3"></el-col>
      <el-col :span="18" class="content">
        <el-row>
          <el-col :span="8" class="about">
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
          <el-col :span="8" class="news">
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
          <el-col :span="8" class="contacts">
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
      <el-col :span="24">Copyright©2019 tianmaijuhe.,Ltd</el-col>
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
<style scoped>
.content {
  margin-left: 12.5%;
  text-align: center;
}
.el-row {
  margin-bottom: 10px;
  background-color: rgb(45,45,45,0.98);
  padding: 0px;
}
.footerMain {
  position: absoulte;
  height: 300px;
  margin-top: 300px;
  padding: 0px;
  color: #ffffff;
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
  background-color: #444444;
}
</style>
