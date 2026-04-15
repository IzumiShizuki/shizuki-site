.class public final Ly/s1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final u:Ljava/util/WeakHashMap;


# instance fields
.field public final a:Ly/c;

.field public final b:Ly/c;

.field public final c:Ly/c;

.field public final d:Ly/c;

.field public final e:Ly/c;

.field public final f:Ly/c;

.field public final g:Ly/c;

.field public final h:Ly/c;

.field public final i:Ly/c;

.field public final j:Ly/p1;

.field public final k:Ly/p1;

.field public final l:Ly/p1;

.field public final m:Ly/p1;

.field public final n:Ly/p1;

.field public final o:Ly/p1;

.field public final p:Ly/p1;

.field public final q:Ly/p1;

.field public final r:Z

.field public s:I

.field public final t:Ly/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly/s1;->u:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
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
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "captionBar"

    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-static {v2, v1}, Ly/o0;->d(ILjava/lang/String;)Ly/c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Ly/s1;->a:Ly/c;

    .line 14
    .line 15
    const/16 v1, 0x80

    .line 16
    .line 17
    const-string v3, "displayCutout"

    .line 18
    .line 19
    invoke-static {v1, v3}, Ly/o0;->d(ILjava/lang/String;)Ly/c;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, v0, Ly/s1;->b:Ly/c;

    .line 24
    .line 25
    const-string v3, "ime"

    .line 26
    .line 27
    const/16 v4, 0x8

    .line 28
    .line 29
    invoke-static {v4, v3}, Ly/o0;->d(ILjava/lang/String;)Ly/c;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iput-object v3, v0, Ly/s1;->c:Ly/c;

    .line 34
    .line 35
    const/16 v5, 0x20

    .line 36
    .line 37
    const-string v6, "mandatorySystemGestures"

    .line 38
    .line 39
    invoke-static {v5, v6}, Ly/o0;->d(ILjava/lang/String;)Ly/c;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    iput-object v5, v0, Ly/s1;->d:Ly/c;

    .line 44
    .line 45
    const-string v6, "navigationBars"

    .line 46
    .line 47
    const/4 v7, 0x2

    .line 48
    invoke-static {v7, v6}, Ly/o0;->d(ILjava/lang/String;)Ly/c;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    iput-object v6, v0, Ly/s1;->e:Ly/c;

    .line 53
    .line 54
    const-string v6, "statusBars"

    .line 55
    .line 56
    const/4 v8, 0x1

    .line 57
    invoke-static {v8, v6}, Ly/o0;->d(ILjava/lang/String;)Ly/c;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iput-object v6, v0, Ly/s1;->f:Ly/c;

    .line 62
    .line 63
    const-string v6, "systemBars"

    .line 64
    .line 65
    const/16 v9, 0x207

    .line 66
    .line 67
    invoke-static {v9, v6}, Ly/o0;->d(ILjava/lang/String;)Ly/c;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    iput-object v6, v0, Ly/s1;->g:Ly/c;

    .line 72
    .line 73
    const/16 v10, 0x10

    .line 74
    .line 75
    const-string v11, "systemGestures"

    .line 76
    .line 77
    invoke-static {v10, v11}, Ly/o0;->d(ILjava/lang/String;)Ly/c;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    iput-object v10, v0, Ly/s1;->h:Ly/c;

    .line 82
    .line 83
    const-string v11, "tappableElement"

    .line 84
    .line 85
    const/16 v12, 0x40

    .line 86
    .line 87
    invoke-static {v12, v11}, Ly/o0;->d(ILjava/lang/String;)Ly/c;

    .line 88
    .line 89
    .line 90
    move-result-object v11

    .line 91
    iput-object v11, v0, Ly/s1;->i:Ly/c;

    .line 92
    .line 93
    new-instance v13, Ly/p1;

    .line 94
    .line 95
    new-instance v14, Ly/u0;

    .line 96
    .line 97
    const/4 v15, 0x0

    .line 98
    invoke-direct {v14, v15, v15, v15, v15}, Ly/u0;-><init>(IIII)V

    .line 99
    .line 100
    .line 101
    const-string v15, "waterfall"

    .line 102
    .line 103
    invoke-direct {v13, v14, v15}, Ly/p1;-><init>(Ly/u0;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iput-object v13, v0, Ly/s1;->j:Ly/p1;

    .line 107
    .line 108
    new-instance v14, Ly/n1;

    .line 109
    .line 110
    invoke-direct {v14, v6, v3}, Ly/n1;-><init>(Ly/r1;Ly/r1;)V

    .line 111
    .line 112
    .line 113
    new-instance v3, Ly/n1;

    .line 114
    .line 115
    invoke-direct {v3, v14, v1}, Ly/n1;-><init>(Ly/r1;Ly/r1;)V

    .line 116
    .line 117
    .line 118
    new-instance v1, Ly/n1;

    .line 119
    .line 120
    invoke-direct {v1, v11, v5}, Ly/n1;-><init>(Ly/r1;Ly/r1;)V

    .line 121
    .line 122
    .line 123
    new-instance v3, Ly/n1;

    .line 124
    .line 125
    invoke-direct {v3, v1, v10}, Ly/n1;-><init>(Ly/r1;Ly/r1;)V

    .line 126
    .line 127
    .line 128
    new-instance v1, Ly/n1;

    .line 129
    .line 130
    invoke-direct {v1, v3, v13}, Ly/n1;-><init>(Ly/r1;Ly/r1;)V

    .line 131
    .line 132
    .line 133
    const-string v1, "captionBarIgnoringVisibility"

    .line 134
    .line 135
    invoke-static {v2, v1}, Ly/o0;->e(ILjava/lang/String;)Ly/p1;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iput-object v1, v0, Ly/s1;->k:Ly/p1;

    .line 140
    .line 141
    const-string v1, "navigationBarsIgnoringVisibility"

    .line 142
    .line 143
    invoke-static {v7, v1}, Ly/o0;->e(ILjava/lang/String;)Ly/p1;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iput-object v1, v0, Ly/s1;->l:Ly/p1;

    .line 148
    .line 149
    const-string v1, "statusBarsIgnoringVisibility"

    .line 150
    .line 151
    invoke-static {v8, v1}, Ly/o0;->e(ILjava/lang/String;)Ly/p1;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iput-object v1, v0, Ly/s1;->m:Ly/p1;

    .line 156
    .line 157
    const-string v1, "systemBarsIgnoringVisibility"

    .line 158
    .line 159
    invoke-static {v9, v1}, Ly/o0;->e(ILjava/lang/String;)Ly/p1;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    iput-object v1, v0, Ly/s1;->n:Ly/p1;

    .line 164
    .line 165
    const-string v1, "tappableElementIgnoringVisibility"

    .line 166
    .line 167
    invoke-static {v12, v1}, Ly/o0;->e(ILjava/lang/String;)Ly/p1;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    iput-object v1, v0, Ly/s1;->o:Ly/p1;

    .line 172
    .line 173
    const-string v1, "imeAnimationTarget"

    .line 174
    .line 175
    invoke-static {v4, v1}, Ly/o0;->e(ILjava/lang/String;)Ly/p1;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    iput-object v1, v0, Ly/s1;->p:Ly/p1;

    .line 180
    .line 181
    const-string v1, "imeAnimationSource"

    .line 182
    .line 183
    invoke-static {v4, v1}, Ly/o0;->e(ILjava/lang/String;)Ly/p1;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iput-object v1, v0, Ly/s1;->q:Ly/p1;

    .line 188
    .line 189
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    instance-of v2, v1, Landroid/view/View;

    .line 194
    .line 195
    const/4 v3, 0x0

    .line 196
    if-eqz v2, :cond_0

    .line 197
    .line 198
    check-cast v1, Landroid/view/View;

    .line 199
    .line 200
    goto :goto_0

    .line 201
    :cond_0
    move-object v1, v3

    .line 202
    :goto_0
    if-eqz v1, :cond_1

    .line 203
    .line 204
    const v2, 0x7f070032

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    goto :goto_1

    .line 212
    :cond_1
    move-object v1, v3

    .line 213
    :goto_1
    instance-of v2, v1, Ljava/lang/Boolean;

    .line 214
    .line 215
    if-eqz v2, :cond_2

    .line 216
    .line 217
    move-object v3, v1

    .line 218
    check-cast v3, Ljava/lang/Boolean;

    .line 219
    .line 220
    :cond_2
    if-eqz v3, :cond_3

    .line 221
    .line 222
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    :cond_3
    iput-boolean v8, v0, Ly/s1;->r:Z

    .line 227
    .line 228
    new-instance v1, Ly/r0;

    .line 229
    .line 230
    invoke-direct {v1, v0}, Ly/r0;-><init>(Ly/s1;)V

    .line 231
    .line 232
    .line 233
    iput-object v1, v0, Ly/s1;->t:Ly/r0;

    .line 234
    .line 235
    return-void
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public static a(Ly/s1;Lu3/w0;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ly/s1;->a:Ly/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lu3/w0;I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ly/s1;->c:Ly/c;

    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lu3/w0;I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ly/s1;->b:Ly/c;

    .line 13
    .line 14
    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lu3/w0;I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ly/s1;->e:Ly/c;

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lu3/w0;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Ly/s1;->f:Ly/c;

    .line 23
    .line 24
    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lu3/w0;I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Ly/s1;->g:Ly/c;

    .line 28
    .line 29
    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lu3/w0;I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Ly/s1;->h:Ly/c;

    .line 33
    .line 34
    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lu3/w0;I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Ly/s1;->i:Ly/c;

    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lu3/w0;I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Ly/s1;->d:Ly/c;

    .line 43
    .line 44
    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lu3/w0;I)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Ly/s1;->k:Ly/p1;

    .line 48
    .line 49
    const/4 v2, 0x4

    .line 50
    iget-object v3, p1, Lu3/w0;->a:Lu3/t0;

    .line 51
    .line 52
    invoke-virtual {v3, v2}, Lu3/t0;->h(I)Lp3/b;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2}, Ly/d;->q(Lp3/b;)Ly/u0;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v2}, Ly/p1;->f(Ly/u0;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Ly/s1;->l:Ly/p1;

    .line 64
    .line 65
    iget-object v2, p1, Lu3/w0;->a:Lu3/t0;

    .line 66
    .line 67
    const/4 v3, 0x2

    .line 68
    invoke-virtual {v2, v3}, Lu3/t0;->h(I)Lp3/b;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2}, Ly/d;->q(Lp3/b;)Ly/u0;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v0, v2}, Ly/p1;->f(Ly/u0;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Ly/s1;->m:Ly/p1;

    .line 80
    .line 81
    iget-object v2, p1, Lu3/w0;->a:Lu3/t0;

    .line 82
    .line 83
    const/4 v3, 0x1

    .line 84
    invoke-virtual {v2, v3}, Lu3/t0;->h(I)Lp3/b;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v2}, Ly/d;->q(Lp3/b;)Ly/u0;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v0, v2}, Ly/p1;->f(Ly/u0;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Ly/s1;->n:Ly/p1;

    .line 96
    .line 97
    const/16 v2, 0x207

    .line 98
    .line 99
    iget-object v4, p1, Lu3/w0;->a:Lu3/t0;

    .line 100
    .line 101
    invoke-virtual {v4, v2}, Lu3/t0;->h(I)Lp3/b;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-static {v2}, Ly/d;->q(Lp3/b;)Ly/u0;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v0, v2}, Ly/p1;->f(Ly/u0;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Ly/s1;->o:Ly/p1;

    .line 113
    .line 114
    const/16 v2, 0x40

    .line 115
    .line 116
    iget-object v4, p1, Lu3/w0;->a:Lu3/t0;

    .line 117
    .line 118
    invoke-virtual {v4, v2}, Lu3/t0;->h(I)Lp3/b;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {v2}, Ly/d;->q(Lp3/b;)Ly/u0;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v0, v2}, Ly/p1;->f(Ly/u0;)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p1, Lu3/w0;->a:Lu3/t0;

    .line 130
    .line 131
    invoke-virtual {p1}, Lu3/t0;->f()Lu3/c;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-eqz p1, :cond_0

    .line 136
    .line 137
    invoke-virtual {p1}, Lu3/c;->a()Lp3/b;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object p0, p0, Ly/s1;->j:Ly/p1;

    .line 142
    .line 143
    invoke-static {p1}, Ly/d;->q(Lp3/b;)Ly/u0;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p0, p1}, Ly/p1;->f(Ly/u0;)V

    .line 148
    .line 149
    .line 150
    :cond_0
    sget-object p0, Lh1/n;->c:Ljava/lang/Object;

    .line 151
    .line 152
    monitor-enter p0

    .line 153
    :try_start_0
    sget-object p1, Lh1/n;->j:Lh1/b;

    .line 154
    .line 155
    iget-object p1, p1, Lh1/c;->h:Lo/l0;

    .line 156
    .line 157
    if-eqz p1, :cond_1

    .line 158
    .line 159
    invoke-virtual {p1}, Lo/l0;->h()Z

    .line 160
    .line 161
    .line 162
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    if-ne p1, v3, :cond_1

    .line 164
    .line 165
    const/4 v1, 0x1

    .line 166
    :cond_1
    monitor-exit p0

    .line 167
    if-eqz v1, :cond_2

    .line 168
    .line 169
    invoke-static {}, Lh1/n;->a()V

    .line 170
    .line 171
    .line 172
    :cond_2
    return-void

    .line 173
    :catchall_0
    move-exception p1

    .line 174
    monitor-exit p0

    .line 175
    throw p1
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
