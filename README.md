# KuiklyCalendar

基于 [KuiklyUI](https://github.com/Tencent-TDS/KuiklyUI) 跨端框架构建的声明式日历组件，使用 ComposeView 路线在 `commonMain` 内用基础组件组合实现，支持 Android、iOS、鸿蒙多端运行。

> 当前处于设计阶段。组件设计、能力分层与 PR 拆分见 Issue #1（日历组件 · 设计），实现按 CL-1 → CL-2 → CL-3 推进。

## 组件能力

日历服务三类用户任务：看清时间（浏览某月分布）、选定时刻（选中日期并回传）、切换范围（月份导航）。

| 层级 | 目标 | 能力 |
| --- | --- | --- |
| L1 基础展示 | 稳定浏览 | 月份导航、星期表头、42 格网格、今中标记、内联/弹层形态 |
| L2 选择交互 | 选中回传 | 点击选中、选中态高亮、日期/月份回调、可选范围与禁用 |
| L3 样式增强（加分） | 美观与扩展 | 自定义格子、主题色可配、翻月动画、年月切换 |

## 工程结构

参照 [KuiklyChatUI](https://github.com/Kuikly-contrib/KuiklyChatUI) 的贡献仓库形态，组件本体、Demo 与平台宿主分开维护：

| 模块 | 职责 |
| --- | --- |
| `KuiklyCalendar` | 日历组件本体（CalendarView、日历模型、网格与导航渲染） |
| `shared` | 可运行 Demo（Kuikly 共享代码） |
| `androidApp` | Android 宿主 |
| `iosApp` | iOS 宿主 |

## 技术路线

- ComposeView 自建渲染（公开依赖中没有日历网格原生组件类型）
- 复用框架 CalendarModule 做日期计算（年月日星期、加减月份、月首偏移）
- 7 列网格用 flexDirectionRow + flexWrap 实现，固定 42 格 + observable 驱动内容，翻月不重建结构

## 本地开发

使用 JDK 17。

```bash
./gradlew :KuiklyCalendar:compileDebugKotlinAndroid
./gradlew :shared:compileDebugKotlinAndroid
./gradlew :androidApp:compileDebugKotlin
```

## License

[MIT](LICENSE)
