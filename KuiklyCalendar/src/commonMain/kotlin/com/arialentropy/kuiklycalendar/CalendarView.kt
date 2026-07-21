package com.arialentropy.kuiklycalendar

/**
 * KuiklyCalendar 日历组件（占位，待实现）
 *
 * 设计见 GitHub Issue #1（日历组件 · 设计）。实现按 PR 边界推进：
 * - CL-1 网格渲染与月份导航
 * - CL-2 选择交互与回调
 * - CL-3 样式增强（加分项）
 *
 * 技术路线：ComposeView 自建渲染（公开依赖无日历网格原生组件）；
 * 复用框架 CalendarModule 做日期计算；7 列网格用 flexDirectionRow + flexWrap 实现；
 * 固定 42 格（6 行）+ observable 驱动内容，月份切换与选中态不重建结构。
 */
class CalendarView {
    // TODO(CL-1): 日历网格与月份导航
}
