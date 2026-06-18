package com.example.library

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import com.tunjid.snapshottable.SnapshotSpec
import com.tunjid.snapshottable.Snapshottable

@Composable
fun SnapshottableTestApp() {
    val state = SnapshottableTestAppState.Immutable()
        .toSnapshotMutable()

    Column {
        BasicText(state.text)
    }
}

@Snapshottable
interface SnapshottableTestAppState {
    @SnapshotSpec
    data class Immutable(
        val text: String = "Hello, SnapshottableTestApp!"
    ) : SnapshottableTestAppState
}
