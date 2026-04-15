.class public final Lj2/o;
.super Lu3/b;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic d:Lj2/v;

.field public final synthetic e:Li2/j0;

.field public final synthetic f:Lj2/v;


# direct methods
.method public constructor <init>(Lj2/v;Li2/j0;Lj2/v;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj2/o;->d:Lj2/v;

    .line 2
    .line 3
    iput-object p2, p0, Lj2/o;->e:Li2/j0;

    .line 4
    .line 5
    iput-object p3, p0, Lj2/o;->f:Lj2/v;

    .line 6
    .line 7
    invoke-direct {p0}, Lu3/b;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final d(Landroid/view/View;Lv3/d;)V
    .locals 7

    .line 1
    iget-object v0, p2, Lv3/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    iget-object v1, p0, Lu3/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v1, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lj2/o;->d:Lj2/v;

    .line 9
    .line 10
    iget-object v1, p1, Lj2/v;->s:Lj2/d0;

    .line 11
    .line 12
    invoke-virtual {v1}, Lj2/d0;->v()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v2, p0, Lj2/o;->e:Li2/j0;

    .line 23
    .line 24
    invoke-virtual {v2}, Li2/j0;->v()Li2/j0;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    :goto_0
    const/4 v4, 0x0

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    iget-object v5, v3, Li2/j0;->F:Li2/d1;

    .line 32
    .line 33
    const/16 v6, 0x8

    .line 34
    .line 35
    invoke-virtual {v5, v6}, Li2/d1;->d(I)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v3}, Li2/j0;->v()Li2/j0;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-object v3, v4

    .line 48
    :goto_1
    if-eqz v3, :cond_3

    .line 49
    .line 50
    iget v3, v3, Li2/j0;->b:I

    .line 51
    .line 52
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    :cond_3
    const/4 v3, -0x1

    .line 57
    if-eqz v4, :cond_4

    .line 58
    .line 59
    invoke-virtual {p1}, Lj2/v;->getSemanticsOwner()Lq2/q;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v5}, Lq2/q;->a()Lq2/o;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    iget v5, v5, Lq2/o;->g:I

    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-ne v6, v5, :cond_5

    .line 74
    .line 75
    :cond_4
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    :cond_5
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    iput v4, p2, Lv3/d;->b:I

    .line 84
    .line 85
    iget-object p2, p0, Lj2/o;->f:Lj2/v;

    .line 86
    .line 87
    invoke-virtual {v0, p2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    .line 88
    .line 89
    .line 90
    iget v2, v2, Li2/j0;->b:I

    .line 91
    .line 92
    iget-object v4, v1, Lj2/d0;->E:Lo/w;

    .line 93
    .line 94
    invoke-virtual {v4, v2}, Lo/w;->d(I)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    const/16 v5, 0x16

    .line 99
    .line 100
    if-eq v4, v3, :cond_8

    .line 101
    .line 102
    invoke-virtual {p1}, Lj2/v;->getAndroidViewsHandler$ui_release()Lj2/y0;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-static {v6, v4}, Lj2/l0;->F(Lj2/y0;I)Li3/h;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    if-eqz v6, :cond_6

    .line 111
    .line 112
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 113
    .line 114
    if-lt v4, v5, :cond_7

    .line 115
    .line 116
    invoke-static {v0, v6}, Lc7/x0;->d(Landroid/view/accessibility/AccessibilityNodeInfo;Li3/h;)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 121
    .line 122
    if-lt v6, v5, :cond_7

    .line 123
    .line 124
    invoke-static {v0, p2, v4}, Lc7/x0;->e(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/View;I)V

    .line 125
    .line 126
    .line 127
    :cond_7
    :goto_2
    iget-object v4, v1, Lj2/d0;->G:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {p1, v2, v0, v4}, Lj2/v;->a(Lj2/v;ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :cond_8
    iget-object v4, v1, Lj2/d0;->F:Lo/w;

    .line 133
    .line 134
    invoke-virtual {v4, v2}, Lo/w;->d(I)I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eq v4, v3, :cond_b

    .line 139
    .line 140
    invoke-virtual {p1}, Lj2/v;->getAndroidViewsHandler$ui_release()Lj2/y0;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-static {v3, v4}, Lj2/l0;->F(Lj2/y0;I)Li3/h;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    if-eqz v3, :cond_9

    .line 149
    .line 150
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 151
    .line 152
    if-lt p2, v5, :cond_a

    .line 153
    .line 154
    invoke-static {v0, v3}, Lc7/x0;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Li3/h;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_9
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 159
    .line 160
    if-lt v3, v5, :cond_a

    .line 161
    .line 162
    invoke-static {v0, p2, v4}, Lc7/x0;->c(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/View;I)V

    .line 163
    .line 164
    .line 165
    :cond_a
    :goto_3
    iget-object p2, v1, Lj2/d0;->H:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {p1, v2, v0, p2}, Lj2/v;->a(Lj2/v;ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    :cond_b
    return-void
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
