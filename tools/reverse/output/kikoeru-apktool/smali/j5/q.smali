.class public final Lj5/q;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lj5/c0;


# instance fields
.field public final a:Ld0/y;

.field public b:Ls4/g;

.field public c:Lm3/l;

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:F

.field public final h:F

.field public i:Z


# direct methods
.method public constructor <init>(Lcom/cnl/kikoeru/MainApplication;)V
    .locals 1

    .line 1
    new-instance v0, Lm0/w;

    invoke-direct {v0, p1}, Lm0/w;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Lr5/l;

    invoke-direct {p1}, Lr5/l;-><init>()V

    invoke-direct {p0, v0, p1}, Lj5/q;-><init>(Lm0/w;Lr5/l;)V

    return-void
.end method

.method public constructor <init>(Lm0/w;Lr5/l;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lj5/q;->b:Ls4/g;

    .line 5
    new-instance v0, Lm3/l;

    const/16 v1, 0x11

    .line 6
    invoke-direct {v0, v1}, Lm3/l;-><init>(I)V

    .line 7
    iput-object v0, p0, Lj5/q;->c:Lm3/l;

    .line 8
    new-instance v1, Ld0/y;

    invoke-direct {v1, p2, v0}, Ld0/y;-><init>(Lr5/l;Lm3/l;)V

    iput-object v1, p0, Lj5/q;->a:Ld0/y;

    .line 9
    iget-object p2, v1, Ld0/y;->e:Ljava/lang/Object;

    check-cast p2, Ls4/g;

    if-eq p1, p2, :cond_0

    .line 10
    iput-object p1, v1, Ld0/y;->e:Ljava/lang/Object;

    .line 11
    iget-object p1, v1, Ld0/y;->c:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 12
    iget-object p1, v1, Ld0/y;->d:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    iput-wide p1, p0, Lj5/q;->d:J

    .line 14
    iput-wide p1, p0, Lj5/q;->e:J

    .line 15
    iput-wide p1, p0, Lj5/q;->f:J

    const p1, -0x800001

    .line 16
    iput p1, p0, Lj5/q;->g:F

    .line 17
    iput p1, p0, Lj5/q;->h:F

    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lj5/q;->i:Z

    return-void
.end method

.method public static e(Ljava/lang/Class;Ls4/g;)Lj5/c0;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    new-array v1, v0, [Ljava/lang/Class;

    .line 3
    .line 4
    const-class v2, Ls4/g;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-object v2, v1, v3

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-array v0, v0, [Ljava/lang/Object;

    .line 14
    .line 15
    aput-object p1, v0, v3

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lj5/c0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :catch_0
    move-exception p0

    .line 25
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw p1
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
.end method


# virtual methods
.method public final a(Lm4/i0;)Lj5/a;
    .locals 35

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lm4/i0;->b:Lm4/d0;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lm4/i0;->b:Lm4/d0;

    .line 11
    .line 12
    iget-object v2, v2, Lm4/d0;->a:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const-string v4, "ssai"

    .line 22
    .line 23
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    throw v3

    .line 31
    :cond_1
    :goto_0
    iget-object v2, v0, Lm4/i0;->b:Lm4/d0;

    .line 32
    .line 33
    iget-object v2, v2, Lm4/d0;->b:Ljava/lang/String;

    .line 34
    .line 35
    const-string v4, "application/x-image-uri"

    .line 36
    .line 37
    invoke-static {v2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_18

    .line 42
    .line 43
    iget-object v2, v0, Lm4/i0;->b:Lm4/d0;

    .line 44
    .line 45
    iget-object v4, v2, Lm4/d0;->a:Landroid/net/Uri;

    .line 46
    .line 47
    iget-object v2, v2, Lm4/d0;->b:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v4, v2}, Lp4/c0;->G(Landroid/net/Uri;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget-object v4, v0, Lm4/i0;->b:Lm4/d0;

    .line 54
    .line 55
    iget-wide v4, v4, Lm4/d0;->h:J

    .line 56
    .line 57
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    const/4 v8, 0x1

    .line 63
    cmp-long v9, v4, v6

    .line 64
    .line 65
    if-eqz v9, :cond_2

    .line 66
    .line 67
    iget-object v4, v1, Lj5/q;->a:Ld0/y;

    .line 68
    .line 69
    iget-object v4, v4, Ld0/y;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, Lr5/l;

    .line 72
    .line 73
    monitor-enter v4

    .line 74
    :try_start_0
    iput v8, v4, Lr5/l;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    monitor-exit v4

    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    throw v0

    .line 81
    :cond_2
    :goto_1
    :try_start_2
    iget-object v4, v1, Lj5/q;->a:Ld0/y;

    .line 82
    .line 83
    iget-object v5, v4, Ld0/y;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v5, Ljava/util/HashMap;

    .line 86
    .line 87
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    check-cast v9, Lj5/c0;

    .line 96
    .line 97
    if-eqz v9, :cond_3

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    invoke-virtual {v4, v2}, Ld0/y;->b(I)Lxa/i;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-interface {v9}, Lxa/i;->get()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    check-cast v9, Lj5/c0;

    .line 109
    .line 110
    iget-object v10, v4, Ld0/y;->f:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v10, Lm3/l;

    .line 113
    .line 114
    invoke-interface {v9, v10}, Lj5/c0;->b(Lm3/l;)Lj5/c0;

    .line 115
    .line 116
    .line 117
    iget-boolean v4, v4, Ld0/y;->a:Z

    .line 118
    .line 119
    invoke-interface {v9, v4}, Lj5/c0;->c(Z)Lj5/c0;

    .line 120
    .line 121
    .line 122
    invoke-interface {v9}, Lj5/c0;->d()Lj5/c0;

    .line 123
    .line 124
    .line 125
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v5, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 130
    .line 131
    .line 132
    :goto_2
    iget-object v2, v0, Lm4/i0;->c:Lm4/c0;

    .line 133
    .line 134
    invoke-virtual {v2}, Lm4/c0;->a()Lm4/b0;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    iget-object v4, v0, Lm4/i0;->c:Lm4/c0;

    .line 139
    .line 140
    iget-wide v10, v4, Lm4/c0;->a:J

    .line 141
    .line 142
    cmp-long v5, v10, v6

    .line 143
    .line 144
    if-nez v5, :cond_4

    .line 145
    .line 146
    iget-wide v10, v1, Lj5/q;->d:J

    .line 147
    .line 148
    iput-wide v10, v2, Lm4/b0;->a:J

    .line 149
    .line 150
    :cond_4
    iget v5, v4, Lm4/c0;->d:F

    .line 151
    .line 152
    const v10, -0x800001

    .line 153
    .line 154
    .line 155
    cmpl-float v5, v5, v10

    .line 156
    .line 157
    if-nez v5, :cond_5

    .line 158
    .line 159
    iget v5, v1, Lj5/q;->g:F

    .line 160
    .line 161
    iput v5, v2, Lm4/b0;->d:F

    .line 162
    .line 163
    :cond_5
    iget v5, v4, Lm4/c0;->e:F

    .line 164
    .line 165
    cmpl-float v5, v5, v10

    .line 166
    .line 167
    if-nez v5, :cond_6

    .line 168
    .line 169
    iget v5, v1, Lj5/q;->h:F

    .line 170
    .line 171
    iput v5, v2, Lm4/b0;->e:F

    .line 172
    .line 173
    :cond_6
    iget-wide v10, v4, Lm4/c0;->b:J

    .line 174
    .line 175
    cmp-long v5, v10, v6

    .line 176
    .line 177
    if-nez v5, :cond_7

    .line 178
    .line 179
    iget-wide v10, v1, Lj5/q;->e:J

    .line 180
    .line 181
    iput-wide v10, v2, Lm4/b0;->b:J

    .line 182
    .line 183
    :cond_7
    iget-wide v4, v4, Lm4/c0;->c:J

    .line 184
    .line 185
    cmp-long v10, v4, v6

    .line 186
    .line 187
    if-nez v10, :cond_8

    .line 188
    .line 189
    iget-wide v4, v1, Lj5/q;->f:J

    .line 190
    .line 191
    iput-wide v4, v2, Lm4/b0;->c:J

    .line 192
    .line 193
    :cond_8
    new-instance v4, Lm4/c0;

    .line 194
    .line 195
    invoke-direct {v4, v2}, Lm4/c0;-><init>(Lm4/b0;)V

    .line 196
    .line 197
    .line 198
    iget-object v2, v0, Lm4/i0;->c:Lm4/c0;

    .line 199
    .line 200
    invoke-virtual {v4, v2}, Lm4/c0;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-nez v2, :cond_11

    .line 205
    .line 206
    new-instance v2, Lm4/z;

    .line 207
    .line 208
    invoke-direct {v2}, Lm4/z;-><init>()V

    .line 209
    .line 210
    .line 211
    sget-object v10, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 212
    .line 213
    sget-object v11, Lya/a1;->e:Lya/a1;

    .line 214
    .line 215
    sget-object v12, Lm4/e0;->d:Lm4/e0;

    .line 216
    .line 217
    iget-object v12, v0, Lm4/i0;->e:Lm4/y;

    .line 218
    .line 219
    new-instance v13, Lm4/w;

    .line 220
    .line 221
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 222
    .line 223
    .line 224
    iget-wide v14, v12, Lm4/x;->b:J

    .line 225
    .line 226
    iput-wide v14, v13, Lm4/w;->a:J

    .line 227
    .line 228
    iget-wide v14, v12, Lm4/x;->d:J

    .line 229
    .line 230
    iput-wide v14, v13, Lm4/w;->b:J

    .line 231
    .line 232
    iget-boolean v14, v12, Lm4/x;->e:Z

    .line 233
    .line 234
    iput-boolean v14, v13, Lm4/w;->c:Z

    .line 235
    .line 236
    iget-boolean v14, v12, Lm4/x;->f:Z

    .line 237
    .line 238
    iput-boolean v14, v13, Lm4/w;->d:Z

    .line 239
    .line 240
    iget-boolean v12, v12, Lm4/x;->g:Z

    .line 241
    .line 242
    iput-boolean v12, v13, Lm4/w;->e:Z

    .line 243
    .line 244
    iget-object v12, v0, Lm4/i0;->a:Ljava/lang/String;

    .line 245
    .line 246
    iget-object v14, v0, Lm4/i0;->d:Lm4/l0;

    .line 247
    .line 248
    iget-object v15, v0, Lm4/i0;->c:Lm4/c0;

    .line 249
    .line 250
    invoke-virtual {v15}, Lm4/c0;->a()Lm4/b0;

    .line 251
    .line 252
    .line 253
    iget-object v15, v0, Lm4/i0;->f:Lm4/e0;

    .line 254
    .line 255
    iget-object v0, v0, Lm4/i0;->b:Lm4/d0;

    .line 256
    .line 257
    if-eqz v0, :cond_a

    .line 258
    .line 259
    iget-object v2, v0, Lm4/d0;->f:Ljava/lang/String;

    .line 260
    .line 261
    iget-object v6, v0, Lm4/d0;->b:Ljava/lang/String;

    .line 262
    .line 263
    iget-object v7, v0, Lm4/d0;->a:Landroid/net/Uri;

    .line 264
    .line 265
    iget-object v10, v0, Lm4/d0;->e:Ljava/util/List;

    .line 266
    .line 267
    iget-object v11, v0, Lm4/d0;->g:Lya/i0;

    .line 268
    .line 269
    move-object/from16 v16, v3

    .line 270
    .line 271
    iget-object v3, v0, Lm4/d0;->c:Lm4/a0;

    .line 272
    .line 273
    if-eqz v3, :cond_9

    .line 274
    .line 275
    const/16 v23, 0x0

    .line 276
    .line 277
    new-instance v5, Lm4/z;

    .line 278
    .line 279
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 280
    .line 281
    .line 282
    const/16 v24, 0x1

    .line 283
    .line 284
    iget-object v8, v3, Lm4/a0;->a:Ljava/util/UUID;

    .line 285
    .line 286
    iput-object v8, v5, Lm4/z;->d:Ljava/lang/Object;

    .line 287
    .line 288
    iget-object v8, v3, Lm4/a0;->b:Landroid/net/Uri;

    .line 289
    .line 290
    iput-object v8, v5, Lm4/z;->e:Ljava/lang/Object;

    .line 291
    .line 292
    iget-object v8, v3, Lm4/a0;->c:Lya/k0;

    .line 293
    .line 294
    iput-object v8, v5, Lm4/z;->f:Ljava/lang/Object;

    .line 295
    .line 296
    iget-boolean v8, v3, Lm4/a0;->d:Z

    .line 297
    .line 298
    iput-boolean v8, v5, Lm4/z;->a:Z

    .line 299
    .line 300
    iget-boolean v8, v3, Lm4/a0;->e:Z

    .line 301
    .line 302
    iput-boolean v8, v5, Lm4/z;->b:Z

    .line 303
    .line 304
    iget-boolean v8, v3, Lm4/a0;->f:Z

    .line 305
    .line 306
    iput-boolean v8, v5, Lm4/z;->c:Z

    .line 307
    .line 308
    iget-object v8, v3, Lm4/a0;->g:Lya/i0;

    .line 309
    .line 310
    iput-object v8, v5, Lm4/z;->g:Ljava/io/Serializable;

    .line 311
    .line 312
    iget-object v3, v3, Lm4/a0;->h:[B

    .line 313
    .line 314
    iput-object v3, v5, Lm4/z;->h:Ljava/lang/Cloneable;

    .line 315
    .line 316
    move-object v3, v5

    .line 317
    goto :goto_3

    .line 318
    :cond_9
    const/16 v23, 0x0

    .line 319
    .line 320
    const/16 v24, 0x1

    .line 321
    .line 322
    new-instance v3, Lm4/z;

    .line 323
    .line 324
    invoke-direct {v3}, Lm4/z;-><init>()V

    .line 325
    .line 326
    .line 327
    :goto_3
    iget-object v5, v0, Lm4/d0;->d:Lm4/v;

    .line 328
    .line 329
    move-object v8, v2

    .line 330
    move-object/from16 p1, v3

    .line 331
    .line 332
    iget-wide v2, v0, Lm4/d0;->h:J

    .line 333
    .line 334
    move-wide/from16 v33, v2

    .line 335
    .line 336
    move-object/from16 v29, v5

    .line 337
    .line 338
    move-object/from16 v27, v6

    .line 339
    .line 340
    move-object/from16 v26, v7

    .line 341
    .line 342
    move-object/from16 v31, v8

    .line 343
    .line 344
    move-object/from16 v2, p1

    .line 345
    .line 346
    :goto_4
    move-object/from16 v30, v10

    .line 347
    .line 348
    move-object/from16 v32, v11

    .line 349
    .line 350
    goto :goto_5

    .line 351
    :cond_a
    move-object/from16 v16, v3

    .line 352
    .line 353
    const/16 v23, 0x0

    .line 354
    .line 355
    const/16 v24, 0x1

    .line 356
    .line 357
    move-wide/from16 v33, v6

    .line 358
    .line 359
    move-object/from16 v26, v16

    .line 360
    .line 361
    move-object/from16 v27, v26

    .line 362
    .line 363
    move-object/from16 v29, v27

    .line 364
    .line 365
    move-object/from16 v31, v29

    .line 366
    .line 367
    goto :goto_4

    .line 368
    :goto_5
    invoke-virtual {v4}, Lm4/c0;->a()Lm4/b0;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iget-object v3, v2, Lm4/z;->e:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v3, Landroid/net/Uri;

    .line 375
    .line 376
    if-eqz v3, :cond_c

    .line 377
    .line 378
    iget-object v3, v2, Lm4/z;->d:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v3, Ljava/util/UUID;

    .line 381
    .line 382
    if-eqz v3, :cond_b

    .line 383
    .line 384
    goto :goto_6

    .line 385
    :cond_b
    const/4 v3, 0x0

    .line 386
    goto :goto_7

    .line 387
    :cond_c
    :goto_6
    const/4 v3, 0x1

    .line 388
    :goto_7
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 389
    .line 390
    .line 391
    if-eqz v26, :cond_e

    .line 392
    .line 393
    new-instance v25, Lm4/d0;

    .line 394
    .line 395
    iget-object v3, v2, Lm4/z;->d:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v3, Ljava/util/UUID;

    .line 398
    .line 399
    if-eqz v3, :cond_d

    .line 400
    .line 401
    new-instance v3, Lm4/a0;

    .line 402
    .line 403
    invoke-direct {v3, v2}, Lm4/a0;-><init>(Lm4/z;)V

    .line 404
    .line 405
    .line 406
    move-object/from16 v28, v3

    .line 407
    .line 408
    goto :goto_8

    .line 409
    :cond_d
    move-object/from16 v28, v16

    .line 410
    .line 411
    :goto_8
    invoke-direct/range {v25 .. v34}, Lm4/d0;-><init>(Landroid/net/Uri;Ljava/lang/String;Lm4/a0;Lm4/v;Ljava/util/List;Ljava/lang/String;Lya/i0;J)V

    .line 412
    .line 413
    .line 414
    move-object/from16 v19, v25

    .line 415
    .line 416
    goto :goto_9

    .line 417
    :cond_e
    move-object/from16 v19, v16

    .line 418
    .line 419
    :goto_9
    new-instance v16, Lm4/i0;

    .line 420
    .line 421
    if-eqz v12, :cond_f

    .line 422
    .line 423
    :goto_a
    move-object/from16 v17, v12

    .line 424
    .line 425
    goto :goto_b

    .line 426
    :cond_f
    const-string v12, ""

    .line 427
    .line 428
    goto :goto_a

    .line 429
    :goto_b
    new-instance v2, Lm4/y;

    .line 430
    .line 431
    invoke-direct {v2, v13}, Lm4/x;-><init>(Lm4/w;)V

    .line 432
    .line 433
    .line 434
    new-instance v3, Lm4/c0;

    .line 435
    .line 436
    invoke-direct {v3, v0}, Lm4/c0;-><init>(Lm4/b0;)V

    .line 437
    .line 438
    .line 439
    if-eqz v14, :cond_10

    .line 440
    .line 441
    :goto_c
    move-object/from16 v18, v2

    .line 442
    .line 443
    move-object/from16 v20, v3

    .line 444
    .line 445
    move-object/from16 v21, v14

    .line 446
    .line 447
    move-object/from16 v22, v15

    .line 448
    .line 449
    goto :goto_d

    .line 450
    :cond_10
    sget-object v14, Lm4/l0;->K:Lm4/l0;

    .line 451
    .line 452
    goto :goto_c

    .line 453
    :goto_d
    invoke-direct/range {v16 .. v22}, Lm4/i0;-><init>(Ljava/lang/String;Lm4/y;Lm4/d0;Lm4/c0;Lm4/l0;Lm4/e0;)V

    .line 454
    .line 455
    .line 456
    move-object/from16 v0, v16

    .line 457
    .line 458
    goto :goto_e

    .line 459
    :cond_11
    const/16 v23, 0x0

    .line 460
    .line 461
    const/16 v24, 0x1

    .line 462
    .line 463
    :goto_e
    invoke-interface {v9, v0}, Lj5/c0;->a(Lm4/i0;)Lj5/a;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    iget-object v3, v0, Lm4/i0;->b:Lm4/d0;

    .line 468
    .line 469
    iget-object v3, v3, Lm4/d0;->g:Lya/i0;

    .line 470
    .line 471
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    if-nez v4, :cond_15

    .line 476
    .line 477
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 478
    .line 479
    .line 480
    move-result v4

    .line 481
    add-int/lit8 v4, v4, 0x1

    .line 482
    .line 483
    new-array v4, v4, [Lj5/a;

    .line 484
    .line 485
    aput-object v2, v4, v23

    .line 486
    .line 487
    const/4 v5, 0x0

    .line 488
    :goto_f
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    if-ge v5, v2, :cond_14

    .line 493
    .line 494
    iget-boolean v2, v1, Lj5/q;->i:Z

    .line 495
    .line 496
    const/16 v6, 0xb

    .line 497
    .line 498
    if-eqz v2, :cond_13

    .line 499
    .line 500
    new-instance v2, Lm4/p;

    .line 501
    .line 502
    invoke-direct {v2}, Lm4/p;-><init>()V

    .line 503
    .line 504
    .line 505
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v7

    .line 509
    check-cast v7, Lm4/h0;

    .line 510
    .line 511
    iget-object v7, v7, Lm4/h0;->b:Ljava/lang/String;

    .line 512
    .line 513
    invoke-static {v7}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v7

    .line 517
    iput-object v7, v2, Lm4/p;->m:Ljava/lang/String;

    .line 518
    .line 519
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v7

    .line 523
    check-cast v7, Lm4/h0;

    .line 524
    .line 525
    iget-object v7, v7, Lm4/h0;->c:Ljava/lang/String;

    .line 526
    .line 527
    iput-object v7, v2, Lm4/p;->d:Ljava/lang/String;

    .line 528
    .line 529
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v7

    .line 533
    check-cast v7, Lm4/h0;

    .line 534
    .line 535
    iget v7, v7, Lm4/h0;->d:I

    .line 536
    .line 537
    iput v7, v2, Lm4/p;->e:I

    .line 538
    .line 539
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v7

    .line 543
    check-cast v7, Lm4/h0;

    .line 544
    .line 545
    iget v7, v7, Lm4/h0;->e:I

    .line 546
    .line 547
    iput v7, v2, Lm4/p;->f:I

    .line 548
    .line 549
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v7

    .line 553
    check-cast v7, Lm4/h0;

    .line 554
    .line 555
    iget-object v7, v7, Lm4/h0;->f:Ljava/lang/String;

    .line 556
    .line 557
    iput-object v7, v2, Lm4/p;->b:Ljava/lang/String;

    .line 558
    .line 559
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v7

    .line 563
    check-cast v7, Lm4/h0;

    .line 564
    .line 565
    iget-object v7, v7, Lm4/h0;->g:Ljava/lang/String;

    .line 566
    .line 567
    iput-object v7, v2, Lm4/p;->a:Ljava/lang/String;

    .line 568
    .line 569
    new-instance v7, Lm4/q;

    .line 570
    .line 571
    invoke-direct {v7, v2}, Lm4/q;-><init>(Lm4/p;)V

    .line 572
    .line 573
    .line 574
    new-instance v2, Lb7/i0;

    .line 575
    .line 576
    const/16 v8, 0xd

    .line 577
    .line 578
    invoke-direct {v2, v8, v1, v7}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    iget-object v11, v1, Lj5/q;->b:Ls4/g;

    .line 582
    .line 583
    new-instance v12, Landroidx/media3/exoplayer/offline/g;

    .line 584
    .line 585
    const/16 v8, 0xe

    .line 586
    .line 587
    invoke-direct {v12, v8, v2}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    new-instance v2, Lc7/e1;

    .line 591
    .line 592
    const/4 v8, 0x6

    .line 593
    invoke-direct {v2, v8}, Lc7/e1;-><init>(I)V

    .line 594
    .line 595
    .line 596
    new-instance v14, Lm3/l;

    .line 597
    .line 598
    invoke-direct {v14, v6}, Lm3/l;-><init>(I)V

    .line 599
    .line 600
    .line 601
    iget-object v6, v1, Lj5/q;->c:Lm3/l;

    .line 602
    .line 603
    invoke-virtual {v6, v7}, Lm3/l;->k(Lm4/q;)Z

    .line 604
    .line 605
    .line 606
    move-result v6

    .line 607
    if-eqz v6, :cond_12

    .line 608
    .line 609
    invoke-virtual {v7}, Lm4/q;->a()Lm4/p;

    .line 610
    .line 611
    .line 612
    move-result-object v6

    .line 613
    const-string v8, "application/x-media3-cues"

    .line 614
    .line 615
    invoke-static {v8}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v8

    .line 619
    iput-object v8, v6, Lm4/p;->m:Ljava/lang/String;

    .line 620
    .line 621
    iget-object v8, v7, Lm4/q;->n:Ljava/lang/String;

    .line 622
    .line 623
    iput-object v8, v6, Lm4/p;->j:Ljava/lang/String;

    .line 624
    .line 625
    iget-object v8, v1, Lj5/q;->c:Lm3/l;

    .line 626
    .line 627
    invoke-virtual {v8, v7}, Lm3/l;->e(Lm4/q;)I

    .line 628
    .line 629
    .line 630
    move-result v7

    .line 631
    iput v7, v6, Lm4/p;->I:I

    .line 632
    .line 633
    new-instance v7, Lm4/q;

    .line 634
    .line 635
    invoke-direct {v7, v6}, Lm4/q;-><init>(Lm4/p;)V

    .line 636
    .line 637
    .line 638
    :cond_12
    move-object/from16 v16, v7

    .line 639
    .line 640
    add-int/lit8 v6, v5, 0x1

    .line 641
    .line 642
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v7

    .line 646
    check-cast v7, Lm4/h0;

    .line 647
    .line 648
    iget-object v7, v7, Lm4/h0;->a:Landroid/net/Uri;

    .line 649
    .line 650
    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v7

    .line 654
    invoke-static {v7}, Lm4/i0;->b(Ljava/lang/String;)Lm4/i0;

    .line 655
    .line 656
    .line 657
    move-result-object v10

    .line 658
    iget-object v7, v10, Lm4/i0;->b:Lm4/d0;

    .line 659
    .line 660
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    new-instance v9, Lj5/w0;

    .line 664
    .line 665
    invoke-virtual {v2, v10}, Lc7/e1;->v(Lm4/i0;)Lb5/t;

    .line 666
    .line 667
    .line 668
    move-result-object v13

    .line 669
    const/high16 v15, 0x100000

    .line 670
    .line 671
    invoke-direct/range {v9 .. v16}, Lj5/w0;-><init>(Lm4/i0;Ls4/g;Landroidx/media3/exoplayer/offline/g;Lb5/t;Lm3/l;ILm4/q;)V

    .line 672
    .line 673
    .line 674
    aput-object v9, v4, v6

    .line 675
    .line 676
    goto :goto_10

    .line 677
    :cond_13
    iget-object v2, v1, Lj5/q;->b:Ls4/g;

    .line 678
    .line 679
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    new-instance v7, Lm3/l;

    .line 683
    .line 684
    invoke-direct {v7, v6}, Lm3/l;-><init>(I)V

    .line 685
    .line 686
    .line 687
    add-int/lit8 v6, v5, 0x1

    .line 688
    .line 689
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v8

    .line 693
    check-cast v8, Lm4/h0;

    .line 694
    .line 695
    new-instance v9, Lj5/k1;

    .line 696
    .line 697
    invoke-direct {v9, v8, v2, v7}, Lj5/k1;-><init>(Lm4/h0;Ls4/g;Lm3/l;)V

    .line 698
    .line 699
    .line 700
    aput-object v9, v4, v6

    .line 701
    .line 702
    :goto_10
    add-int/lit8 v5, v5, 0x1

    .line 703
    .line 704
    goto/16 :goto_f

    .line 705
    .line 706
    :cond_14
    new-instance v2, Lj5/n0;

    .line 707
    .line 708
    invoke-direct {v2, v4}, Lj5/n0;-><init>([Lj5/a;)V

    .line 709
    .line 710
    .line 711
    :cond_15
    move-object v6, v2

    .line 712
    iget-object v2, v0, Lm4/i0;->e:Lm4/y;

    .line 713
    .line 714
    iget-wide v7, v2, Lm4/x;->b:J

    .line 715
    .line 716
    const-wide/16 v3, 0x0

    .line 717
    .line 718
    cmp-long v5, v7, v3

    .line 719
    .line 720
    if-nez v5, :cond_16

    .line 721
    .line 722
    iget-wide v3, v2, Lm4/x;->d:J

    .line 723
    .line 724
    const-wide/high16 v9, -0x8000000000000000L

    .line 725
    .line 726
    cmp-long v5, v3, v9

    .line 727
    .line 728
    if-nez v5, :cond_16

    .line 729
    .line 730
    iget-boolean v3, v2, Lm4/x;->f:Z

    .line 731
    .line 732
    if-nez v3, :cond_16

    .line 733
    .line 734
    goto :goto_11

    .line 735
    :cond_16
    new-instance v5, Lj5/g;

    .line 736
    .line 737
    iget-wide v9, v2, Lm4/x;->d:J

    .line 738
    .line 739
    iget-boolean v3, v2, Lm4/x;->g:Z

    .line 740
    .line 741
    xor-int/lit8 v11, v3, 0x1

    .line 742
    .line 743
    iget-boolean v12, v2, Lm4/x;->e:Z

    .line 744
    .line 745
    iget-boolean v13, v2, Lm4/x;->f:Z

    .line 746
    .line 747
    invoke-direct/range {v5 .. v13}, Lj5/g;-><init>(Lj5/a;JJZZZ)V

    .line 748
    .line 749
    .line 750
    move-object v6, v5

    .line 751
    :goto_11
    iget-object v2, v0, Lm4/i0;->b:Lm4/d0;

    .line 752
    .line 753
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 754
    .line 755
    .line 756
    iget-object v0, v0, Lm4/i0;->b:Lm4/d0;

    .line 757
    .line 758
    iget-object v0, v0, Lm4/d0;->d:Lm4/v;

    .line 759
    .line 760
    if-nez v0, :cond_17

    .line 761
    .line 762
    return-object v6

    .line 763
    :cond_17
    const-string v0, "DMediaSourceFactory"

    .line 764
    .line 765
    const-string v2, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider."

    .line 766
    .line 767
    invoke-static {v0, v2}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    return-object v6

    .line 771
    :catch_0
    move-exception v0

    .line 772
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 773
    .line 774
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 775
    .line 776
    .line 777
    throw v2

    .line 778
    :cond_18
    move-object/from16 v16, v3

    .line 779
    .line 780
    iget-object v0, v0, Lm4/i0;->b:Lm4/d0;

    .line 781
    .line 782
    iget-wide v2, v0, Lm4/d0;->h:J

    .line 783
    .line 784
    sget v0, Lp4/c0;->a:I

    .line 785
    .line 786
    throw v16
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method

.method public final b(Lm3/l;)Lj5/c0;
    .locals 2

    .line 1
    iput-object p1, p0, Lj5/q;->c:Lm3/l;

    .line 2
    .line 3
    iget-object v0, p0, Lj5/q;->a:Ld0/y;

    .line 4
    .line 5
    iput-object p1, v0, Ld0/y;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v1, v0, Ld0/y;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lr5/l;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    iput-object p1, v1, Lr5/l;->c:Lm3/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v1

    .line 15
    iget-object v0, v0, Ld0/y;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lj5/c0;

    .line 38
    .line 39
    invoke-interface {v1, p1}, Lj5/c0;->b(Lm3/l;)Lj5/c0;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-object p0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw p1
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
.end method

.method public final c(Z)Lj5/c0;
    .locals 2

    .line 1
    iput-boolean p1, p0, Lj5/q;->i:Z

    .line 2
    .line 3
    iget-object v0, p0, Lj5/q;->a:Ld0/y;

    .line 4
    .line 5
    iput-boolean p1, v0, Ld0/y;->a:Z

    .line 6
    .line 7
    iget-object v1, v0, Ld0/y;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lr5/l;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    iput-boolean p1, v1, Lr5/l;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v1

    .line 15
    iget-object v0, v0, Ld0/y;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lj5/c0;

    .line 38
    .line 39
    invoke-interface {v1, p1}, Lj5/c0;->c(Z)Lj5/c0;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-object p0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw p1
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
.end method

.method public final d()Lj5/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/q;->a:Ld0/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Ld0/y;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr5/l;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    monitor-exit v0

    .line 12
    return-object p0
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
