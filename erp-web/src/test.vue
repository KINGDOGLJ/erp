<script>
import axios from "axios";
import * as echarts from 'echarts';  // 导入 echarts 库的所有模块

export default {
  data() {
    return {
      sourceData: [],
    };
  },
  mounted() {
    this.getDataAndInitChart();
  },
  methods: {
    async getDataAndInitChart() {
      const {data: result} = await this.$http.post('/pro/echart', this.params)
      if (!result.success) return this.$message.error(result.message)
      this.sourceData = result.data.list
      this.initChart()
    },
    initChart() {
      const chart = echarts.init(document.getElementById('chart'))
      const option = {
        title: {  // 标题组件
          text: '热售商品'
        },
        tooltip: {  // 提示框组件
          trigger: 'axis'
        },
        legend: {  // 图例组件
          data: ['销量']
        },
        dataset: {
          source: this.sourceData //设置Echarts图表的数据源
        },
        xAxis: {    // x 轴
          type: 'category',
        },
        yAxis: {    // y 轴
          type: 'value'
        },
        series: [  // 系列列表。每个系列通过 type 决定自己的图表类型
          {
            name: '销量',
            type: 'line',
          }
        ]
      }
      chart.setOption(option)     // 设置图表的配置项和数据
    }
  }
}
</script>

<template>
  <div id="chart" style="width: 600px; height: 400px;"></div>
</template>

<style scoped lang="less">

</style>
