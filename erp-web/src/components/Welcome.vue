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
        series: [
          {
            name: '销量',
            type: 'bar',
            itemStyle: {
              color: function(params) {
                // params 是图表当前点击的参数
                var colorList = ['#c23531','#2f4554','#61a0a8','#d48265','#91c7ae'];
                return colorList[params.dataIndex % colorList.length];
              }
            }
          }
        ]
      }
      chart.setOption(option)     // 设置图表的配置项和数据
    }
  }
}
</script>

<template>
  <div id="chart" class="chart-container" style="width: 100%; height: 100%;"></div>
</template>

<style scoped lang="less">

</style>
