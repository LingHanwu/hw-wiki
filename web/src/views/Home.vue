<script lang="ts" setup>
import axios from 'axios'
import { defineComponent, onMounted, ref } from 'vue';
import { StarOutlined, LikeOutlined, MessageOutlined } from '@ant-design/icons-vue';
const ebooks = ref()



// 生命周期
onMounted(() => {
  axios.get("http://127.0.0.1:8080/ebook/list").then((response) => {
    const data = response.data;
    ebooks.value = data.content;
  })
})

const listData: Record<string, string>[] = [];

const pagination = {
  onChange: (page: number) => {
    console.log(page);
  },
  pageSize: 3,
};
const actions: Record<string, string>[] = [
  { type: 'StarOutlined', text: '156' },
  { type: 'LikeOutlined', text: '156' },
  { type: 'MessageOutlined', text: '2' },
];

</script>
<script lang="ts">

</script>
<template>
  <div class="home">
    <a-list item-layout="vertical" size="large" :pagination="pagination" :data-source="ebooks"
      :grid="{ gutter: 20, column: 3 }">
      <template #footer>
        <div>
          <b>ant design vue</b>
          footer part
        </div>
      </template>
      <template #renderItem="{ item }">
        <a-list-item key="item.name">
          <template #actions>
            <!-- 图标 -->
            <span v-for="{ type, text } in actions" :key="type">
              <component :is="type" style="margin-right: 8px" />
              {{ text }}
            </span>
          </template>
          <!-- <template #extra>
            <img width="272" alt="logo" src="https://gw.alipayobjects.com/zos/rmsportal/mqaQswcyDLcXyDKnZfES.png" />
          </template> -->
          <a-list-item-meta :description="item.description">
            <template #title>
              <a :href="item.href">{{ item.name }}</a>
            </template>
            <template #avatar>
              <a-avatar :src="item.cover" />
            </template>
          </a-list-item-meta>
          {{ item.content }}
        </a-list-item>
      </template>
    </a-list>
  </div>
</template>

<style scoped>
/* 封面图标样式 */
.ant-avatar {
  width: 50px;
  height: 50px;
  line-height: 50px;
  border-radius: 8%;
  margin: 5px 0;
}
</style>
