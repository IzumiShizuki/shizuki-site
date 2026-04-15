.class public final synthetic Lb5/h;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lb5/h;->a:I

    iput-object p2, p0, Lb5/h;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb5/h;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lb7/c2;Lb7/t1;Ljava/lang/Runnable;)V
    .locals 0

    .line 2
    const/4 p2, 0x3

    iput p2, p0, Lb5/h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/h;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb5/h;->c:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp5/y;

    .line 4
    .line 5
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lv4/f;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    monitor-exit v1

    .line 11
    iget-object v0, v0, Lp5/y;->c:Lv4/s;

    .line 12
    .line 13
    sget v2, Lp4/c0;->a:I

    .line 14
    .line 15
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 16
    .line 17
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 18
    .line 19
    iget-object v2, v0, Lw4/d;->d:Lb7/b1;

    .line 20
    .line 21
    iget-object v2, v2, Lb7/b1;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lj5/d0;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lw4/d;->W(Lj5/d0;)Lw4/a;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v3, Landroidx/media3/exoplayer/offline/g;

    .line 30
    .line 31
    invoke-direct {v3, v2, v1}, Landroidx/media3/exoplayer/offline/g;-><init>(Lw4/a;Lv4/f;)V

    .line 32
    .line 33
    .line 34
    const/16 v1, 0x3fc

    .line 35
    .line 36
    invoke-virtual {v0, v2, v1, v3}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 37
    .line 38
    .line 39
    return-void
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
.end method

.method private final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp5/y;

    .line 4
    .line 5
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lv4/f;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    monitor-exit v1

    .line 11
    iget-object v0, v0, Lp5/y;->c:Lv4/s;

    .line 12
    .line 13
    sget v1, Lp4/c0;->a:I

    .line 14
    .line 15
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 16
    .line 17
    iget-object v0, v0, Lv4/v;->s:Lw4/d;

    .line 18
    .line 19
    iget-object v1, v0, Lw4/d;->d:Lb7/b1;

    .line 20
    .line 21
    iget-object v1, v1, Lb7/b1;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lj5/d0;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lw4/d;->W(Lj5/d0;)Lw4/a;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, Lw4/b;

    .line 30
    .line 31
    const/16 v3, 0x16

    .line 32
    .line 33
    invoke-direct {v2, v3}, Lw4/b;-><init>(I)V

    .line 34
    .line 35
    .line 36
    const/16 v3, 0x3f5

    .line 37
    .line 38
    invoke-virtual {v0, v1, v3, v2}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 39
    .line 40
    .line 41
    return-void
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
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget v0, p0, Lb5/h;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lr/y1;

    .line 13
    .line 14
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lr5/c;

    .line 17
    .line 18
    iget-object v0, v0, Lr/y1;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lx4/x;

    .line 21
    .line 22
    iget-object v0, v0, Lx4/x;->T0:Lp5/y;

    .line 23
    .line 24
    iget-object v2, v0, Lp5/y;->b:Landroid/os/Handler;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    new-instance v3, Lx4/g;

    .line 29
    .line 30
    const/16 v4, 0x9

    .line 31
    .line 32
    invoke-direct {v3, v0, v1, v4}, Lx4/g;-><init>(Lp5/y;Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void

    .line 39
    :pswitch_0
    invoke-direct {p0}, Lb5/h;->b()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v5, v0

    .line 46
    check-cast v5, Lv4/v;

    .line 47
    .line 48
    iget-object v0, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lv4/z;

    .line 51
    .line 52
    iget v1, v5, Lv4/v;->F:I

    .line 53
    .line 54
    iget v6, v0, Lv4/z;->a:I

    .line 55
    .line 56
    sub-int/2addr v1, v6

    .line 57
    iput v1, v5, Lv4/v;->F:I

    .line 58
    .line 59
    iget-boolean v6, v0, Lv4/z;->c:Z

    .line 60
    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    iget v6, v0, Lv4/z;->d:I

    .line 64
    .line 65
    iput v6, v5, Lv4/v;->G:I

    .line 66
    .line 67
    iput-boolean v3, v5, Lv4/v;->H:Z

    .line 68
    .line 69
    :cond_1
    if-nez v1, :cond_b

    .line 70
    .line 71
    iget-object v1, v0, Lv4/z;->e:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Lv4/u0;

    .line 74
    .line 75
    iget-object v1, v1, Lv4/u0;->a:Lm4/i1;

    .line 76
    .line 77
    iget-object v6, v5, Lv4/v;->t0:Lv4/u0;

    .line 78
    .line 79
    iget-object v6, v6, Lv4/u0;->a:Lm4/i1;

    .line 80
    .line 81
    invoke-virtual {v6}, Lm4/i1;->p()Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-nez v6, :cond_2

    .line 86
    .line 87
    invoke-virtual {v1}, Lm4/i1;->p()Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_2

    .line 92
    .line 93
    iput v2, v5, Lv4/v;->u0:I

    .line 94
    .line 95
    const-wide/16 v6, 0x0

    .line 96
    .line 97
    iput-wide v6, v5, Lv4/v;->v0:J

    .line 98
    .line 99
    :cond_2
    invoke-virtual {v1}, Lm4/i1;->p()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_4

    .line 104
    .line 105
    move-object v2, v1

    .line 106
    check-cast v2, Lv4/y0;

    .line 107
    .line 108
    iget-object v2, v2, Lv4/y0;->k:[Lm4/i1;

    .line 109
    .line 110
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    iget-object v7, v5, Lv4/v;->p:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-ne v6, v7, :cond_3

    .line 125
    .line 126
    const/4 v6, 0x1

    .line 127
    goto :goto_0

    .line 128
    :cond_3
    const/4 v6, 0x0

    .line 129
    :goto_0
    invoke-static {v6}, Lp4/c;->i(Z)V

    .line 130
    .line 131
    .line 132
    const/4 v6, 0x0

    .line 133
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-ge v6, v7, :cond_4

    .line 138
    .line 139
    iget-object v7, v5, Lv4/v;->p:Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    check-cast v7, Lv4/u;

    .line 146
    .line 147
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    check-cast v8, Lm4/i1;

    .line 152
    .line 153
    iput-object v8, v7, Lv4/u;->c:Lm4/i1;

    .line 154
    .line 155
    add-int/lit8 v6, v6, 0x1

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_4
    iget-boolean v2, v5, Lv4/v;->H:Z

    .line 159
    .line 160
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    if-eqz v2, :cond_a

    .line 166
    .line 167
    iget-object v2, v0, Lv4/z;->e:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, Lv4/u0;

    .line 170
    .line 171
    iget-object v2, v2, Lv4/u0;->b:Lj5/d0;

    .line 172
    .line 173
    iget-object v8, v5, Lv4/v;->t0:Lv4/u0;

    .line 174
    .line 175
    iget-object v8, v8, Lv4/u0;->b:Lj5/d0;

    .line 176
    .line 177
    invoke-virtual {v2, v8}, Lj5/d0;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_6

    .line 182
    .line 183
    iget-object v2, v0, Lv4/z;->e:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v2, Lv4/u0;

    .line 186
    .line 187
    iget-wide v8, v2, Lv4/u0;->d:J

    .line 188
    .line 189
    iget-object v2, v5, Lv4/v;->t0:Lv4/u0;

    .line 190
    .line 191
    iget-wide v10, v2, Lv4/u0;->s:J

    .line 192
    .line 193
    cmp-long v2, v8, v10

    .line 194
    .line 195
    if-eqz v2, :cond_5

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_5
    const/4 v3, 0x0

    .line 199
    :cond_6
    :goto_2
    if-eqz v3, :cond_9

    .line 200
    .line 201
    invoke-virtual {v1}, Lm4/i1;->p()Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-nez v2, :cond_8

    .line 206
    .line 207
    iget-object v2, v0, Lv4/z;->e:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v2, Lv4/u0;

    .line 210
    .line 211
    iget-object v2, v2, Lv4/u0;->b:Lj5/d0;

    .line 212
    .line 213
    invoke-virtual {v2}, Lj5/d0;->b()Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-eqz v2, :cond_7

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_7
    iget-object v2, v0, Lv4/z;->e:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v2, Lv4/u0;

    .line 223
    .line 224
    iget-object v6, v2, Lv4/u0;->b:Lj5/d0;

    .line 225
    .line 226
    iget-wide v7, v2, Lv4/u0;->d:J

    .line 227
    .line 228
    iget-object v2, v6, Lj5/d0;->a:Ljava/lang/Object;

    .line 229
    .line 230
    iget-object v6, v5, Lv4/v;->o:Lm4/f1;

    .line 231
    .line 232
    invoke-virtual {v1, v2, v6}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 233
    .line 234
    .line 235
    iget-wide v1, v6, Lm4/f1;->e:J

    .line 236
    .line 237
    add-long/2addr v7, v1

    .line 238
    move-wide v6, v7

    .line 239
    goto :goto_4

    .line 240
    :cond_8
    :goto_3
    iget-object v1, v0, Lv4/z;->e:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v1, Lv4/u0;

    .line 243
    .line 244
    iget-wide v1, v1, Lv4/u0;->d:J

    .line 245
    .line 246
    move-wide v6, v1

    .line 247
    :cond_9
    :goto_4
    move v8, v3

    .line 248
    move-wide v10, v6

    .line 249
    goto :goto_5

    .line 250
    :cond_a
    move-wide v10, v6

    .line 251
    const/4 v8, 0x0

    .line 252
    :goto_5
    iput-boolean v4, v5, Lv4/v;->H:Z

    .line 253
    .line 254
    iget-object v0, v0, Lv4/z;->e:Ljava/lang/Object;

    .line 255
    .line 256
    move-object v6, v0

    .line 257
    check-cast v6, Lv4/u0;

    .line 258
    .line 259
    iget v9, v5, Lv4/v;->G:I

    .line 260
    .line 261
    const/4 v12, -0x1

    .line 262
    const/4 v13, 0x0

    .line 263
    const/4 v7, 0x1

    .line 264
    invoke-virtual/range {v5 .. v13}, Lv4/v;->k2(Lv4/u0;IZIJIZ)V

    .line 265
    .line 266
    .line 267
    :cond_b
    return-void

    .line 268
    :pswitch_2
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v0, Lqf/f;

    .line 271
    .line 272
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v1, Lqf/b;

    .line 275
    .line 276
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 277
    .line 278
    check-cast v0, Lqf/e;

    .line 279
    .line 280
    invoke-virtual {v0, v1, v2}, Lqf/e;->g(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :pswitch_3
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v0, Lq5/k;

    .line 287
    .line 288
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v1, Landroid/graphics/SurfaceTexture;

    .line 291
    .line 292
    iget-object v2, v0, Lq5/k;->g:Landroid/graphics/SurfaceTexture;

    .line 293
    .line 294
    iget-object v3, v0, Lq5/k;->h:Landroid/view/Surface;

    .line 295
    .line 296
    new-instance v4, Landroid/view/Surface;

    .line 297
    .line 298
    invoke-direct {v4, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 299
    .line 300
    .line 301
    iput-object v1, v0, Lq5/k;->g:Landroid/graphics/SurfaceTexture;

    .line 302
    .line 303
    iput-object v4, v0, Lq5/k;->h:Landroid/view/Surface;

    .line 304
    .line 305
    iget-object v0, v0, Lq5/k;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-eqz v1, :cond_c

    .line 316
    .line 317
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    check-cast v1, Lv4/s;

    .line 322
    .line 323
    iget-object v1, v1, Lv4/s;->a:Lv4/v;

    .line 324
    .line 325
    invoke-virtual {v1, v4}, Lv4/v;->f2(Landroid/view/Surface;)V

    .line 326
    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_c
    if-eqz v2, :cond_d

    .line 330
    .line 331
    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->release()V

    .line 332
    .line 333
    .line 334
    :cond_d
    if-eqz v3, :cond_e

    .line 335
    .line 336
    invoke-virtual {v3}, Landroid/view/Surface;->release()V

    .line 337
    .line 338
    .line 339
    :cond_e
    return-void

    .line 340
    :pswitch_4
    invoke-direct {p0}, Lb5/h;->a()V

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :pswitch_5
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, Lp5/y;

    .line 347
    .line 348
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v1, Lm4/u1;

    .line 351
    .line 352
    iget-object v0, v0, Lp5/y;->c:Lv4/s;

    .line 353
    .line 354
    sget v2, Lp4/c0;->a:I

    .line 355
    .line 356
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 357
    .line 358
    iput-object v1, v0, Lv4/v;->r0:Lm4/u1;

    .line 359
    .line 360
    iget-object v0, v0, Lv4/v;->m:Lp4/n;

    .line 361
    .line 362
    new-instance v2, Lv4/r;

    .line 363
    .line 364
    invoke-direct {v2, v1}, Lv4/r;-><init>(Lm4/u1;)V

    .line 365
    .line 366
    .line 367
    const/16 v1, 0x19

    .line 368
    .line 369
    invoke-virtual {v0, v1, v2}, Lp4/n;->e(ILp4/k;)V

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :pswitch_6
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, Lm0/w;

    .line 376
    .line 377
    iget-object v0, v0, Lm0/w;->c:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v0, Lp5/c;

    .line 380
    .line 381
    iget-object v0, v0, Lp5/c;->g:Lp5/z;

    .line 382
    .line 383
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :pswitch_7
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v0, Lcb/e0;

    .line 390
    .line 391
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v1, Lcb/y;

    .line 394
    .line 395
    iget-object v0, v0, Lcb/p;->a:Ljava/lang/Object;

    .line 396
    .line 397
    instance-of v0, v0, Lcb/a;

    .line 398
    .line 399
    if-eqz v0, :cond_f

    .line 400
    .line 401
    invoke-interface {v1, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 402
    .line 403
    .line 404
    :cond_f
    return-void

    .line 405
    :pswitch_8
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v0, Lp4/p;

    .line 408
    .line 409
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v1, Ln5/g;

    .line 412
    .line 413
    invoke-virtual {v0}, Lp4/p;->c()I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    invoke-virtual {v1, v0}, Ln5/g;->a(I)V

    .line 418
    .line 419
    .line 420
    return-void

    .line 421
    :pswitch_9
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v0, Ljava/lang/Runnable;

    .line 424
    .line 425
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v1, Ln7/y;

    .line 428
    .line 429
    :try_start_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 430
    .line 431
    .line 432
    invoke-virtual {v1}, Ln7/y;->a()V

    .line 433
    .line 434
    .line 435
    return-void

    .line 436
    :catchall_0
    move-exception v0

    .line 437
    invoke-virtual {v1}, Ln7/y;->a()V

    .line 438
    .line 439
    .line 440
    throw v0

    .line 441
    :pswitch_a
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v0, Ll1/c;

    .line 444
    .line 445
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v1, Landroid/util/LongSparseArray;

    .line 448
    .line 449
    invoke-static {v0, v1}, Lgh/g;->u(Ll1/c;Landroid/util/LongSparseArray;)V

    .line 450
    .line 451
    .line 452
    return-void

    .line 453
    :pswitch_b
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v0, Lhf/k;

    .line 456
    .line 457
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast v1, Ljf/d;

    .line 460
    .line 461
    invoke-virtual {v0, v1}, Lhf/k;->E(Lhf/u;)V

    .line 462
    .line 463
    .line 464
    return-void

    .line 465
    :pswitch_c
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v0, Lj5/t0;

    .line 468
    .line 469
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v1, Lr5/b0;

    .line 472
    .line 473
    invoke-virtual {v0, v1}, Lj5/t0;->E(Lr5/b0;)V

    .line 474
    .line 475
    .line 476
    return-void

    .line 477
    :pswitch_d
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v0, Lp4/g;

    .line 480
    .line 481
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 482
    .line 483
    invoke-interface {v0, v1}, Lp4/g;->accept(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    return-void

    .line 487
    :pswitch_e
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v0, Le5/b;

    .line 490
    .line 491
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 492
    .line 493
    check-cast v1, Landroid/net/Uri;

    .line 494
    .line 495
    iput-boolean v4, v0, Le5/b;->i:Z

    .line 496
    .line 497
    invoke-virtual {v0, v1}, Le5/b;->d(Landroid/net/Uri;)V

    .line 498
    .line 499
    .line 500
    return-void

    .line 501
    :pswitch_f
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v0, Ld/n;

    .line 504
    .line 505
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v1, Ld/j0;

    .line 508
    .line 509
    iget-object v2, v0, Lm3/a;->a:Landroidx/lifecycle/z;

    .line 510
    .line 511
    new-instance v3, Ld/f;

    .line 512
    .line 513
    invoke-direct {v3, v1, v0}, Ld/f;-><init>(Ld/j0;Ld/n;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v2, v3}, Landroidx/lifecycle/z;->W0(Landroidx/lifecycle/w;)V

    .line 517
    .line 518
    .line 519
    return-void

    .line 520
    :pswitch_10
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v0, Lc5/q;

    .line 523
    .line 524
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v1, Lc5/j;

    .line 527
    .line 528
    iget-object v0, v0, Lc5/q;->c:Lb0/c1;

    .line 529
    .line 530
    iget-object v1, v1, Lc5/j;->m:Landroid/net/Uri;

    .line 531
    .line 532
    iget-object v0, v0, Lb0/c1;->b:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v0, Lc5/k;

    .line 535
    .line 536
    iget-object v0, v0, Lc5/k;->b:Le5/c;

    .line 537
    .line 538
    iget-object v0, v0, Le5/c;->d:Ljava/util/HashMap;

    .line 539
    .line 540
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    check-cast v0, Le5/b;

    .line 545
    .line 546
    invoke-virtual {v0, v3}, Le5/b;->c(Z)V

    .line 547
    .line 548
    .line 549
    return-void

    .line 550
    :pswitch_11
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v0, Lb7/q3;

    .line 553
    .line 554
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v1, Lb7/t1;

    .line 557
    .line 558
    iget-object v0, v0, Lb7/q3;->g:Lb0/w1;

    .line 559
    .line 560
    invoke-virtual {v0, v1}, Lb0/w1;->F(Lb7/t1;)V

    .line 561
    .line 562
    .line 563
    return-void

    .line 564
    :pswitch_12
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v0, Lb7/q3;

    .line 567
    .line 568
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v1, Lb7/r;

    .line 571
    .line 572
    iget-object v0, v0, Lb7/q3;->g:Lb0/w1;

    .line 573
    .line 574
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-virtual {v0, v1}, Lb0/w1;->M(Ljava/lang/Object;)Lb7/t1;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    if-eqz v1, :cond_10

    .line 583
    .line 584
    invoke-virtual {v0, v1}, Lb0/w1;->a0(Lb7/t1;)V

    .line 585
    .line 586
    .line 587
    :cond_10
    return-void

    .line 588
    :pswitch_13
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast v0, Lb7/p1;

    .line 591
    .line 592
    iget-object v2, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v2, Lb7/v1;

    .line 595
    .line 596
    iget-object v0, v0, Lb7/p1;->g:Ljava/util/HashMap;

    .line 597
    .line 598
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    check-cast v0, Lcb/y;

    .line 603
    .line 604
    if-eqz v0, :cond_12

    .line 605
    .line 606
    invoke-interface {v0, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 607
    .line 608
    .line 609
    move-result v3

    .line 610
    if-eqz v3, :cond_11

    .line 611
    .line 612
    goto :goto_8

    .line 613
    :cond_11
    :try_start_1
    invoke-static {v0}, Lg8/a;->B(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    check-cast v0, Lb7/d0;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 618
    .line 619
    invoke-virtual {v0}, Lb7/d0;->d()V

    .line 620
    .line 621
    .line 622
    goto :goto_8

    .line 623
    :catch_0
    move-exception v0

    .line 624
    goto :goto_7

    .line 625
    :catch_1
    move-exception v0

    .line 626
    :goto_7
    const-string v3, "MediaController"

    .line 627
    .line 628
    const-string v4, "MediaController future failed (so we couldn\'t release it)"

    .line 629
    .line 630
    invoke-static {v3, v4, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 631
    .line 632
    .line 633
    :cond_12
    :goto_8
    iget-object v0, v2, Lb7/v1;->a:Lb7/c2;

    .line 634
    .line 635
    iput-object v1, v0, Lb7/c2;->w:Lb0/c1;

    .line 636
    .line 637
    return-void

    .line 638
    :pswitch_14
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v0, Lb7/c2;

    .line 641
    .line 642
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast v1, Landroid/content/Intent;

    .line 645
    .line 646
    invoke-virtual {v0}, Lb7/c2;->d()Lb7/t1;

    .line 647
    .line 648
    .line 649
    move-result-object v3

    .line 650
    if-nez v3, :cond_14

    .line 651
    .line 652
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 653
    .line 654
    .line 655
    move-result-object v3

    .line 656
    if-eqz v3, :cond_13

    .line 657
    .line 658
    invoke-virtual {v3}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v3

    .line 662
    goto :goto_9

    .line 663
    :cond_13
    const-string v3, "androidx.media3.session.MediaSessionService"

    .line 664
    .line 665
    :goto_9
    new-instance v4, Lb7/t1;

    .line 666
    .line 667
    new-instance v5, Lc7/k1;

    .line 668
    .line 669
    invoke-direct {v5, v2, v2, v3}, Lc7/k1;-><init>(IILjava/lang/String;)V

    .line 670
    .line 671
    .line 672
    const/4 v9, 0x0

    .line 673
    sget-object v10, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 674
    .line 675
    const v6, 0x3bf65781

    .line 676
    .line 677
    .line 678
    const/4 v7, 0x7

    .line 679
    const/4 v8, 0x0

    .line 680
    invoke-direct/range {v4 .. v10}, Lb7/t1;-><init>(Lc7/k1;IIZLb7/s1;Landroid/os/Bundle;)V

    .line 681
    .line 682
    .line 683
    move-object v3, v4

    .line 684
    :cond_14
    invoke-virtual {v0, v3, v1}, Lb7/c2;->m(Lb7/t1;Landroid/content/Intent;)Z

    .line 685
    .line 686
    .line 687
    move-result v0

    .line 688
    if-nez v0, :cond_15

    .line 689
    .line 690
    const-string v0, "MSessionService"

    .line 691
    .line 692
    const-string v1, "Ignored unrecognized media button intent."

    .line 693
    .line 694
    invoke-static {v0, v1}, Lp4/c;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    :cond_15
    return-void

    .line 698
    :pswitch_15
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v0, Lcb/v;

    .line 701
    .line 702
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v1, Landroid/os/ResultReceiver;

    .line 705
    .line 706
    const-string v4, "MediaSessionLegacyStub"

    .line 707
    .line 708
    :try_start_2
    iget-object v0, v0, Lcb/v;->a:Ljava/lang/Object;

    .line 709
    .line 710
    check-cast v0, Lb7/i4;

    .line 711
    .line 712
    const-string v5, "SessionResult must not be null"

    .line 713
    .line 714
    invoke-static {v0, v5}, Lp4/c;->g(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    .line 715
    .line 716
    .line 717
    goto :goto_c

    .line 718
    :catch_2
    move-exception v0

    .line 719
    goto :goto_a

    .line 720
    :catch_3
    move-exception v0

    .line 721
    goto :goto_a

    .line 722
    :catch_4
    move-exception v0

    .line 723
    goto :goto_b

    .line 724
    :goto_a
    const-string v3, "Custom command failed"

    .line 725
    .line 726
    invoke-static {v4, v3, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 727
    .line 728
    .line 729
    new-instance v0, Lb7/i4;

    .line 730
    .line 731
    invoke-direct {v0, v2}, Lb7/i4;-><init>(I)V

    .line 732
    .line 733
    .line 734
    goto :goto_c

    .line 735
    :goto_b
    const-string v2, "Custom command cancelled"

    .line 736
    .line 737
    invoke-static {v4, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 738
    .line 739
    .line 740
    new-instance v0, Lb7/i4;

    .line 741
    .line 742
    invoke-direct {v0, v3}, Lb7/i4;-><init>(I)V

    .line 743
    .line 744
    .line 745
    :goto_c
    iget v2, v0, Lb7/i4;->a:I

    .line 746
    .line 747
    iget-object v0, v0, Lb7/i4;->b:Landroid/os/Bundle;

    .line 748
    .line 749
    invoke-virtual {v1, v2, v0}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 750
    .line 751
    .line 752
    return-void

    .line 753
    :pswitch_16
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 754
    .line 755
    move-object v1, v0

    .line 756
    check-cast v1, Lb7/c2;

    .line 757
    .line 758
    iget-object v0, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 759
    .line 760
    move-object v2, v0

    .line 761
    check-cast v2, Lb7/z3;

    .line 762
    .line 763
    iget-object v5, v1, Lb7/c2;->h:Lb7/o2;

    .line 764
    .line 765
    iput-object v2, v1, Lb7/c2;->t:Lb7/z3;

    .line 766
    .line 767
    new-instance v0, Lb7/a2;

    .line 768
    .line 769
    invoke-direct {v0, v1, v2}, Lb7/a2;-><init>(Lb7/c2;Lb7/z3;)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v2}, Lb7/z3;->r0()V

    .line 773
    .line 774
    .line 775
    iget-object v6, v2, Lb7/z3;->a:Landroidx/media3/exoplayer/ExoPlayer;

    .line 776
    .line 777
    new-instance v7, Lm4/r;

    .line 778
    .line 779
    invoke-direct {v7, v2, v0}, Lm4/r;-><init>(Lb7/z3;Lm4/w0;)V

    .line 780
    .line 781
    .line 782
    check-cast v6, Lv4/v;

    .line 783
    .line 784
    iget-object v6, v6, Lv4/v;->m:Lp4/n;

    .line 785
    .line 786
    invoke-virtual {v6, v7}, Lp4/n;->a(Ljava/lang/Object;)V

    .line 787
    .line 788
    .line 789
    iput-object v0, v1, Lb7/c2;->v:Lb7/a2;

    .line 790
    .line 791
    :try_start_3
    iget-object v0, v5, Lb7/o2;->i:Lb7/l2;

    .line 792
    .line 793
    invoke-virtual {v0, v4, v2}, Lb7/l2;->m(ILb7/z3;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_5

    .line 794
    .line 795
    .line 796
    goto :goto_d

    .line 797
    :catch_5
    move-exception v0

    .line 798
    const-string v4, "MediaSessionImpl"

    .line 799
    .line 800
    const-string v6, "Exception in using media1 API"

    .line 801
    .line 802
    invoke-static {v4, v6, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 803
    .line 804
    .line 805
    :goto_d
    iget-object v0, v5, Lb7/o2;->k:Lc7/e1;

    .line 806
    .line 807
    iget-object v4, v0, Lc7/e1;->b:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v4, Lc7/w0;

    .line 810
    .line 811
    iget-object v4, v4, Lc7/w0;->a:Landroid/media/session/MediaSession;

    .line 812
    .line 813
    invoke-virtual {v4, v3}, Landroid/media/session/MediaSession;->setActive(Z)V

    .line 814
    .line 815
    .line 816
    iget-object v0, v0, Lc7/e1;->d:Ljava/lang/Object;

    .line 817
    .line 818
    check-cast v0, Ljava/util/ArrayList;

    .line 819
    .line 820
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 825
    .line 826
    .line 827
    move-result v3

    .line 828
    if-nez v3, :cond_16

    .line 829
    .line 830
    invoke-virtual {v2}, Lb7/z3;->e()Lb7/v3;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    iput-object v0, v1, Lb7/c2;->s:Lb7/v3;

    .line 835
    .line 836
    invoke-virtual {v2}, Lb7/z3;->m()Lm4/u0;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    invoke-virtual {v1, v0}, Lb7/c2;->e(Lm4/u0;)V

    .line 841
    .line 842
    .line 843
    return-void

    .line 844
    :cond_16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 849
    .line 850
    .line 851
    new-instance v0, Ljava/lang/ClassCastException;

    .line 852
    .line 853
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 854
    .line 855
    .line 856
    throw v0

    .line 857
    :pswitch_17
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 858
    .line 859
    check-cast v0, Lb7/c2;

    .line 860
    .line 861
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v1, Lcb/e0;

    .line 864
    .line 865
    invoke-virtual {v0}, Lb7/c2;->n()Z

    .line 866
    .line 867
    .line 868
    move-result v0

    .line 869
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    invoke-virtual {v1, v0}, Lcb/p;->k(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    return-void

    .line 877
    :pswitch_18
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast v0, Lb7/c2;

    .line 880
    .line 881
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast v1, Ljava/lang/Runnable;

    .line 884
    .line 885
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 886
    .line 887
    .line 888
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 889
    .line 890
    .line 891
    return-void

    .line 892
    :pswitch_19
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 893
    .line 894
    check-cast v0, Lb7/t0;

    .line 895
    .line 896
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 897
    .line 898
    check-cast v1, Lb7/h1;

    .line 899
    .line 900
    iget-boolean v2, v0, Lb7/t0;->m:Z

    .line 901
    .line 902
    if-eqz v2, :cond_17

    .line 903
    .line 904
    goto :goto_e

    .line 905
    :cond_17
    invoke-interface {v1, v0}, Lb7/h1;->c(Lb7/t0;)V

    .line 906
    .line 907
    .line 908
    :goto_e
    return-void

    .line 909
    :pswitch_1a
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 910
    .line 911
    check-cast v0, Lb7/d1;

    .line 912
    .line 913
    iget-object v2, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 914
    .line 915
    check-cast v2, Lc7/d1;

    .line 916
    .line 917
    new-instance v3, Landroidx/media3/exoplayer/offline/u;

    .line 918
    .line 919
    iget-object v4, v0, Lb7/d1;->a:Landroid/content/Context;

    .line 920
    .line 921
    invoke-direct {v3, v4, v2}, Landroidx/media3/exoplayer/offline/u;-><init>(Landroid/content/Context;Lc7/d1;)V

    .line 922
    .line 923
    .line 924
    iput-object v3, v0, Lb7/d1;->h:Landroidx/media3/exoplayer/offline/u;

    .line 925
    .line 926
    iget-object v2, v0, Lb7/d1;->e:Lb7/a1;

    .line 927
    .line 928
    iget-object v0, v0, Lb7/d1;->b:Lb7/d0;

    .line 929
    .line 930
    iget-object v0, v0, Lb7/d0;->d:Landroid/os/Handler;

    .line 931
    .line 932
    if-eqz v2, :cond_1b

    .line 933
    .line 934
    iget-object v4, v3, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 935
    .line 936
    check-cast v4, Ljava/util/Set;

    .line 937
    .line 938
    invoke-interface {v4, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    move-result v4

    .line 942
    if-nez v4, :cond_18

    .line 943
    .line 944
    const-string v0, "MediaControllerCompat"

    .line 945
    .line 946
    const-string v1, "the callback has already been registered"

    .line 947
    .line 948
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 949
    .line 950
    .line 951
    goto :goto_10

    .line 952
    :cond_18
    if-nez v0, :cond_19

    .line 953
    .line 954
    new-instance v0, Landroid/os/Handler;

    .line 955
    .line 956
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 957
    .line 958
    .line 959
    :cond_19
    invoke-virtual {v2, v0}, Lb7/a1;->j(Landroid/os/Handler;)V

    .line 960
    .line 961
    .line 962
    iget-object v3, v3, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 963
    .line 964
    check-cast v3, Lc7/j0;

    .line 965
    .line 966
    iget-object v4, v3, Lc7/j0;->a:Landroid/media/session/MediaController;

    .line 967
    .line 968
    iget-object v5, v2, Lb7/a1;->a:Lc7/h0;

    .line 969
    .line 970
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    .line 972
    .line 973
    invoke-virtual {v4, v5, v0}, Landroid/media/session/MediaController;->registerCallback(Landroid/media/session/MediaController$Callback;Landroid/os/Handler;)V

    .line 974
    .line 975
    .line 976
    iget-object v4, v3, Lc7/j0;->b:Ljava/lang/Object;

    .line 977
    .line 978
    monitor-enter v4

    .line 979
    :try_start_4
    iget-object v0, v3, Lc7/j0;->e:Lc7/d1;

    .line 980
    .line 981
    invoke-virtual {v0}, Lc7/d1;->a()Lc7/h;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    if-eqz v0, :cond_1a

    .line 986
    .line 987
    new-instance v5, Lc7/i0;

    .line 988
    .line 989
    invoke-direct {v5, v2}, Lc7/i0;-><init>(Lb7/a1;)V

    .line 990
    .line 991
    .line 992
    iget-object v3, v3, Lc7/j0;->d:Ljava/util/HashMap;

    .line 993
    .line 994
    invoke-virtual {v3, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    iput-object v5, v2, Lb7/a1;->c:Lc7/i0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 998
    .line 999
    :try_start_5
    invoke-interface {v0, v5}, Lc7/h;->J(Lc7/f;)V

    .line 1000
    .line 1001
    .line 1002
    const/16 v0, 0xd

    .line 1003
    .line 1004
    invoke-virtual {v2, v0, v1, v1}, Lb7/a1;->i(ILjava/lang/Object;Landroid/os/Bundle;)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1005
    .line 1006
    .line 1007
    goto :goto_f

    .line 1008
    :catchall_1
    move-exception v0

    .line 1009
    goto :goto_11

    .line 1010
    :catch_6
    move-exception v0

    .line 1011
    :try_start_6
    const-string v1, "MediaControllerCompat"

    .line 1012
    .line 1013
    const-string v2, "Dead object in registerCallback."

    .line 1014
    .line 1015
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1016
    .line 1017
    .line 1018
    goto :goto_f

    .line 1019
    :cond_1a
    iput-object v1, v2, Lb7/a1;->c:Lc7/i0;

    .line 1020
    .line 1021
    iget-object v0, v3, Lc7/j0;->c:Ljava/util/ArrayList;

    .line 1022
    .line 1023
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    :goto_f
    monitor-exit v4

    .line 1027
    :goto_10
    return-void

    .line 1028
    :goto_11
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 1029
    throw v0

    .line 1030
    :cond_1b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1031
    .line 1032
    const-string v1, "callback must not be null"

    .line 1033
    .line 1034
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1035
    .line 1036
    .line 1037
    throw v0

    .line 1038
    :pswitch_1b
    iget-object v0, p0, Lb5/h;->b:Ljava/lang/Object;

    .line 1039
    .line 1040
    check-cast v0, Lb5/i;

    .line 1041
    .line 1042
    iget-object v1, p0, Lb5/h;->c:Ljava/lang/Object;

    .line 1043
    .line 1044
    check-cast v1, Lm4/q;

    .line 1045
    .line 1046
    iget-object v2, v0, Lb5/i;->d:Lb5/j;

    .line 1047
    .line 1048
    iget v3, v2, Lb5/j;->o:I

    .line 1049
    .line 1050
    if-eqz v3, :cond_1d

    .line 1051
    .line 1052
    iget-boolean v3, v0, Lb5/i;->c:Z

    .line 1053
    .line 1054
    if-eqz v3, :cond_1c

    .line 1055
    .line 1056
    goto :goto_12

    .line 1057
    :cond_1c
    iget-object v3, v2, Lb5/j;->s:Landroid/os/Looper;

    .line 1058
    .line 1059
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1060
    .line 1061
    .line 1062
    iget-object v5, v0, Lb5/i;->a:Lb5/q;

    .line 1063
    .line 1064
    invoke-virtual {v2, v3, v5, v1, v4}, Lb5/j;->b(Landroid/os/Looper;Lb5/q;Lm4/q;Z)Lb5/l;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    iput-object v1, v0, Lb5/i;->b:Lb5/l;

    .line 1069
    .line 1070
    iget-object v1, v2, Lb5/j;->m:Ljava/util/Set;

    .line 1071
    .line 1072
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1073
    .line 1074
    .line 1075
    :cond_1d
    :goto_12
    return-void

    .line 1076
    nop

    .line 1077
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method
