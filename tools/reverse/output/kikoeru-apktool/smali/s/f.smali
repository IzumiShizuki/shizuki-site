.class public final Ls/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lf3/c;

.field public b:J

.field public final c:Ls/a0;

.field public final d:Lx0/e1;

.field public final e:Z

.field public f:Z

.field public g:J

.field public h:J

.field public final i:Li2/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lf3/c;JLy/d1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ls/f;->a:Lf3/c;

    .line 5
    .line 6
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Ls/f;->b:J

    .line 12
    .line 13
    new-instance p2, Ls/a0;

    .line 14
    .line 15
    invoke-static {p3, p4}, Lq1/h0;->B(J)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    invoke-direct {p2, p1, p3}, Ls/a0;-><init>(Landroid/content/Context;I)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Ls/f;->c:Ls/a0;

    .line 23
    .line 24
    sget-object p1, Lx0/r0;->c:Lx0/r0;

    .line 25
    .line 26
    new-instance p3, Lx0/e1;

    .line 27
    .line 28
    sget-object p4, Lub/a0;->a:Lub/a0;

    .line 29
    .line 30
    invoke-direct {p3, p4, p1}, Lx0/e1;-><init>(Ljava/lang/Object;Lx0/i2;)V

    .line 31
    .line 32
    .line 33
    iput-object p3, p0, Ls/f;->d:Lx0/e1;

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    iput-boolean p1, p0, Ls/f;->e:Z

    .line 37
    .line 38
    const-wide/16 p3, 0x0

    .line 39
    .line 40
    iput-wide p3, p0, Ls/f;->g:J

    .line 41
    .line 42
    const-wide/16 p3, -0x1

    .line 43
    .line 44
    iput-wide p3, p0, Ls/f;->h:J

    .line 45
    .line 46
    new-instance p1, Ld0/h;

    .line 47
    .line 48
    const/4 p3, 0x4

    .line 49
    invoke-direct {p1, p3, p0}, Ld0/h;-><init>(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p3, Lc2/e0;->a:Lc2/l;

    .line 53
    .line 54
    new-instance p3, Lc2/j0;

    .line 55
    .line 56
    const/4 p4, 0x0

    .line 57
    invoke-direct {p3, p4, p4, p4, p1}, Lc2/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 58
    .line 59
    .line 60
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    const/16 p4, 0x1f

    .line 63
    .line 64
    if-lt p1, p4, :cond_0

    .line 65
    .line 66
    new-instance p1, Ls/e0;

    .line 67
    .line 68
    invoke-direct {p1, p3, p0, p2}, Ls/e0;-><init>(Lc2/j0;Ls/f;Ls/a0;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance p1, Ls/e0;

    .line 73
    .line 74
    invoke-direct {p1, p3, p0, p2, p5}, Ls/e0;-><init>(Lc2/j0;Ls/f;Ls/a0;Ly/d1;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    iput-object p1, p0, Ls/f;->i:Li2/n;

    .line 78
    .line 79
    return-void
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
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
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Ls/f;->c:Ls/a0;

    .line 2
    .line 3
    iget-object v1, v0, Ls/a0;->d:Landroid/widget/EdgeEffect;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    xor-int/2addr v1, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    iget-object v4, v0, Ls/a0;->e:Landroid/widget/EdgeEffect;

    .line 20
    .line 21
    if-eqz v4, :cond_3

    .line 22
    .line 23
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v1, 0x0

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    :goto_1
    const/4 v1, 0x1

    .line 38
    :cond_3
    :goto_2
    iget-object v4, v0, Ls/a0;->f:Landroid/widget/EdgeEffect;

    .line 39
    .line 40
    if-eqz v4, :cond_6

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_5

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    const/4 v1, 0x0

    .line 55
    goto :goto_4

    .line 56
    :cond_5
    :goto_3
    const/4 v1, 0x1

    .line 57
    :cond_6
    :goto_4
    iget-object v0, v0, Ls/a0;->g:Landroid/widget/EdgeEffect;

    .line 58
    .line 59
    if-eqz v0, :cond_9

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_8

    .line 69
    .line 70
    if-eqz v1, :cond_7

    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_7
    const/4 v2, 0x0

    .line 74
    :cond_8
    :goto_5
    move v1, v2

    .line 75
    :cond_9
    if-eqz v1, :cond_a

    .line 76
    .line 77
    invoke-virtual {p0}, Ls/f;->d()V

    .line 78
    .line 79
    .line 80
    :cond_a
    return-void
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
.end method

.method public final b(JLu/b2;Lac/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    instance-of v5, v4, Ls/e;

    .line 10
    .line 11
    if-eqz v5, :cond_0

    .line 12
    .line 13
    move-object v5, v4

    .line 14
    check-cast v5, Ls/e;

    .line 15
    .line 16
    iget v6, v5, Ls/e;->h:I

    .line 17
    .line 18
    const/high16 v7, -0x80000000

    .line 19
    .line 20
    and-int v8, v6, v7

    .line 21
    .line 22
    if-eqz v8, :cond_0

    .line 23
    .line 24
    sub-int/2addr v6, v7

    .line 25
    iput v6, v5, Ls/e;->h:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v5, Ls/e;

    .line 29
    .line 30
    invoke-direct {v5, v0, v4}, Ls/e;-><init>(Ls/f;Lac/c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v4, v5, Ls/e;->f:Ljava/lang/Object;

    .line 34
    .line 35
    iget v6, v5, Ls/e;->h:I

    .line 36
    .line 37
    sget-object v7, Lub/a0;->a:Lub/a0;

    .line 38
    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v9, 0x1

    .line 41
    const/4 v10, 0x0

    .line 42
    if-eqz v6, :cond_3

    .line 43
    .line 44
    if-eq v6, v9, :cond_2

    .line 45
    .line 46
    if-ne v6, v8, :cond_1

    .line 47
    .line 48
    iget-wide v1, v5, Ls/e;->e:J

    .line 49
    .line 50
    iget-object v3, v5, Ls/e;->d:Ls/f;

    .line 51
    .line 52
    invoke-static {v4}, Lub/a;->f(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :cond_2
    invoke-static {v4}, Lub/a;->f(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object v7

    .line 69
    :cond_3
    invoke-static {v4}, Lub/a;->f(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-wide v11, v0, Ls/f;->g:J

    .line 73
    .line 74
    invoke-static {v11, v12}, Lp1/e;->e(J)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    sget-object v6, Lzb/a;->a:Lzb/a;

    .line 79
    .line 80
    if-eqz v4, :cond_5

    .line 81
    .line 82
    iput v9, v5, Ls/e;->h:I

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v4, Lu/b2;

    .line 88
    .line 89
    iget-object v3, v3, Lu/b2;->h:Lu/c2;

    .line 90
    .line 91
    invoke-direct {v4, v3, v5}, Lu/b2;-><init>(Lu/c2;Lyb/c;)V

    .line 92
    .line 93
    .line 94
    iput-wide v1, v4, Lu/b2;->g:J

    .line 95
    .line 96
    invoke-virtual {v4, v7}, Lu/b2;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    if-ne v1, v6, :cond_4

    .line 101
    .line 102
    goto/16 :goto_4

    .line 103
    .line 104
    :cond_4
    return-object v7

    .line 105
    :cond_5
    iget-object v4, v0, Ls/f;->c:Ls/a0;

    .line 106
    .line 107
    iget-object v9, v4, Ls/a0;->f:Landroid/widget/EdgeEffect;

    .line 108
    .line 109
    invoke-static {v9}, Ls/a0;->g(Landroid/widget/EdgeEffect;)Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    const/16 v11, 0x20

    .line 114
    .line 115
    iget-object v12, v0, Ls/f;->a:Lf3/c;

    .line 116
    .line 117
    if-eqz v9, :cond_6

    .line 118
    .line 119
    invoke-static {v1, v2}, Lf3/q;->b(J)F

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    cmpg-float v9, v9, v10

    .line 124
    .line 125
    if-gez v9, :cond_6

    .line 126
    .line 127
    invoke-virtual {v4}, Ls/a0;->c()Landroid/widget/EdgeEffect;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    invoke-static {v1, v2}, Lf3/q;->b(J)F

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    iget-wide v14, v0, Ls/f;->g:J

    .line 136
    .line 137
    shr-long/2addr v14, v11

    .line 138
    long-to-int v11, v14

    .line 139
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    invoke-static {v9, v13, v11, v12}, Ln7/e;->a(Landroid/widget/EdgeEffect;FFLf3/c;)F

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    goto :goto_1

    .line 148
    :cond_6
    iget-object v9, v4, Ls/a0;->g:Landroid/widget/EdgeEffect;

    .line 149
    .line 150
    invoke-static {v9}, Ls/a0;->g(Landroid/widget/EdgeEffect;)Z

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    if-eqz v9, :cond_7

    .line 155
    .line 156
    invoke-static {v1, v2}, Lf3/q;->b(J)F

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    cmpl-float v9, v9, v10

    .line 161
    .line 162
    if-lez v9, :cond_7

    .line 163
    .line 164
    invoke-virtual {v4}, Ls/a0;->d()Landroid/widget/EdgeEffect;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    invoke-static {v1, v2}, Lf3/q;->b(J)F

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    neg-float v13, v13

    .line 173
    iget-wide v14, v0, Ls/f;->g:J

    .line 174
    .line 175
    shr-long/2addr v14, v11

    .line 176
    long-to-int v11, v14

    .line 177
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    invoke-static {v9, v13, v11, v12}, Ln7/e;->a(Landroid/widget/EdgeEffect;FFLf3/c;)F

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    neg-float v9, v9

    .line 186
    goto :goto_1

    .line 187
    :cond_7
    const/4 v9, 0x0

    .line 188
    :goto_1
    iget-object v11, v4, Ls/a0;->d:Landroid/widget/EdgeEffect;

    .line 189
    .line 190
    invoke-static {v11}, Ls/a0;->g(Landroid/widget/EdgeEffect;)Z

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    if-eqz v11, :cond_8

    .line 195
    .line 196
    invoke-static {v1, v2}, Lf3/q;->c(J)F

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    cmpg-float v11, v11, v10

    .line 201
    .line 202
    if-gez v11, :cond_8

    .line 203
    .line 204
    invoke-virtual {v4}, Ls/a0;->e()Landroid/widget/EdgeEffect;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-static {v1, v2}, Lf3/q;->c(J)F

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    const-wide v15, 0xffffffffL

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    iget-wide v13, v0, Ls/f;->g:J

    .line 218
    .line 219
    and-long/2addr v13, v15

    .line 220
    long-to-int v14, v13

    .line 221
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 222
    .line 223
    .line 224
    move-result v13

    .line 225
    invoke-static {v4, v11, v13, v12}, Ln7/e;->a(Landroid/widget/EdgeEffect;FFLf3/c;)F

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    goto :goto_2

    .line 230
    :cond_8
    const-wide v15, 0xffffffffL

    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    iget-object v11, v4, Ls/a0;->e:Landroid/widget/EdgeEffect;

    .line 236
    .line 237
    invoke-static {v11}, Ls/a0;->g(Landroid/widget/EdgeEffect;)Z

    .line 238
    .line 239
    .line 240
    move-result v11

    .line 241
    if-eqz v11, :cond_9

    .line 242
    .line 243
    invoke-static {v1, v2}, Lf3/q;->c(J)F

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    cmpl-float v11, v11, v10

    .line 248
    .line 249
    if-lez v11, :cond_9

    .line 250
    .line 251
    invoke-virtual {v4}, Ls/a0;->b()Landroid/widget/EdgeEffect;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-static {v1, v2}, Lf3/q;->c(J)F

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    neg-float v11, v11

    .line 260
    iget-wide v13, v0, Ls/f;->g:J

    .line 261
    .line 262
    and-long/2addr v13, v15

    .line 263
    long-to-int v14, v13

    .line 264
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 265
    .line 266
    .line 267
    move-result v13

    .line 268
    invoke-static {v4, v11, v13, v12}, Ln7/e;->a(Landroid/widget/EdgeEffect;FFLf3/c;)F

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    neg-float v4, v4

    .line 273
    goto :goto_2

    .line 274
    :cond_9
    const/4 v4, 0x0

    .line 275
    :goto_2
    invoke-static {v9, v4}, Lpc/f0;->c(FF)J

    .line 276
    .line 277
    .line 278
    move-result-wide v11

    .line 279
    const-wide/16 v13, 0x0

    .line 280
    .line 281
    cmp-long v4, v11, v13

    .line 282
    .line 283
    if-nez v4, :cond_a

    .line 284
    .line 285
    goto :goto_3

    .line 286
    :cond_a
    invoke-virtual {v0}, Ls/f;->d()V

    .line 287
    .line 288
    .line 289
    :goto_3
    invoke-static {v1, v2, v11, v12}, Lf3/q;->d(JJ)J

    .line 290
    .line 291
    .line 292
    move-result-wide v1

    .line 293
    iput-object v0, v5, Ls/e;->d:Ls/f;

    .line 294
    .line 295
    iput-wide v1, v5, Ls/e;->e:J

    .line 296
    .line 297
    iput v8, v5, Ls/e;->h:I

    .line 298
    .line 299
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    new-instance v4, Lu/b2;

    .line 303
    .line 304
    iget-object v3, v3, Lu/b2;->h:Lu/c2;

    .line 305
    .line 306
    invoke-direct {v4, v3, v5}, Lu/b2;-><init>(Lu/c2;Lyb/c;)V

    .line 307
    .line 308
    .line 309
    iput-wide v1, v4, Lu/b2;->g:J

    .line 310
    .line 311
    invoke-virtual {v4, v7}, Lu/b2;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    if-ne v4, v6, :cond_b

    .line 316
    .line 317
    :goto_4
    return-object v6

    .line 318
    :cond_b
    move-object v3, v0

    .line 319
    :goto_5
    check-cast v4, Lf3/q;

    .line 320
    .line 321
    iget-wide v4, v4, Lf3/q;->a:J

    .line 322
    .line 323
    invoke-static {v1, v2, v4, v5}, Lf3/q;->d(JJ)J

    .line 324
    .line 325
    .line 326
    move-result-wide v1

    .line 327
    const/4 v4, 0x0

    .line 328
    iput-boolean v4, v3, Ls/f;->f:Z

    .line 329
    .line 330
    iget-object v4, v3, Ls/f;->c:Ls/a0;

    .line 331
    .line 332
    invoke-static {v1, v2}, Lf3/q;->b(J)F

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    const/16 v6, 0x1f

    .line 337
    .line 338
    cmpl-float v5, v5, v10

    .line 339
    .line 340
    if-lez v5, :cond_d

    .line 341
    .line 342
    invoke-virtual {v4}, Ls/a0;->c()Landroid/widget/EdgeEffect;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    invoke-static {v1, v2}, Lf3/q;->b(J)F

    .line 347
    .line 348
    .line 349
    move-result v8

    .line 350
    invoke-static {v8}, Llc/b;->R(F)I

    .line 351
    .line 352
    .line 353
    move-result v8

    .line 354
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 355
    .line 356
    if-lt v9, v6, :cond_c

    .line 357
    .line 358
    invoke-virtual {v5, v8}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 359
    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_c
    invoke-virtual {v5}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 363
    .line 364
    .line 365
    move-result v9

    .line 366
    if-eqz v9, :cond_f

    .line 367
    .line 368
    invoke-virtual {v5, v8}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 369
    .line 370
    .line 371
    goto :goto_6

    .line 372
    :cond_d
    invoke-static {v1, v2}, Lf3/q;->b(J)F

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    cmpg-float v5, v5, v10

    .line 377
    .line 378
    if-gez v5, :cond_f

    .line 379
    .line 380
    invoke-virtual {v4}, Ls/a0;->d()Landroid/widget/EdgeEffect;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    invoke-static {v1, v2}, Lf3/q;->b(J)F

    .line 385
    .line 386
    .line 387
    move-result v8

    .line 388
    invoke-static {v8}, Llc/b;->R(F)I

    .line 389
    .line 390
    .line 391
    move-result v8

    .line 392
    neg-int v8, v8

    .line 393
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 394
    .line 395
    if-lt v9, v6, :cond_e

    .line 396
    .line 397
    invoke-virtual {v5, v8}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 398
    .line 399
    .line 400
    goto :goto_6

    .line 401
    :cond_e
    invoke-virtual {v5}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 402
    .line 403
    .line 404
    move-result v9

    .line 405
    if-eqz v9, :cond_f

    .line 406
    .line 407
    invoke-virtual {v5, v8}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 408
    .line 409
    .line 410
    :cond_f
    :goto_6
    invoke-static {v1, v2}, Lf3/q;->c(J)F

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    cmpl-float v5, v5, v10

    .line 415
    .line 416
    if-lez v5, :cond_11

    .line 417
    .line 418
    invoke-virtual {v4}, Ls/a0;->e()Landroid/widget/EdgeEffect;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-static {v1, v2}, Lf3/q;->c(J)F

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    invoke-static {v1}, Llc/b;->R(F)I

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 431
    .line 432
    if-lt v2, v6, :cond_10

    .line 433
    .line 434
    invoke-virtual {v4, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 435
    .line 436
    .line 437
    goto :goto_7

    .line 438
    :cond_10
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    if-eqz v2, :cond_13

    .line 443
    .line 444
    invoke-virtual {v4, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 445
    .line 446
    .line 447
    goto :goto_7

    .line 448
    :cond_11
    invoke-static {v1, v2}, Lf3/q;->c(J)F

    .line 449
    .line 450
    .line 451
    move-result v5

    .line 452
    cmpg-float v5, v5, v10

    .line 453
    .line 454
    if-gez v5, :cond_13

    .line 455
    .line 456
    invoke-virtual {v4}, Ls/a0;->b()Landroid/widget/EdgeEffect;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    invoke-static {v1, v2}, Lf3/q;->c(J)F

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    invoke-static {v1}, Llc/b;->R(F)I

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    neg-int v1, v1

    .line 469
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 470
    .line 471
    if-lt v2, v6, :cond_12

    .line 472
    .line 473
    invoke-virtual {v4, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 474
    .line 475
    .line 476
    goto :goto_7

    .line 477
    :cond_12
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    if-eqz v2, :cond_13

    .line 482
    .line 483
    invoke-virtual {v4, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 484
    .line 485
    .line 486
    :cond_13
    :goto_7
    invoke-virtual {v3}, Ls/f;->a()V

    .line 487
    .line 488
    .line 489
    return-object v7
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
.end method

.method public final c()J
    .locals 8

    .line 1
    iget-wide v0, p0, Ls/f;->b:J

    .line 2
    .line 3
    const-wide v2, 0x7fffffff7fffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long/2addr v2, v0

    .line 9
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v6, v2, v4

    .line 15
    .line 16
    if-eqz v6, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-wide v0, p0, Ls/f;->g:J

    .line 20
    .line 21
    invoke-static {v0, v1}, Lnh/a;->l(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    :goto_0
    const/16 v2, 0x20

    .line 26
    .line 27
    shr-long v3, v0, v2

    .line 28
    .line 29
    long-to-int v4, v3

    .line 30
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iget-wide v4, p0, Ls/f;->g:J

    .line 35
    .line 36
    shr-long/2addr v4, v2

    .line 37
    long-to-int v5, v4

    .line 38
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    div-float/2addr v3, v4

    .line 43
    const-wide v4, 0xffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v0, v4

    .line 49
    long-to-int v1, v0

    .line 50
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-wide v6, p0, Ls/f;->g:J

    .line 55
    .line 56
    and-long/2addr v6, v4

    .line 57
    long-to-int v1, v6

    .line 58
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    div-float/2addr v0, v1

    .line 63
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    int-to-long v6, v1

    .line 68
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    int-to-long v0, v0

    .line 73
    shl-long v2, v6, v2

    .line 74
    .line 75
    and-long/2addr v0, v4

    .line 76
    or-long/2addr v0, v2

    .line 77
    return-wide v0
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
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ls/f;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ls/f;->d:Lx0/e1;

    .line 6
    .line 7
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method public final e(J)F
    .locals 8

    .line 1
    invoke-virtual {p0}, Ls/f;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v1, v0

    .line 9
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-wide v1, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p1, v1

    .line 19
    long-to-int p2, p1

    .line 20
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-wide v3, p0, Ls/f;->g:J

    .line 25
    .line 26
    and-long/2addr v3, v1

    .line 27
    long-to-int v4, v3

    .line 28
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    div-float/2addr p1, v3

    .line 33
    iget-object v3, p0, Ls/f;->c:Ls/a0;

    .line 34
    .line 35
    invoke-virtual {v3}, Ls/a0;->b()Landroid/widget/EdgeEffect;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    neg-float p1, p1

    .line 40
    const/4 v4, 0x1

    .line 41
    int-to-float v4, v4

    .line 42
    sub-float/2addr v4, v0

    .line 43
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/16 v5, 0x1f

    .line 46
    .line 47
    if-lt v0, v5, :cond_0

    .line 48
    .line 49
    invoke-static {v3, p1, v4}, Lm3/f;->c(Landroid/widget/EdgeEffect;FF)F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v3, p1, v4}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 55
    .line 56
    .line 57
    :goto_0
    neg-float p1, p1

    .line 58
    iget-wide v6, p0, Ls/f;->g:J

    .line 59
    .line 60
    and-long/2addr v1, v6

    .line 61
    long-to-int v2, v1

    .line 62
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    mul-float v1, v1, p1

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    if-lt v0, v5, :cond_1

    .line 70
    .line 71
    invoke-static {v3}, Lm3/f;->b(Landroid/widget/EdgeEffect;)F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    const/4 v0, 0x0

    .line 77
    :goto_1
    cmpg-float p1, v0, p1

    .line 78
    .line 79
    if-nez p1, :cond_2

    .line 80
    .line 81
    return v1

    .line 82
    :cond_2
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    return p1
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
.end method

.method public final f(J)F
    .locals 7

    .line 1
    invoke-virtual {p0}, Ls/f;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    and-long/2addr v0, v2

    .line 11
    long-to-int v1, v0

    .line 12
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0x20

    .line 17
    .line 18
    shr-long/2addr p1, v1

    .line 19
    long-to-int p2, p1

    .line 20
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-wide v2, p0, Ls/f;->g:J

    .line 25
    .line 26
    shr-long/2addr v2, v1

    .line 27
    long-to-int v3, v2

    .line 28
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    div-float/2addr p1, v2

    .line 33
    iget-object v2, p0, Ls/f;->c:Ls/a0;

    .line 34
    .line 35
    invoke-virtual {v2}, Ls/a0;->c()Landroid/widget/EdgeEffect;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x1

    .line 40
    int-to-float v3, v3

    .line 41
    sub-float/2addr v3, v0

    .line 42
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 43
    .line 44
    const/16 v4, 0x1f

    .line 45
    .line 46
    if-lt v0, v4, :cond_0

    .line 47
    .line 48
    invoke-static {v2, p1, v3}, Lm3/f;->c(Landroid/widget/EdgeEffect;FF)F

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v2, p1, v3}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 54
    .line 55
    .line 56
    :goto_0
    iget-wide v5, p0, Ls/f;->g:J

    .line 57
    .line 58
    shr-long/2addr v5, v1

    .line 59
    long-to-int v1, v5

    .line 60
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    mul-float v1, v1, p1

    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    if-lt v0, v4, :cond_1

    .line 68
    .line 69
    invoke-static {v2}, Lm3/f;->b(Landroid/widget/EdgeEffect;)F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    const/4 v0, 0x0

    .line 75
    :goto_1
    cmpg-float p1, v0, p1

    .line 76
    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    return v1

    .line 80
    :cond_2
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    return p1
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
.end method

.method public final g(J)F
    .locals 7

    .line 1
    invoke-virtual {p0}, Ls/f;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    and-long/2addr v0, v2

    .line 11
    long-to-int v1, v0

    .line 12
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0x20

    .line 17
    .line 18
    shr-long/2addr p1, v1

    .line 19
    long-to-int p2, p1

    .line 20
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-wide v2, p0, Ls/f;->g:J

    .line 25
    .line 26
    shr-long/2addr v2, v1

    .line 27
    long-to-int v3, v2

    .line 28
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    div-float/2addr p1, v2

    .line 33
    iget-object v2, p0, Ls/f;->c:Ls/a0;

    .line 34
    .line 35
    invoke-virtual {v2}, Ls/a0;->d()Landroid/widget/EdgeEffect;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    neg-float p1, p1

    .line 40
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    .line 42
    const/16 v4, 0x1f

    .line 43
    .line 44
    if-lt v3, v4, :cond_0

    .line 45
    .line 46
    invoke-static {v2, p1, v0}, Lm3/f;->c(Landroid/widget/EdgeEffect;FF)F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v2, p1, v0}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 52
    .line 53
    .line 54
    :goto_0
    neg-float p1, p1

    .line 55
    iget-wide v5, p0, Ls/f;->g:J

    .line 56
    .line 57
    shr-long v0, v5, v1

    .line 58
    .line 59
    long-to-int v1, v0

    .line 60
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    mul-float v0, v0, p1

    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    if-lt v3, v4, :cond_1

    .line 68
    .line 69
    invoke-static {v2}, Lm3/f;->b(Landroid/widget/EdgeEffect;)F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    const/4 v1, 0x0

    .line 75
    :goto_1
    cmpg-float p1, v1, p1

    .line 76
    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    return v0

    .line 80
    :cond_2
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    return p1
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
.end method

.method public final h(J)F
    .locals 8

    .line 1
    invoke-virtual {p0}, Ls/f;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v1, v0

    .line 9
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-wide v1, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p1, v1

    .line 19
    long-to-int p2, p1

    .line 20
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-wide v3, p0, Ls/f;->g:J

    .line 25
    .line 26
    and-long/2addr v3, v1

    .line 27
    long-to-int v4, v3

    .line 28
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    div-float/2addr p1, v3

    .line 33
    iget-object v3, p0, Ls/f;->c:Ls/a0;

    .line 34
    .line 35
    invoke-virtual {v3}, Ls/a0;->e()Landroid/widget/EdgeEffect;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v5, 0x1f

    .line 42
    .line 43
    if-lt v4, v5, :cond_0

    .line 44
    .line 45
    invoke-static {v3, p1, v0}, Lm3/f;->c(Landroid/widget/EdgeEffect;FF)F

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v3, p1, v0}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-wide v6, p0, Ls/f;->g:J

    .line 54
    .line 55
    and-long/2addr v1, v6

    .line 56
    long-to-int v0, v1

    .line 57
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    mul-float v0, v0, p1

    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    if-lt v4, v5, :cond_1

    .line 65
    .line 66
    invoke-static {v3}, Lm3/f;->b(Landroid/widget/EdgeEffect;)F

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    const/4 v1, 0x0

    .line 72
    :goto_1
    cmpg-float p1, v1, p1

    .line 73
    .line 74
    if-nez p1, :cond_2

    .line 75
    .line 76
    return v0

    .line 77
    :cond_2
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    return p1
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
.end method

.method public final i(J)V
    .locals 11

    .line 1
    iget-wide v0, p0, Ls/f;->g:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Lp1/e;->a(JJ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-wide v1, p0, Ls/f;->g:J

    .line 10
    .line 11
    invoke-static {p1, p2, v1, v2}, Lp1/e;->a(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput-wide p1, p0, Ls/f;->g:J

    .line 16
    .line 17
    if-nez v1, :cond_7

    .line 18
    .line 19
    const/16 v2, 0x20

    .line 20
    .line 21
    shr-long v3, p1, v2

    .line 22
    .line 23
    long-to-int v4, v3

    .line 24
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {v3}, Llc/b;->R(F)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-wide v4, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr p1, v4

    .line 38
    long-to-int p2, p1

    .line 39
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {p1}, Llc/b;->R(F)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    int-to-long v6, v3

    .line 48
    shl-long/2addr v6, v2

    .line 49
    int-to-long p1, p1

    .line 50
    and-long/2addr p1, v4

    .line 51
    or-long/2addr p1, v6

    .line 52
    iget-object v3, p0, Ls/f;->c:Ls/a0;

    .line 53
    .line 54
    iput-wide p1, v3, Ls/a0;->c:J

    .line 55
    .line 56
    iget-object v6, v3, Ls/a0;->d:Landroid/widget/EdgeEffect;

    .line 57
    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    shr-long v7, p1, v2

    .line 61
    .line 62
    long-to-int v8, v7

    .line 63
    and-long v9, p1, v4

    .line 64
    .line 65
    long-to-int v7, v9

    .line 66
    invoke-virtual {v6, v8, v7}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 67
    .line 68
    .line 69
    :cond_0
    iget-object v6, v3, Ls/a0;->e:Landroid/widget/EdgeEffect;

    .line 70
    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    shr-long v7, p1, v2

    .line 74
    .line 75
    long-to-int v8, v7

    .line 76
    and-long v9, p1, v4

    .line 77
    .line 78
    long-to-int v7, v9

    .line 79
    invoke-virtual {v6, v8, v7}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 80
    .line 81
    .line 82
    :cond_1
    iget-object v6, v3, Ls/a0;->f:Landroid/widget/EdgeEffect;

    .line 83
    .line 84
    if-eqz v6, :cond_2

    .line 85
    .line 86
    and-long v7, p1, v4

    .line 87
    .line 88
    long-to-int v8, v7

    .line 89
    shr-long v9, p1, v2

    .line 90
    .line 91
    long-to-int v7, v9

    .line 92
    invoke-virtual {v6, v8, v7}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 93
    .line 94
    .line 95
    :cond_2
    iget-object v6, v3, Ls/a0;->g:Landroid/widget/EdgeEffect;

    .line 96
    .line 97
    if-eqz v6, :cond_3

    .line 98
    .line 99
    and-long v7, p1, v4

    .line 100
    .line 101
    long-to-int v8, v7

    .line 102
    shr-long v9, p1, v2

    .line 103
    .line 104
    long-to-int v7, v9

    .line 105
    invoke-virtual {v6, v8, v7}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 106
    .line 107
    .line 108
    :cond_3
    iget-object v6, v3, Ls/a0;->h:Landroid/widget/EdgeEffect;

    .line 109
    .line 110
    if-eqz v6, :cond_4

    .line 111
    .line 112
    shr-long v7, p1, v2

    .line 113
    .line 114
    long-to-int v8, v7

    .line 115
    and-long v9, p1, v4

    .line 116
    .line 117
    long-to-int v7, v9

    .line 118
    invoke-virtual {v6, v8, v7}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 119
    .line 120
    .line 121
    :cond_4
    iget-object v6, v3, Ls/a0;->i:Landroid/widget/EdgeEffect;

    .line 122
    .line 123
    if-eqz v6, :cond_5

    .line 124
    .line 125
    shr-long v7, p1, v2

    .line 126
    .line 127
    long-to-int v8, v7

    .line 128
    and-long v9, p1, v4

    .line 129
    .line 130
    long-to-int v7, v9

    .line 131
    invoke-virtual {v6, v8, v7}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 132
    .line 133
    .line 134
    :cond_5
    iget-object v6, v3, Ls/a0;->j:Landroid/widget/EdgeEffect;

    .line 135
    .line 136
    if-eqz v6, :cond_6

    .line 137
    .line 138
    and-long v7, p1, v4

    .line 139
    .line 140
    long-to-int v8, v7

    .line 141
    shr-long v9, p1, v2

    .line 142
    .line 143
    long-to-int v7, v9

    .line 144
    invoke-virtual {v6, v8, v7}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 145
    .line 146
    .line 147
    :cond_6
    iget-object v3, v3, Ls/a0;->k:Landroid/widget/EdgeEffect;

    .line 148
    .line 149
    if-eqz v3, :cond_7

    .line 150
    .line 151
    and-long/2addr v4, p1

    .line 152
    long-to-int v5, v4

    .line 153
    shr-long/2addr p1, v2

    .line 154
    long-to-int p2, p1

    .line 155
    invoke-virtual {v3, v5, p2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 156
    .line 157
    .line 158
    :cond_7
    if-nez v0, :cond_8

    .line 159
    .line 160
    if-nez v1, :cond_8

    .line 161
    .line 162
    invoke-virtual {p0}, Ls/f;->a()V

    .line 163
    .line 164
    .line 165
    :cond_8
    return-void
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
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
