.class public final Lv4/v;
.super Landroidx/lifecycle/q;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroidx/media3/exoplayer/ExoPlayer;


# instance fields
.field public final A:Lp4/f;

.field public final B:Lp4/f;

.field public final C:J

.field public D:I

.field public E:Z

.field public F:I

.field public G:I

.field public H:Z

.field public I:Lj5/f1;

.field public J:Lm4/u0;

.field public K:Lm4/l0;

.field public L:Lm4/l0;

.field public M:Ljava/lang/Object;

.field public N:Landroid/view/Surface;

.field public O:Landroid/view/SurfaceHolder;

.field public P:Lq5/k;

.field public Q:Z

.field public final R:I

.field public S:Lp4/u;

.field public T:Lm4/d;

.field public U:F

.field public V:Z

.field public W:Lo4/c;

.field public final X:Z

.field public Y:Z

.field public final Z:I

.field public final b:Lm5/u;

.field public final c:Lm4/u0;

.field public final d:Lp4/f;

.field public final e:Landroid/content/Context;

.field public final f:Lv4/v;

.field public final g:[Lv4/e;

.field public final h:[Lv4/e;

.field public final i:Lj2/b;

.field public final j:Lp4/x;

.field public final k:Lv4/q;

.field public final l:Lv4/c0;

.field public final m:Lp4/n;

.field public final n:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final o:Lm4/f1;

.field public final p:Ljava/util/ArrayList;

.field public final q:Z

.field public final q0:Lm4/k;

.field public final r:Lj5/c0;

.field public r0:Lm4/u1;

.field public final s:Lw4/d;

.field public s0:Lm4/l0;

.field public final t:Landroid/os/Looper;

.field public t0:Lv4/u0;

.field public final u:J

.field public u0:I

.field public final v:J

.field public v0:J

.field public final w:J

.field public final x:Lv4/s;

.field public final y:Lv4/t;

.field public final z:Lv4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer"

    .line 2
    .line 3
    invoke-static {v0}, Lm4/j0;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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

.method public constructor <init>(Lv4/n;)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, " [AndroidXMedia3/1.6.0-alpha01] ["

    .line 6
    .line 7
    const-string v3, "Init "

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    invoke-direct {v1, v4}, Landroidx/lifecycle/q;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v5, Lp4/f;

    .line 14
    .line 15
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v5, v1, Lv4/v;->d:Lp4/f;

    .line 19
    .line 20
    :try_start_0
    const-string v5, "ExoPlayerImpl"

    .line 21
    .line 22
    new-instance v6, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    sget-object v2, Lp4/c0;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, "]"

    .line 47
    .line 48
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v5, v2}, Lp4/c;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, v0, Lv4/n;->a:Landroid/content/Context;

    .line 59
    .line 60
    iget-object v3, v0, Lv4/n;->u:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v5, v0, Lv4/n;->b:Lp4/v;

    .line 63
    .line 64
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iput-object v6, v1, Lv4/v;->e:Landroid/content/Context;

    .line 69
    .line 70
    new-instance v6, Lw4/d;

    .line 71
    .line 72
    invoke-direct {v6, v5}, Lw4/d;-><init>(Lp4/v;)V

    .line 73
    .line 74
    .line 75
    iput-object v6, v1, Lv4/v;->s:Lw4/d;

    .line 76
    .line 77
    iget v6, v0, Lv4/n;->i:I

    .line 78
    .line 79
    iput v6, v1, Lv4/v;->Z:I

    .line 80
    .line 81
    iget-object v6, v0, Lv4/n;->j:Lm4/d;

    .line 82
    .line 83
    iput-object v6, v1, Lv4/v;->T:Lm4/d;

    .line 84
    .line 85
    iget v6, v0, Lv4/n;->k:I

    .line 86
    .line 87
    iput v6, v1, Lv4/v;->R:I

    .line 88
    .line 89
    const/4 v6, 0x0

    .line 90
    iput-boolean v6, v1, Lv4/v;->V:Z

    .line 91
    .line 92
    iget-wide v7, v0, Lv4/n;->r:J

    .line 93
    .line 94
    iput-wide v7, v1, Lv4/v;->C:J

    .line 95
    .line 96
    new-instance v11, Lv4/s;

    .line 97
    .line 98
    invoke-direct {v11, v1}, Lv4/s;-><init>(Lv4/v;)V

    .line 99
    .line 100
    .line 101
    iput-object v11, v1, Lv4/v;->x:Lv4/s;

    .line 102
    .line 103
    new-instance v7, Lv4/t;

    .line 104
    .line 105
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-object v7, v1, Lv4/v;->y:Lv4/t;

    .line 109
    .line 110
    new-instance v10, Landroid/os/Handler;

    .line 111
    .line 112
    iget-object v7, v0, Lv4/n;->h:Landroid/os/Looper;

    .line 113
    .line 114
    invoke-direct {v10, v7}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 115
    .line 116
    .line 117
    iget-object v7, v0, Lv4/n;->c:Lxa/i;

    .line 118
    .line 119
    invoke-interface {v7}, Lxa/i;->get()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    move-object v9, v7

    .line 124
    check-cast v9, Lv4/l;

    .line 125
    .line 126
    move-object v12, v11

    .line 127
    move-object v13, v11

    .line 128
    move-object v14, v11

    .line 129
    invoke-virtual/range {v9 .. v14}, Lv4/l;->b(Landroid/os/Handler;Lv4/s;Lv4/s;Lv4/s;Lv4/s;)[Lv4/e;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    iput-object v7, v1, Lv4/v;->g:[Lv4/e;

    .line 134
    .line 135
    array-length v8, v7

    .line 136
    if-lez v8, :cond_0

    .line 137
    .line 138
    const/4 v8, 0x1

    .line 139
    goto :goto_0

    .line 140
    :cond_0
    const/4 v8, 0x0

    .line 141
    :goto_0
    invoke-static {v8}, Lp4/c;->i(Z)V

    .line 142
    .line 143
    .line 144
    array-length v7, v7

    .line 145
    new-array v7, v7, [Lv4/e;

    .line 146
    .line 147
    iput-object v7, v1, Lv4/v;->h:[Lv4/e;

    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    :goto_1
    iget-object v8, v1, Lv4/v;->h:[Lv4/e;

    .line 151
    .line 152
    array-length v11, v8

    .line 153
    const/4 v12, 0x0

    .line 154
    if-ge v7, v11, :cond_1

    .line 155
    .line 156
    iget-object v11, v1, Lv4/v;->g:[Lv4/e;

    .line 157
    .line 158
    aget-object v11, v11, v7

    .line 159
    .line 160
    iget v11, v11, Lv4/e;->b:I

    .line 161
    .line 162
    aput-object v12, v8, v7

    .line 163
    .line 164
    add-int/lit8 v7, v7, 0x1

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :catchall_0
    move-exception v0

    .line 168
    goto/16 :goto_7

    .line 169
    .line 170
    :cond_1
    iget-object v7, v0, Lv4/n;->e:Lv4/b;

    .line 171
    .line 172
    invoke-virtual {v7}, Lv4/b;->get()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    move-object v8, v7

    .line 177
    check-cast v8, Lj2/b;

    .line 178
    .line 179
    iput-object v8, v1, Lv4/v;->i:Lj2/b;

    .line 180
    .line 181
    iget-object v7, v0, Lv4/n;->d:Lxa/i;

    .line 182
    .line 183
    invoke-interface {v7}, Lxa/i;->get()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    check-cast v7, Lj5/c0;

    .line 188
    .line 189
    iput-object v7, v1, Lv4/v;->r:Lj5/c0;

    .line 190
    .line 191
    iget-object v7, v0, Lv4/n;->g:Lv4/b;

    .line 192
    .line 193
    invoke-virtual {v7}, Lv4/b;->get()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    move-object v11, v7

    .line 198
    check-cast v11, Ln5/e;

    .line 199
    .line 200
    iget-boolean v7, v0, Lv4/n;->l:Z

    .line 201
    .line 202
    iput-boolean v7, v1, Lv4/v;->q:Z

    .line 203
    .line 204
    iget-object v15, v0, Lv4/n;->m:Lv4/b1;

    .line 205
    .line 206
    iget-wide v13, v0, Lv4/n;->n:J

    .line 207
    .line 208
    iput-wide v13, v1, Lv4/v;->u:J

    .line 209
    .line 210
    iget-wide v13, v0, Lv4/n;->o:J

    .line 211
    .line 212
    iput-wide v13, v1, Lv4/v;->v:J

    .line 213
    .line 214
    iget-wide v13, v0, Lv4/n;->p:J

    .line 215
    .line 216
    iput-wide v13, v1, Lv4/v;->w:J

    .line 217
    .line 218
    iget-object v7, v0, Lv4/n;->h:Landroid/os/Looper;

    .line 219
    .line 220
    iput-object v7, v1, Lv4/v;->t:Landroid/os/Looper;

    .line 221
    .line 222
    iput-object v1, v1, Lv4/v;->f:Lv4/v;

    .line 223
    .line 224
    new-instance v13, Lp4/n;

    .line 225
    .line 226
    new-instance v14, Lm4/d1;

    .line 227
    .line 228
    invoke-direct {v14, v1}, Lm4/d1;-><init>(Lv4/v;)V

    .line 229
    .line 230
    .line 231
    invoke-direct {v13, v7, v5, v14}, Lp4/n;-><init>(Landroid/os/Looper;Lp4/v;Lp4/l;)V

    .line 232
    .line 233
    .line 234
    iput-object v13, v1, Lv4/v;->m:Lp4/n;

    .line 235
    .line 236
    new-instance v13, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 237
    .line 238
    invoke-direct {v13}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 239
    .line 240
    .line 241
    iput-object v13, v1, Lv4/v;->n:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 242
    .line 243
    new-instance v14, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 246
    .line 247
    .line 248
    iput-object v14, v1, Lv4/v;->p:Ljava/util/ArrayList;

    .line 249
    .line 250
    new-instance v14, Lj5/f1;

    .line 251
    .line 252
    invoke-direct {v14}, Lj5/f1;-><init>()V

    .line 253
    .line 254
    .line 255
    iput-object v14, v1, Lv4/v;->I:Lj5/f1;

    .line 256
    .line 257
    new-instance v14, Lm5/u;

    .line 258
    .line 259
    iget-object v4, v1, Lv4/v;->g:[Lv4/e;

    .line 260
    .line 261
    array-length v6, v4

    .line 262
    new-array v6, v6, [Lv4/z0;

    .line 263
    .line 264
    array-length v4, v4

    .line 265
    new-array v4, v4, [Lm5/r;

    .line 266
    .line 267
    const/16 v17, 0x1

    .line 268
    .line 269
    sget-object v9, Lm4/q1;->b:Lm4/q1;

    .line 270
    .line 271
    invoke-direct {v14, v6, v4, v9, v12}, Lm5/u;-><init>([Lv4/z0;[Lm5/r;Lm4/q1;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    iput-object v14, v1, Lv4/v;->b:Lm5/u;

    .line 275
    .line 276
    new-instance v4, Lm4/f1;

    .line 277
    .line 278
    invoke-direct {v4}, Lm4/f1;-><init>()V

    .line 279
    .line 280
    .line 281
    iput-object v4, v1, Lv4/v;->o:Lm4/f1;

    .line 282
    .line 283
    new-instance v4, Landroid/util/SparseBooleanArray;

    .line 284
    .line 285
    invoke-direct {v4}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 286
    .line 287
    .line 288
    const/16 v6, 0x14

    .line 289
    .line 290
    new-array v6, v6, [I

    .line 291
    .line 292
    fill-array-data v6, :array_0

    .line 293
    .line 294
    .line 295
    array-length v9, v6

    .line 296
    const/4 v12, 0x0

    .line 297
    :goto_2
    if-ge v12, v9, :cond_2

    .line 298
    .line 299
    move-object/from16 v19, v6

    .line 300
    .line 301
    aget v6, v19, v12

    .line 302
    .line 303
    const/16 v20, 0x0

    .line 304
    .line 305
    xor-int/lit8 v20, v20, 0x1

    .line 306
    .line 307
    invoke-static/range {v20 .. v20}, Lp4/c;->i(Z)V

    .line 308
    .line 309
    .line 310
    move-object/from16 v20, v8

    .line 311
    .line 312
    const/4 v8, 0x1

    .line 313
    invoke-virtual {v4, v6, v8}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 314
    .line 315
    .line 316
    add-int/lit8 v12, v12, 0x1

    .line 317
    .line 318
    move-object/from16 v6, v19

    .line 319
    .line 320
    move-object/from16 v8, v20

    .line 321
    .line 322
    const/16 v17, 0x1

    .line 323
    .line 324
    goto :goto_2

    .line 325
    :cond_2
    move-object/from16 v20, v8

    .line 326
    .line 327
    const/4 v6, 0x0

    .line 328
    const/4 v8, 0x1

    .line 329
    xor-int/2addr v6, v8

    .line 330
    invoke-static {v6}, Lp4/c;->i(Z)V

    .line 331
    .line 332
    .line 333
    const/16 v6, 0x1d

    .line 334
    .line 335
    invoke-virtual {v4, v6, v8}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 336
    .line 337
    .line 338
    new-instance v6, Lm4/u0;

    .line 339
    .line 340
    const/4 v9, 0x0

    .line 341
    xor-int/2addr v9, v8

    .line 342
    invoke-static {v9}, Lp4/c;->i(Z)V

    .line 343
    .line 344
    .line 345
    new-instance v8, Lm4/o;

    .line 346
    .line 347
    invoke-direct {v8, v4}, Lm4/o;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 348
    .line 349
    .line 350
    invoke-direct {v6, v8}, Lm4/u0;-><init>(Lm4/o;)V

    .line 351
    .line 352
    .line 353
    iput-object v6, v1, Lv4/v;->c:Lm4/u0;

    .line 354
    .line 355
    new-instance v4, Landroid/util/SparseBooleanArray;

    .line 356
    .line 357
    invoke-direct {v4}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 358
    .line 359
    .line 360
    const/4 v6, 0x0

    .line 361
    :goto_3
    iget-object v9, v8, Lm4/o;->a:Landroid/util/SparseBooleanArray;

    .line 362
    .line 363
    invoke-virtual {v9}, Landroid/util/SparseBooleanArray;->size()I

    .line 364
    .line 365
    .line 366
    move-result v9

    .line 367
    if-ge v6, v9, :cond_3

    .line 368
    .line 369
    invoke-virtual {v8, v6}, Lm4/o;->b(I)I

    .line 370
    .line 371
    .line 372
    move-result v9

    .line 373
    const/4 v12, 0x1

    .line 374
    const/16 v19, 0x0

    .line 375
    .line 376
    xor-int/lit8 v17, v19, 0x1

    .line 377
    .line 378
    invoke-static/range {v17 .. v17}, Lp4/c;->i(Z)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v4, v9, v12}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 382
    .line 383
    .line 384
    add-int/lit8 v6, v6, 0x1

    .line 385
    .line 386
    goto :goto_3

    .line 387
    :cond_3
    const/4 v6, 0x0

    .line 388
    const/4 v8, 0x1

    .line 389
    xor-int/2addr v6, v8

    .line 390
    invoke-static {v6}, Lp4/c;->i(Z)V

    .line 391
    .line 392
    .line 393
    const/4 v6, 0x4

    .line 394
    invoke-virtual {v4, v6, v8}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 395
    .line 396
    .line 397
    const/4 v9, 0x0

    .line 398
    xor-int/2addr v9, v8

    .line 399
    invoke-static {v9}, Lp4/c;->i(Z)V

    .line 400
    .line 401
    .line 402
    const/16 v9, 0xa

    .line 403
    .line 404
    invoke-virtual {v4, v9, v8}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 405
    .line 406
    .line 407
    new-instance v12, Lm4/u0;

    .line 408
    .line 409
    const/16 v17, 0x0

    .line 410
    .line 411
    xor-int/lit8 v17, v17, 0x1

    .line 412
    .line 413
    invoke-static/range {v17 .. v17}, Lp4/c;->i(Z)V

    .line 414
    .line 415
    .line 416
    new-instance v6, Lm4/o;

    .line 417
    .line 418
    invoke-direct {v6, v4}, Lm4/o;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 419
    .line 420
    .line 421
    invoke-direct {v12, v6}, Lm4/u0;-><init>(Lm4/o;)V

    .line 422
    .line 423
    .line 424
    iput-object v12, v1, Lv4/v;->J:Lm4/u0;

    .line 425
    .line 426
    const/4 v4, 0x0

    .line 427
    invoke-virtual {v5, v7, v4}, Lp4/v;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lp4/x;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    iput-object v6, v1, Lv4/v;->j:Lp4/x;

    .line 432
    .line 433
    new-instance v6, Lv4/q;

    .line 434
    .line 435
    const/4 v12, 0x0

    .line 436
    invoke-direct {v6, v1, v12}, Lv4/q;-><init>(Lv4/v;I)V

    .line 437
    .line 438
    .line 439
    iput-object v6, v1, Lv4/v;->k:Lv4/q;

    .line 440
    .line 441
    invoke-static {v14}, Lv4/u0;->h(Lm5/u;)Lv4/u0;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    iput-object v4, v1, Lv4/v;->t0:Lv4/u0;

    .line 446
    .line 447
    iget-object v4, v1, Lv4/v;->s:Lw4/d;

    .line 448
    .line 449
    invoke-virtual {v4, v1, v7}, Lw4/d;->b0(Lv4/v;Landroid/os/Looper;)V

    .line 450
    .line 451
    .line 452
    sget v4, Lp4/c0;->a:I

    .line 453
    .line 454
    const/16 v8, 0x1f

    .line 455
    .line 456
    if-ge v4, v8, :cond_4

    .line 457
    .line 458
    new-instance v4, Lw4/k;

    .line 459
    .line 460
    invoke-direct {v4, v3}, Lw4/k;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    :goto_4
    move-object/from16 v18, v5

    .line 464
    .line 465
    const/4 v3, 0x0

    .line 466
    goto :goto_5

    .line 467
    :cond_4
    iget-object v4, v1, Lv4/v;->e:Landroid/content/Context;

    .line 468
    .line 469
    iget-boolean v8, v0, Lv4/n;->s:Z

    .line 470
    .line 471
    invoke-static {v4, v1, v8, v3}, Lua/j;->x(Landroid/content/Context;Lv4/v;ZLjava/lang/String;)Lw4/k;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    goto :goto_4

    .line 476
    :goto_5
    new-instance v5, Lv4/c0;

    .line 477
    .line 478
    move-object/from16 v19, v6

    .line 479
    .line 480
    iget-object v6, v1, Lv4/v;->g:[Lv4/e;

    .line 481
    .line 482
    move-object/from16 v17, v7

    .line 483
    .line 484
    const/4 v8, 0x4

    .line 485
    iget-object v7, v1, Lv4/v;->h:[Lv4/e;

    .line 486
    .line 487
    iget-object v3, v0, Lv4/n;->f:Lxa/i;

    .line 488
    .line 489
    invoke-interface {v3}, Lxa/i;->get()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    check-cast v3, Lv4/j;

    .line 494
    .line 495
    const/16 v21, 0x0

    .line 496
    .line 497
    iget v12, v1, Lv4/v;->D:I

    .line 498
    .line 499
    move-object/from16 v22, v13

    .line 500
    .line 501
    iget-boolean v13, v1, Lv4/v;->E:Z

    .line 502
    .line 503
    move-object v9, v14

    .line 504
    const/16 v23, 0xa

    .line 505
    .line 506
    iget-object v14, v1, Lv4/v;->s:Lw4/d;

    .line 507
    .line 508
    iget-object v0, v0, Lv4/n;->q:Lv4/h;

    .line 509
    .line 510
    move-object/from16 v16, v0

    .line 511
    .line 512
    move-object v0, v10

    .line 513
    move-object/from16 v8, v20

    .line 514
    .line 515
    move-object v10, v3

    .line 516
    move-object/from16 v20, v4

    .line 517
    .line 518
    move-object/from16 v3, v22

    .line 519
    .line 520
    const/4 v4, 0x0

    .line 521
    invoke-direct/range {v5 .. v20}, Lv4/c0;-><init>([Lv4/e;[Lv4/e;Lj2/b;Lm5/u;Lv4/j;Ln5/e;IZLw4/d;Lv4/b1;Lv4/h;Landroid/os/Looper;Lp4/v;Lv4/q;Lw4/k;)V

    .line 522
    .line 523
    .line 524
    move-object v7, v5

    .line 525
    move-object/from16 v6, v17

    .line 526
    .line 527
    move-object/from16 v5, v18

    .line 528
    .line 529
    iput-object v7, v1, Lv4/v;->l:Lv4/c0;

    .line 530
    .line 531
    iget-object v7, v7, Lv4/c0;->j:Landroid/os/Looper;

    .line 532
    .line 533
    const/high16 v9, 0x3f800000    # 1.0f

    .line 534
    .line 535
    iput v9, v1, Lv4/v;->U:F

    .line 536
    .line 537
    iput v4, v1, Lv4/v;->D:I

    .line 538
    .line 539
    sget-object v9, Lm4/l0;->K:Lm4/l0;

    .line 540
    .line 541
    iput-object v9, v1, Lv4/v;->K:Lm4/l0;

    .line 542
    .line 543
    iput-object v9, v1, Lv4/v;->L:Lm4/l0;

    .line 544
    .line 545
    iput-object v9, v1, Lv4/v;->s0:Lm4/l0;

    .line 546
    .line 547
    const/4 v9, -0x1

    .line 548
    iput v9, v1, Lv4/v;->u0:I

    .line 549
    .line 550
    iget-object v10, v1, Lv4/v;->e:Landroid/content/Context;

    .line 551
    .line 552
    const-string v12, "audio"

    .line 553
    .line 554
    invoke-virtual {v10, v12}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v10

    .line 558
    check-cast v10, Landroid/media/AudioManager;

    .line 559
    .line 560
    if-nez v10, :cond_5

    .line 561
    .line 562
    const/4 v10, -0x1

    .line 563
    goto :goto_6

    .line 564
    :cond_5
    invoke-virtual {v10}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 565
    .line 566
    .line 567
    move-result v10

    .line 568
    :goto_6
    sget-object v12, Lo4/c;->c:Lo4/c;

    .line 569
    .line 570
    iput-object v12, v1, Lv4/v;->W:Lo4/c;

    .line 571
    .line 572
    const/4 v12, 0x1

    .line 573
    iput-boolean v12, v1, Lv4/v;->X:Z

    .line 574
    .line 575
    iget-object v12, v1, Lv4/v;->s:Lw4/d;

    .line 576
    .line 577
    iget-object v13, v1, Lv4/v;->m:Lp4/n;

    .line 578
    .line 579
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v13, v12}, Lp4/n;->a(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    new-instance v12, Landroid/os/Handler;

    .line 586
    .line 587
    invoke-direct {v12, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 588
    .line 589
    .line 590
    iget-object v6, v1, Lv4/v;->s:Lw4/d;

    .line 591
    .line 592
    check-cast v11, Ln5/i;

    .line 593
    .line 594
    invoke-virtual {v11, v12, v6}, Ln5/i;->a(Landroid/os/Handler;Lw4/d;)V

    .line 595
    .line 596
    .line 597
    iget-object v6, v1, Lv4/v;->x:Lv4/s;

    .line 598
    .line 599
    invoke-virtual {v3, v6}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    new-instance v3, Lb7/n;

    .line 603
    .line 604
    iget-object v6, v1, Lv4/v;->x:Lv4/s;

    .line 605
    .line 606
    invoke-direct {v3, v2, v0, v6}, Lb7/n;-><init>(Landroid/content/Context;Landroid/os/Handler;Lv4/s;)V

    .line 607
    .line 608
    .line 609
    iget-object v6, v3, Lb7/n;->d:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast v6, Lv4/a;

    .line 612
    .line 613
    iget-object v11, v3, Lb7/n;->c:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v11, Landroid/content/Context;

    .line 616
    .line 617
    iget-boolean v12, v3, Lb7/n;->b:Z

    .line 618
    .line 619
    if-eqz v12, :cond_6

    .line 620
    .line 621
    invoke-virtual {v11, v6}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 622
    .line 623
    .line 624
    iput-boolean v4, v3, Lb7/n;->b:Z

    .line 625
    .line 626
    :cond_6
    new-instance v3, Lv4/d;

    .line 627
    .line 628
    iget-object v6, v1, Lv4/v;->x:Lv4/s;

    .line 629
    .line 630
    invoke-direct {v3, v2, v0, v6}, Lv4/d;-><init>(Landroid/content/Context;Landroid/os/Handler;Lv4/s;)V

    .line 631
    .line 632
    .line 633
    iput-object v3, v1, Lv4/v;->z:Lv4/d;

    .line 634
    .line 635
    const/4 v0, 0x0

    .line 636
    invoke-virtual {v3, v0}, Lv4/d;->b(Lm4/d;)V

    .line 637
    .line 638
    .line 639
    new-instance v0, Lp4/f;

    .line 640
    .line 641
    const/4 v3, 0x2

    .line 642
    invoke-direct {v0, v2, v7, v5, v3}, Lp4/f;-><init>(Landroid/content/Context;Landroid/os/Looper;Lp4/v;I)V

    .line 643
    .line 644
    .line 645
    iput-object v0, v1, Lv4/v;->A:Lp4/f;

    .line 646
    .line 647
    new-instance v0, Lp4/f;

    .line 648
    .line 649
    const/4 v3, 0x3

    .line 650
    invoke-direct {v0, v2, v7, v5, v3}, Lp4/f;-><init>(Landroid/content/Context;Landroid/os/Looper;Lp4/v;I)V

    .line 651
    .line 652
    .line 653
    iput-object v0, v1, Lv4/v;->B:Lp4/f;

    .line 654
    .line 655
    sget-object v0, Lm4/k;->e:Lm4/k;

    .line 656
    .line 657
    iput-object v0, v1, Lv4/v;->q0:Lm4/k;

    .line 658
    .line 659
    sget-object v0, Lm4/u1;->d:Lm4/u1;

    .line 660
    .line 661
    iput-object v0, v1, Lv4/v;->r0:Lm4/u1;

    .line 662
    .line 663
    sget-object v0, Lp4/u;->c:Lp4/u;

    .line 664
    .line 665
    iput-object v0, v1, Lv4/v;->S:Lp4/u;

    .line 666
    .line 667
    iget-object v0, v1, Lv4/v;->T:Lm4/d;

    .line 668
    .line 669
    invoke-virtual {v8, v0}, Lj2/b;->e(Lm4/d;)V

    .line 670
    .line 671
    .line 672
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    const/16 v2, 0xa

    .line 677
    .line 678
    const/4 v8, 0x1

    .line 679
    invoke-virtual {v1, v8, v2, v0}, Lv4/v;->a2(IILjava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    const/4 v5, 0x2

    .line 687
    invoke-virtual {v1, v5, v2, v0}, Lv4/v;->a2(IILjava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    iget-object v0, v1, Lv4/v;->T:Lm4/d;

    .line 691
    .line 692
    invoke-virtual {v1, v8, v3, v0}, Lv4/v;->a2(IILjava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    iget v0, v1, Lv4/v;->R:I

    .line 696
    .line 697
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    const/4 v8, 0x4

    .line 702
    invoke-virtual {v1, v5, v8, v0}, Lv4/v;->a2(IILjava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    const/4 v2, 0x5

    .line 710
    invoke-virtual {v1, v5, v2, v0}, Lv4/v;->a2(IILjava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    iget-boolean v0, v1, Lv4/v;->V:Z

    .line 714
    .line 715
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    const/16 v2, 0x9

    .line 720
    .line 721
    const/4 v8, 0x1

    .line 722
    invoke-virtual {v1, v8, v2, v0}, Lv4/v;->a2(IILjava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    iget-object v0, v1, Lv4/v;->y:Lv4/t;

    .line 726
    .line 727
    const/4 v2, 0x7

    .line 728
    const/4 v3, 0x2

    .line 729
    invoke-virtual {v1, v3, v2, v0}, Lv4/v;->a2(IILjava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    iget-object v0, v1, Lv4/v;->y:Lv4/t;

    .line 733
    .line 734
    const/4 v2, 0x6

    .line 735
    const/16 v3, 0x8

    .line 736
    .line 737
    invoke-virtual {v1, v2, v3, v0}, Lv4/v;->a2(IILjava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    iget v0, v1, Lv4/v;->Z:I

    .line 741
    .line 742
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    const/16 v2, 0x10

    .line 747
    .line 748
    invoke-virtual {v1, v9, v2, v0}, Lv4/v;->a2(IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 749
    .line 750
    .line 751
    iget-object v0, v1, Lv4/v;->d:Lp4/f;

    .line 752
    .line 753
    invoke-virtual {v0}, Lp4/f;->f()Z

    .line 754
    .line 755
    .line 756
    return-void

    .line 757
    :goto_7
    iget-object v2, v1, Lv4/v;->d:Lp4/f;

    .line 758
    .line 759
    invoke-virtual {v2}, Lp4/f;->f()Z

    .line 760
    .line 761
    .line 762
    throw v0

    .line 763
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x1e
        0x15
        0x23
        0x16
        0x18
        0x1b
        0x1c
        0x20
    .end array-data
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
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

.method public static P1(Lv4/u0;)J
    .locals 7

    .line 1
    new-instance v0, Lm4/h1;

    .line 2
    .line 3
    invoke-direct {v0}, Lm4/h1;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lm4/f1;

    .line 7
    .line 8
    invoke-direct {v1}, Lm4/f1;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lv4/u0;->a:Lm4/i1;

    .line 12
    .line 13
    iget-object v3, p0, Lv4/u0;->b:Lj5/d0;

    .line 14
    .line 15
    iget-object v3, v3, Lj5/d0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 18
    .line 19
    .line 20
    iget-wide v2, p0, Lv4/u0;->c:J

    .line 21
    .line 22
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v6, v2, v4

    .line 28
    .line 29
    if-nez v6, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, Lv4/u0;->a:Lm4/i1;

    .line 32
    .line 33
    iget v1, v1, Lm4/f1;->c:I

    .line 34
    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0, v2, v3}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-wide v0, p0, Lm4/h1;->l:J

    .line 42
    .line 43
    return-wide v0

    .line 44
    :cond_0
    iget-wide v0, v1, Lm4/f1;->e:J

    .line 45
    .line 46
    add-long/2addr v0, v2

    .line 47
    return-wide v0
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


# virtual methods
.method public final A0(Ljava/util/List;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lv4/v;->F1(Ljava/util/List;)Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 9
    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    move-object v0, p0

    .line 19
    invoke-virtual/range {v0 .. v5}, Lv4/v;->b2(Ljava/util/ArrayList;IJZ)V

    .line 20
    .line 21
    .line 22
    return-void
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
.end method

.method public final B()Lm4/r0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    iget-object v0, v0, Lv4/u0;->f:Lv4/m;

    .line 7
    .line 8
    return-object v0
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

.method public final B1(ILjava/util/List;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lv4/v;->F1(Ljava/util/List;)Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    if-ltz p1, :cond_0

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v5, 0x0

    .line 18
    :goto_0
    invoke-static {v5}, Lp4/c;->c(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v5, p0, Lv4/v;->p:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-static {p1, v6}, Ljava/lang/Math;->min(II)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_2

    .line 36
    .line 37
    iget v1, p0, Lv4/v;->u0:I

    .line 38
    .line 39
    const/4 v5, -0x1

    .line 40
    if-ne v1, v5, :cond_1

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 v5, 0x0

    .line 45
    :goto_1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 46
    .line 47
    .line 48
    move-object v1, v2

    .line 49
    const/4 v2, -0x1

    .line 50
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    move-object v0, p0

    .line 56
    invoke-virtual/range {v0 .. v5}, Lv4/v;->b2(Ljava/util/ArrayList;IJZ)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    iget-object v3, p0, Lv4/v;->t0:Lv4/u0;

    .line 61
    .line 62
    invoke-virtual {p0, v3, v1, v2}, Lv4/v;->D1(Lv4/u0;ILjava/util/ArrayList;)Lv4/u0;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const/4 v7, -0x1

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v2, 0x0

    .line 69
    const/4 v3, 0x0

    .line 70
    const/4 v4, 0x5

    .line 71
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    move-object v0, p0

    .line 77
    invoke-virtual/range {v0 .. v8}, Lv4/v;->k2(Lv4/u0;IZIJIZ)V

    .line 78
    .line 79
    .line 80
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
.end method

.method public final C()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lv4/v;->J1(Lv4/u0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
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

.method public final C1(ILjava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Lv4/s0;

    .line 14
    .line 15
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lj5/a;

    .line 20
    .line 21
    iget-boolean v4, p0, Lv4/v;->q:Z

    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, Lv4/s0;-><init>(Lj5/a;Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    add-int v3, v1, p1

    .line 30
    .line 31
    new-instance v4, Lv4/u;

    .line 32
    .line 33
    iget-object v5, v2, Lv4/s0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v2, v2, Lv4/s0;->a:Lj5/y;

    .line 36
    .line 37
    invoke-direct {v4, v5, v2}, Lv4/u;-><init>(Ljava/lang/Object;Lj5/y;)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lv4/v;->p:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v2, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object p2, p0, Lv4/v;->I:Lj5/f1;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {p2, p1, v1}, Lj5/f1;->a(II)Lj5/f1;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lv4/v;->I:Lj5/f1;

    .line 59
    .line 60
    return-object v0
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
.end method

.method public final D()Lm4/q1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    iget-object v0, v0, Lv4/u0;->i:Lm5/u;

    .line 7
    .line 8
    iget-object v0, v0, Lm5/u;->d:Lm4/q1;

    .line 9
    .line 10
    return-object v0
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

.method public final D1(Lv4/u0;ILjava/util/ArrayList;)Lv4/u0;
    .locals 8

    .line 1
    iget-object v1, p1, Lv4/u0;->a:Lm4/i1;

    .line 2
    .line 3
    iget v0, p0, Lv4/v;->F:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    iput v0, p0, Lv4/v;->F:I

    .line 8
    .line 9
    invoke-virtual {p0, p2, p3}, Lv4/v;->C1(ILjava/util/ArrayList;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    new-instance v2, Lv4/y0;

    .line 14
    .line 15
    iget-object v0, p0, Lv4/v;->p:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v3, p0, Lv4/v;->I:Lj5/f1;

    .line 18
    .line 19
    invoke-direct {v2, v0, v3}, Lv4/y0;-><init>(Ljava/util/ArrayList;Lj5/f1;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lv4/v;->L1(Lv4/u0;)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {p0, p1}, Lv4/v;->J1(Lv4/u0;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    move-object v0, p0

    .line 31
    invoke-virtual/range {v0 .. v5}, Lv4/v;->N1(Lm4/i1;Lv4/y0;IJ)Landroid/util/Pair;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0, p1, v2, v1}, Lv4/v;->Q1(Lv4/u0;Lm4/i1;Landroid/util/Pair;)Lv4/u0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v4, v0, Lv4/v;->I:Lj5/f1;

    .line 40
    .line 41
    iget-object v1, v0, Lv4/v;->l:Lv4/c0;

    .line 42
    .line 43
    iget-object v1, v1, Lv4/c0;->h:Lp4/x;

    .line 44
    .line 45
    new-instance v2, Lv4/x;

    .line 46
    .line 47
    const/4 v5, -0x1

    .line 48
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    move-object v3, p3

    .line 54
    invoke-direct/range {v2 .. v7}, Lv4/x;-><init>(Ljava/util/ArrayList;Lj5/f1;IJ)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lp4/x;->b()Lp4/w;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    iget-object v1, v1, Lp4/x;->a:Landroid/os/Handler;

    .line 65
    .line 66
    const/16 v3, 0x12

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-virtual {v1, v3, p2, v4, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    iput-object p2, p3, Lp4/w;->a:Landroid/os/Message;

    .line 74
    .line 75
    invoke-virtual {p3}, Lp4/w;->b()V

    .line 76
    .line 77
    .line 78
    return-object p1
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

.method public final E1()Lm4/l0;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lv4/v;->J()Lm4/i1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lm4/i1;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lv4/v;->s0:Lm4/l0;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lv4/v;->G()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lm4/h1;

    .line 21
    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2, v3, v4}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, Lm4/h1;->c:Lm4/i0;

    .line 29
    .line 30
    iget-object v1, p0, Lv4/v;->s0:Lm4/l0;

    .line 31
    .line 32
    invoke-virtual {v1}, Lm4/l0;->a()Lm4/k0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v0, v0, Lm4/i0;->d:Lm4/l0;

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_1
    iget-object v2, v0, Lm4/l0;->J:Lya/i0;

    .line 43
    .line 44
    iget-object v3, v0, Lm4/l0;->k:[B

    .line 45
    .line 46
    iget-object v4, v0, Lm4/l0;->a:Ljava/lang/CharSequence;

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    iput-object v4, v1, Lm4/k0;->a:Ljava/lang/CharSequence;

    .line 51
    .line 52
    :cond_2
    iget-object v4, v0, Lm4/l0;->b:Ljava/lang/CharSequence;

    .line 53
    .line 54
    if-eqz v4, :cond_3

    .line 55
    .line 56
    iput-object v4, v1, Lm4/k0;->b:Ljava/lang/CharSequence;

    .line 57
    .line 58
    :cond_3
    iget-object v4, v0, Lm4/l0;->c:Ljava/lang/CharSequence;

    .line 59
    .line 60
    if-eqz v4, :cond_4

    .line 61
    .line 62
    iput-object v4, v1, Lm4/k0;->c:Ljava/lang/CharSequence;

    .line 63
    .line 64
    :cond_4
    iget-object v4, v0, Lm4/l0;->d:Ljava/lang/CharSequence;

    .line 65
    .line 66
    if-eqz v4, :cond_5

    .line 67
    .line 68
    iput-object v4, v1, Lm4/k0;->d:Ljava/lang/CharSequence;

    .line 69
    .line 70
    :cond_5
    iget-object v4, v0, Lm4/l0;->e:Ljava/lang/CharSequence;

    .line 71
    .line 72
    if-eqz v4, :cond_6

    .line 73
    .line 74
    iput-object v4, v1, Lm4/k0;->e:Ljava/lang/CharSequence;

    .line 75
    .line 76
    :cond_6
    iget-object v4, v0, Lm4/l0;->f:Ljava/lang/CharSequence;

    .line 77
    .line 78
    if-eqz v4, :cond_7

    .line 79
    .line 80
    iput-object v4, v1, Lm4/k0;->f:Ljava/lang/CharSequence;

    .line 81
    .line 82
    :cond_7
    iget-object v4, v0, Lm4/l0;->g:Ljava/lang/CharSequence;

    .line 83
    .line 84
    if-eqz v4, :cond_8

    .line 85
    .line 86
    iput-object v4, v1, Lm4/k0;->g:Ljava/lang/CharSequence;

    .line 87
    .line 88
    :cond_8
    iget-object v4, v0, Lm4/l0;->h:Ljava/lang/Long;

    .line 89
    .line 90
    if-eqz v4, :cond_9

    .line 91
    .line 92
    invoke-virtual {v1, v4}, Lm4/k0;->c(Ljava/lang/Long;)V

    .line 93
    .line 94
    .line 95
    :cond_9
    iget-object v4, v0, Lm4/l0;->i:Lm4/z0;

    .line 96
    .line 97
    if-eqz v4, :cond_a

    .line 98
    .line 99
    iput-object v4, v1, Lm4/k0;->i:Lm4/z0;

    .line 100
    .line 101
    :cond_a
    iget-object v4, v0, Lm4/l0;->j:Lm4/z0;

    .line 102
    .line 103
    if-eqz v4, :cond_b

    .line 104
    .line 105
    iput-object v4, v1, Lm4/k0;->j:Lm4/z0;

    .line 106
    .line 107
    :cond_b
    iget-object v4, v0, Lm4/l0;->m:Landroid/net/Uri;

    .line 108
    .line 109
    if-nez v4, :cond_c

    .line 110
    .line 111
    if-eqz v3, :cond_d

    .line 112
    .line 113
    :cond_c
    iput-object v4, v1, Lm4/k0;->m:Landroid/net/Uri;

    .line 114
    .line 115
    iget-object v4, v0, Lm4/l0;->l:Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {v1, v3, v4}, Lm4/k0;->b([BLjava/lang/Integer;)V

    .line 118
    .line 119
    .line 120
    :cond_d
    iget-object v3, v0, Lm4/l0;->n:Ljava/lang/Integer;

    .line 121
    .line 122
    if-eqz v3, :cond_e

    .line 123
    .line 124
    iput-object v3, v1, Lm4/k0;->n:Ljava/lang/Integer;

    .line 125
    .line 126
    :cond_e
    iget-object v3, v0, Lm4/l0;->o:Ljava/lang/Integer;

    .line 127
    .line 128
    if-eqz v3, :cond_f

    .line 129
    .line 130
    iput-object v3, v1, Lm4/k0;->o:Ljava/lang/Integer;

    .line 131
    .line 132
    :cond_f
    iget-object v3, v0, Lm4/l0;->p:Ljava/lang/Integer;

    .line 133
    .line 134
    if-eqz v3, :cond_10

    .line 135
    .line 136
    iput-object v3, v1, Lm4/k0;->p:Ljava/lang/Integer;

    .line 137
    .line 138
    :cond_10
    iget-object v3, v0, Lm4/l0;->q:Ljava/lang/Boolean;

    .line 139
    .line 140
    if-eqz v3, :cond_11

    .line 141
    .line 142
    iput-object v3, v1, Lm4/k0;->q:Ljava/lang/Boolean;

    .line 143
    .line 144
    :cond_11
    iget-object v3, v0, Lm4/l0;->r:Ljava/lang/Boolean;

    .line 145
    .line 146
    if-eqz v3, :cond_12

    .line 147
    .line 148
    iput-object v3, v1, Lm4/k0;->r:Ljava/lang/Boolean;

    .line 149
    .line 150
    :cond_12
    iget-object v3, v0, Lm4/l0;->s:Ljava/lang/Integer;

    .line 151
    .line 152
    if-eqz v3, :cond_13

    .line 153
    .line 154
    iput-object v3, v1, Lm4/k0;->s:Ljava/lang/Integer;

    .line 155
    .line 156
    :cond_13
    iget-object v3, v0, Lm4/l0;->t:Ljava/lang/Integer;

    .line 157
    .line 158
    if-eqz v3, :cond_14

    .line 159
    .line 160
    iput-object v3, v1, Lm4/k0;->s:Ljava/lang/Integer;

    .line 161
    .line 162
    :cond_14
    iget-object v3, v0, Lm4/l0;->u:Ljava/lang/Integer;

    .line 163
    .line 164
    if-eqz v3, :cond_15

    .line 165
    .line 166
    iput-object v3, v1, Lm4/k0;->t:Ljava/lang/Integer;

    .line 167
    .line 168
    :cond_15
    iget-object v3, v0, Lm4/l0;->v:Ljava/lang/Integer;

    .line 169
    .line 170
    if-eqz v3, :cond_16

    .line 171
    .line 172
    iput-object v3, v1, Lm4/k0;->u:Ljava/lang/Integer;

    .line 173
    .line 174
    :cond_16
    iget-object v3, v0, Lm4/l0;->w:Ljava/lang/Integer;

    .line 175
    .line 176
    if-eqz v3, :cond_17

    .line 177
    .line 178
    iput-object v3, v1, Lm4/k0;->v:Ljava/lang/Integer;

    .line 179
    .line 180
    :cond_17
    iget-object v3, v0, Lm4/l0;->x:Ljava/lang/Integer;

    .line 181
    .line 182
    if-eqz v3, :cond_18

    .line 183
    .line 184
    iput-object v3, v1, Lm4/k0;->w:Ljava/lang/Integer;

    .line 185
    .line 186
    :cond_18
    iget-object v3, v0, Lm4/l0;->y:Ljava/lang/Integer;

    .line 187
    .line 188
    if-eqz v3, :cond_19

    .line 189
    .line 190
    iput-object v3, v1, Lm4/k0;->x:Ljava/lang/Integer;

    .line 191
    .line 192
    :cond_19
    iget-object v3, v0, Lm4/l0;->z:Ljava/lang/CharSequence;

    .line 193
    .line 194
    if-eqz v3, :cond_1a

    .line 195
    .line 196
    iput-object v3, v1, Lm4/k0;->y:Ljava/lang/CharSequence;

    .line 197
    .line 198
    :cond_1a
    iget-object v3, v0, Lm4/l0;->A:Ljava/lang/CharSequence;

    .line 199
    .line 200
    if-eqz v3, :cond_1b

    .line 201
    .line 202
    iput-object v3, v1, Lm4/k0;->z:Ljava/lang/CharSequence;

    .line 203
    .line 204
    :cond_1b
    iget-object v3, v0, Lm4/l0;->B:Ljava/lang/CharSequence;

    .line 205
    .line 206
    if-eqz v3, :cond_1c

    .line 207
    .line 208
    iput-object v3, v1, Lm4/k0;->A:Ljava/lang/CharSequence;

    .line 209
    .line 210
    :cond_1c
    iget-object v3, v0, Lm4/l0;->C:Ljava/lang/Integer;

    .line 211
    .line 212
    if-eqz v3, :cond_1d

    .line 213
    .line 214
    iput-object v3, v1, Lm4/k0;->B:Ljava/lang/Integer;

    .line 215
    .line 216
    :cond_1d
    iget-object v3, v0, Lm4/l0;->D:Ljava/lang/Integer;

    .line 217
    .line 218
    if-eqz v3, :cond_1e

    .line 219
    .line 220
    iput-object v3, v1, Lm4/k0;->C:Ljava/lang/Integer;

    .line 221
    .line 222
    :cond_1e
    iget-object v3, v0, Lm4/l0;->E:Ljava/lang/CharSequence;

    .line 223
    .line 224
    if-eqz v3, :cond_1f

    .line 225
    .line 226
    iput-object v3, v1, Lm4/k0;->D:Ljava/lang/CharSequence;

    .line 227
    .line 228
    :cond_1f
    iget-object v3, v0, Lm4/l0;->F:Ljava/lang/CharSequence;

    .line 229
    .line 230
    if-eqz v3, :cond_20

    .line 231
    .line 232
    iput-object v3, v1, Lm4/k0;->E:Ljava/lang/CharSequence;

    .line 233
    .line 234
    :cond_20
    iget-object v3, v0, Lm4/l0;->G:Ljava/lang/CharSequence;

    .line 235
    .line 236
    if-eqz v3, :cond_21

    .line 237
    .line 238
    iput-object v3, v1, Lm4/k0;->F:Ljava/lang/CharSequence;

    .line 239
    .line 240
    :cond_21
    iget-object v3, v0, Lm4/l0;->H:Ljava/lang/Integer;

    .line 241
    .line 242
    if-eqz v3, :cond_22

    .line 243
    .line 244
    iput-object v3, v1, Lm4/k0;->G:Ljava/lang/Integer;

    .line 245
    .line 246
    :cond_22
    iget-object v0, v0, Lm4/l0;->I:Landroid/os/Bundle;

    .line 247
    .line 248
    if-eqz v0, :cond_23

    .line 249
    .line 250
    iput-object v0, v1, Lm4/k0;->H:Landroid/os/Bundle;

    .line 251
    .line 252
    :cond_23
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_24

    .line 257
    .line 258
    invoke-static {v2}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iput-object v0, v1, Lm4/k0;->I:Lya/i0;

    .line 263
    .line 264
    :cond_24
    :goto_0
    new-instance v0, Lm4/l0;

    .line 265
    .line 266
    invoke-direct {v0, v1}, Lm4/l0;-><init>(Lm4/k0;)V

    .line 267
    .line 268
    .line 269
    return-object v0
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final F()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv4/v;->o()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 11
    .line 12
    iget-object v0, v0, Lv4/u0;->b:Lj5/d0;

    .line 13
    .line 14
    iget v0, v0, Lj5/d0;->b:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
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

.method public final F1(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lm4/i0;

    .line 18
    .line 19
    iget-object v3, p0, Lv4/v;->r:Lj5/c0;

    .line 20
    .line 21
    invoke-interface {v3, v2}, Lj5/c0;->a(Lm4/i0;)Lj5/a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final G()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lv4/v;->L1(Lv4/u0;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    return v0
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

.method public final G1(Lv4/w0;)Lv4/x0;
    .locals 7

    .line 1
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lv4/v;->L1(Lv4/u0;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Lv4/x0;

    .line 8
    .line 9
    iget-object v2, p0, Lv4/v;->t0:Lv4/u0;

    .line 10
    .line 11
    iget-object v4, v2, Lv4/u0;->a:Lm4/i1;

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v5, v0

    .line 20
    :goto_0
    iget-object v2, p0, Lv4/v;->l:Lv4/c0;

    .line 21
    .line 22
    iget-object v6, v2, Lv4/c0;->j:Landroid/os/Looper;

    .line 23
    .line 24
    move-object v3, p1

    .line 25
    invoke-direct/range {v1 .. v6}, Lv4/x0;-><init>(Lv4/v0;Lv4/w0;Lm4/i1;ILandroid/os/Looper;)V

    .line 26
    .line 27
    .line 28
    return-object v1
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final H()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    iget v0, v0, Lv4/u0;->n:I

    .line 7
    .line 8
    return v0
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

.method public final H1()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv4/v;->o()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 11
    .line 12
    iget-object v1, v0, Lv4/u0;->k:Lj5/d0;

    .line 13
    .line 14
    iget-object v0, v0, Lv4/u0;->b:Lj5/d0;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lj5/d0;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 23
    .line 24
    iget-wide v0, v0, Lv4/u0;->q:J

    .line 25
    .line 26
    invoke-static {v0, v1}, Lp4/c0;->c0(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    return-wide v0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lv4/v;->M1()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_1
    invoke-virtual {p0}, Lv4/v;->I1()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0
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

.method public final I1()J
    .locals 6

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 7
    .line 8
    invoke-virtual {v0}, Lm4/i1;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-wide v0, p0, Lv4/v;->v0:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 18
    .line 19
    iget-object v1, v0, Lv4/u0;->k:Lj5/d0;

    .line 20
    .line 21
    iget-wide v1, v1, Lj5/d0;->d:J

    .line 22
    .line 23
    iget-object v3, v0, Lv4/u0;->b:Lj5/d0;

    .line 24
    .line 25
    iget-wide v3, v3, Lj5/d0;->d:J

    .line 26
    .line 27
    cmp-long v5, v1, v3

    .line 28
    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 32
    .line 33
    invoke-virtual {p0}, Lv4/v;->G()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v2, p0, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lm4/h1;

    .line 40
    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2, v3, v4}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-wide v0, v0, Lm4/h1;->m:J

    .line 48
    .line 49
    invoke-static {v0, v1}, Lp4/c0;->c0(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    return-wide v0

    .line 54
    :cond_1
    iget-wide v0, v0, Lv4/u0;->q:J

    .line 55
    .line 56
    iget-object v2, p0, Lv4/v;->t0:Lv4/u0;

    .line 57
    .line 58
    iget-object v2, v2, Lv4/u0;->k:Lj5/d0;

    .line 59
    .line 60
    invoke-virtual {v2}, Lj5/d0;->b()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 67
    .line 68
    iget-object v1, v0, Lv4/u0;->a:Lm4/i1;

    .line 69
    .line 70
    iget-object v0, v0, Lv4/u0;->k:Lj5/d0;

    .line 71
    .line 72
    iget-object v0, v0, Lj5/d0;->a:Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v2, p0, Lv4/v;->o:Lm4/f1;

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget-object v1, p0, Lv4/v;->t0:Lv4/u0;

    .line 81
    .line 82
    iget-object v1, v1, Lv4/u0;->k:Lj5/d0;

    .line 83
    .line 84
    iget v1, v1, Lj5/d0;->b:I

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lm4/f1;->d(I)J

    .line 87
    .line 88
    .line 89
    move-result-wide v1

    .line 90
    const-wide/high16 v3, -0x8000000000000000L

    .line 91
    .line 92
    cmp-long v5, v1, v3

    .line 93
    .line 94
    if-nez v5, :cond_2

    .line 95
    .line 96
    iget-wide v0, v0, Lm4/f1;->d:J

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    move-wide v0, v1

    .line 100
    :cond_3
    :goto_0
    iget-object v2, p0, Lv4/v;->t0:Lv4/u0;

    .line 101
    .line 102
    iget-object v3, v2, Lv4/u0;->a:Lm4/i1;

    .line 103
    .line 104
    iget-object v2, v2, Lv4/u0;->k:Lj5/d0;

    .line 105
    .line 106
    iget-object v2, v2, Lj5/d0;->a:Ljava/lang/Object;

    .line 107
    .line 108
    iget-object v4, p0, Lv4/v;->o:Lm4/f1;

    .line 109
    .line 110
    invoke-virtual {v3, v2, v4}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 111
    .line 112
    .line 113
    iget-wide v2, v4, Lm4/f1;->e:J

    .line 114
    .line 115
    add-long/2addr v0, v2

    .line 116
    invoke-static {v0, v1}, Lp4/c0;->c0(J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v0

    .line 120
    return-wide v0
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final J()Lm4/i1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 7
    .line 8
    return-object v0
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

.method public final J1(Lv4/u0;)J
    .locals 7

    .line 1
    iget-object v0, p1, Lv4/u0;->b:Lj5/d0;

    .line 2
    .line 3
    iget-wide v1, p1, Lv4/u0;->c:J

    .line 4
    .line 5
    iget-object v3, p1, Lv4/u0;->a:Lm4/i1;

    .line 6
    .line 7
    invoke-virtual {v0}, Lj5/d0;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p1, Lv4/u0;->b:Lj5/d0;

    .line 14
    .line 15
    iget-object v0, v0, Lj5/d0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v4, p0, Lv4/v;->o:Lm4/f1;

    .line 18
    .line 19
    invoke-virtual {v3, v0, v4}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 20
    .line 21
    .line 22
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v0, v1, v5

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lv4/v;->L1(Lv4/u0;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget-object v0, p0, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lm4/h1;

    .line 38
    .line 39
    const-wide/16 v1, 0x0

    .line 40
    .line 41
    invoke-virtual {v3, p1, v0, v1, v2}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-wide v0, p1, Lm4/h1;->l:J

    .line 46
    .line 47
    invoke-static {v0, v1}, Lp4/c0;->c0(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    return-wide v0

    .line 52
    :cond_0
    iget-wide v3, v4, Lm4/f1;->e:J

    .line 53
    .line 54
    invoke-static {v3, v4}, Lp4/c0;->c0(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    invoke-static {v1, v2}, Lp4/c0;->c0(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    add-long/2addr v0, v3

    .line 63
    return-wide v0

    .line 64
    :cond_1
    invoke-virtual {p0, p1}, Lv4/v;->K1(Lv4/u0;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-static {v0, v1}, Lp4/c0;->c0(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    return-wide v0
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

.method public final K(IJLjava/util/List;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p4}, Lv4/v;->F1(Ljava/util/List;)Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 9
    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    move-object v0, p0

    .line 13
    move v2, p1

    .line 14
    move-wide v3, p2

    .line 15
    invoke-virtual/range {v0 .. v5}, Lv4/v;->b2(Ljava/util/ArrayList;IJZ)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public final K1(Lv4/u0;)J
    .locals 4

    .line 1
    iget-object v0, p1, Lv4/u0;->a:Lm4/i1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm4/i1;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lv4/v;->v0:J

    .line 10
    .line 11
    invoke-static {v0, v1}, Lp4/c0;->N(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-boolean v0, p1, Lv4/u0;->p:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Lv4/u0;->i()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-wide v0, p1, Lv4/u0;->s:J

    .line 26
    .line 27
    :goto_0
    iget-object v2, p1, Lv4/u0;->b:Lj5/d0;

    .line 28
    .line 29
    invoke-virtual {v2}, Lj5/d0;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_2
    iget-object v2, p1, Lv4/u0;->a:Lm4/i1;

    .line 37
    .line 38
    iget-object p1, p1, Lv4/u0;->b:Lj5/d0;

    .line 39
    .line 40
    iget-object p1, p1, Lj5/d0;->a:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v3, p0, Lv4/v;->o:Lm4/f1;

    .line 43
    .line 44
    invoke-virtual {v2, p1, v3}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 45
    .line 46
    .line 47
    iget-wide v2, v3, Lm4/f1;->e:J

    .line 48
    .line 49
    add-long/2addr v0, v2

    .line 50
    return-wide v0
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

.method public final L1(Lv4/u0;)I
    .locals 2

    .line 1
    iget-object v0, p1, Lv4/u0;->a:Lm4/i1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm4/i1;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p1, p0, Lv4/v;->u0:I

    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p1, Lv4/u0;->a:Lm4/i1;

    .line 13
    .line 14
    iget-object p1, p1, Lv4/u0;->b:Lj5/d0;

    .line 15
    .line 16
    iget-object p1, p1, Lj5/d0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v1, p0, Lv4/v;->o:Lm4/f1;

    .line 19
    .line 20
    invoke-virtual {v0, p1, v1}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget p1, p1, Lm4/f1;->c:I

    .line 25
    .line 26
    return p1
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
.end method

.method public final M()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lv4/v;->K1(Lv4/u0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lp4/c0;->c0(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
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

.method public final M1()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv4/v;->o()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 11
    .line 12
    iget-object v1, v0, Lv4/u0;->b:Lj5/d0;

    .line 13
    .line 14
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 15
    .line 16
    iget-object v2, v1, Lj5/d0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v3, p0, Lv4/v;->o:Lm4/f1;

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 21
    .line 22
    .line 23
    iget v0, v1, Lj5/d0;->b:I

    .line 24
    .line 25
    iget v1, v1, Lj5/d0;->c:I

    .line 26
    .line 27
    invoke-virtual {v3, v0, v1}, Lm4/f1;->a(II)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {v0, v1}, Lp4/c0;->c0(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_0
    invoke-virtual {p0}, Landroidx/lifecycle/q;->Z0()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0
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

.method public final N1(Lm4/i1;Lv4/y0;IJ)Landroid/util/Pair;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lm4/i1;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v10, -0x1

    .line 15
    if-nez v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {v7}, Lm4/i1;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v1, v0, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v12, v1

    .line 27
    check-cast v12, Lm4/h1;

    .line 28
    .line 29
    iget-object v13, v0, Lv4/v;->o:Lm4/f1;

    .line 30
    .line 31
    invoke-static/range {p4 .. p5}, Lp4/c0;->N(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v15

    .line 35
    move-object/from16 v11, p1

    .line 36
    .line 37
    move/from16 v14, p3

    .line 38
    .line 39
    invoke-virtual/range {v11 .. v16}, Lm4/i1;->i(Lm4/h1;Lm4/f1;IJ)Landroid/util/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v5, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {v7, v5}, Lv4/y0;->b(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eq v2, v10, :cond_1

    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_1
    iget-object v1, v0, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lm4/h1;

    .line 55
    .line 56
    iget v3, v0, Lv4/v;->D:I

    .line 57
    .line 58
    iget-boolean v4, v0, Lv4/v;->E:Z

    .line 59
    .line 60
    iget-object v2, v0, Lv4/v;->o:Lm4/f1;

    .line 61
    .line 62
    move-object/from16 v6, p1

    .line 63
    .line 64
    invoke-static/range {v1 .. v7}, Lv4/c0;->N(Lm4/h1;Lm4/f1;IZLjava/lang/Object;Lm4/i1;Lm4/i1;)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eq v1, v10, :cond_2

    .line 69
    .line 70
    iget-object v2, v0, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Lm4/h1;

    .line 73
    .line 74
    const-wide/16 v3, 0x0

    .line 75
    .line 76
    invoke-virtual {v7, v1, v2, v3, v4}, Lv4/y0;->m(ILm4/h1;J)Lm4/h1;

    .line 77
    .line 78
    .line 79
    iget-wide v2, v2, Lm4/h1;->l:J

    .line 80
    .line 81
    invoke-static {v2, v3}, Lp4/c0;->c0(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    invoke-virtual {v0, v7, v1, v2, v3}, Lv4/v;->R1(Lm4/i1;IJ)Landroid/util/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    return-object v1

    .line 90
    :cond_2
    invoke-virtual {v0, v7, v10, v8, v9}, Lv4/v;->R1(Lm4/i1;IJ)Landroid/util/Pair;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    return-object v1

    .line 95
    :cond_3
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lm4/i1;->p()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_4

    .line 100
    .line 101
    invoke-virtual {v7}, Lm4/i1;->p()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_4

    .line 106
    .line 107
    const/4 v1, 0x1

    .line 108
    goto :goto_1

    .line 109
    :cond_4
    const/4 v1, 0x0

    .line 110
    :goto_1
    if-eqz v1, :cond_5

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    move/from16 v10, p3

    .line 114
    .line 115
    :goto_2
    if-eqz v1, :cond_6

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    move-wide/from16 v8, p4

    .line 119
    .line 120
    :goto_3
    invoke-virtual {v0, v7, v10, v8, v9}, Lv4/v;->R1(Lm4/i1;IJ)Landroid/util/Pair;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    return-object v1
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

.method public final O1()Lm4/s0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    iget-object v0, v0, Lv4/u0;->o:Lm4/s0;

    .line 7
    .line 8
    return-object v0
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

.method public final Q1(Lv4/u0;Lm4/i1;Landroid/util/Pair;)Lv4/u0;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v1}, Lm4/i1;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v3, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 21
    :goto_1
    invoke-static {v3}, Lp4/c;->c(Z)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v3, p1

    .line 25
    .line 26
    iget-object v6, v3, Lv4/u0;->a:Lm4/i1;

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p1}, Lv4/v;->J1(Lv4/u0;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v7

    .line 32
    invoke-virtual/range {p1 .. p2}, Lv4/u0;->g(Lm4/i1;)Lv4/u0;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    invoke-virtual {v1}, Lm4/i1;->p()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    sget-object v10, Lv4/u0;->u:Lj5/d0;

    .line 43
    .line 44
    iget-wide v1, v0, Lv4/v;->v0:J

    .line 45
    .line 46
    invoke-static {v1, v2}, Lp4/c0;->N(J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v11

    .line 50
    sget-object v19, Lj5/o1;->d:Lj5/o1;

    .line 51
    .line 52
    iget-object v1, v0, Lv4/v;->b:Lm5/u;

    .line 53
    .line 54
    sget-object v21, Lya/a1;->e:Lya/a1;

    .line 55
    .line 56
    const-wide/16 v17, 0x0

    .line 57
    .line 58
    move-wide v13, v11

    .line 59
    move-wide v15, v11

    .line 60
    move-object/from16 v20, v1

    .line 61
    .line 62
    invoke-virtual/range {v9 .. v21}, Lv4/u0;->b(Lj5/d0;JJJJLj5/o1;Lm5/u;Ljava/util/List;)Lv4/u0;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1, v10}, Lv4/u0;->a(Lj5/d0;)Lv4/u0;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-wide v2, v1, Lv4/u0;->s:J

    .line 71
    .line 72
    iput-wide v2, v1, Lv4/u0;->q:J

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_2
    iget-object v3, v9, Lv4/u0;->b:Lj5/d0;

    .line 76
    .line 77
    iget-object v3, v3, Lj5/d0;->a:Ljava/lang/Object;

    .line 78
    .line 79
    sget v10, Lp4/c0;->a:I

    .line 80
    .line 81
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-virtual {v3, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    if-nez v10, :cond_3

    .line 88
    .line 89
    new-instance v11, Lj5/d0;

    .line 90
    .line 91
    iget-object v12, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-direct {v11, v12}, Lj5/d0;-><init>(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    iget-object v11, v9, Lv4/u0;->b:Lj5/d0;

    .line 98
    .line 99
    :goto_2
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v2, Ljava/lang/Long;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 104
    .line 105
    .line 106
    move-result-wide v12

    .line 107
    invoke-static {v7, v8}, Lp4/c0;->N(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v7

    .line 111
    invoke-virtual {v6}, Lm4/i1;->p()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_4

    .line 116
    .line 117
    iget-object v2, v0, Lv4/v;->o:Lm4/f1;

    .line 118
    .line 119
    invoke-virtual {v6, v3, v2}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iget-wide v2, v2, Lm4/f1;->e:J

    .line 124
    .line 125
    sub-long/2addr v7, v2

    .line 126
    :cond_4
    if-eqz v10, :cond_5

    .line 127
    .line 128
    cmp-long v2, v12, v7

    .line 129
    .line 130
    if-gez v2, :cond_6

    .line 131
    .line 132
    :cond_5
    move v1, v10

    .line 133
    move-object v10, v11

    .line 134
    move-wide v11, v12

    .line 135
    goto/16 :goto_6

    .line 136
    .line 137
    :cond_6
    if-nez v2, :cond_a

    .line 138
    .line 139
    iget-object v2, v9, Lv4/u0;->k:Lj5/d0;

    .line 140
    .line 141
    iget-object v2, v2, Lj5/d0;->a:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Lm4/i1;->b(Ljava/lang/Object;)I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    const/4 v3, -0x1

    .line 148
    if-eq v2, v3, :cond_8

    .line 149
    .line 150
    iget-object v3, v0, Lv4/v;->o:Lm4/f1;

    .line 151
    .line 152
    invoke-virtual {v1, v2, v3, v4}, Lm4/i1;->f(ILm4/f1;Z)Lm4/f1;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    iget v2, v2, Lm4/f1;->c:I

    .line 157
    .line 158
    iget-object v3, v11, Lj5/d0;->a:Ljava/lang/Object;

    .line 159
    .line 160
    iget-object v4, v0, Lv4/v;->o:Lm4/f1;

    .line 161
    .line 162
    invoke-virtual {v1, v3, v4}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    iget v3, v3, Lm4/f1;->c:I

    .line 167
    .line 168
    if-eq v2, v3, :cond_7

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_7
    return-object v9

    .line 172
    :cond_8
    :goto_3
    iget-object v2, v11, Lj5/d0;->a:Ljava/lang/Object;

    .line 173
    .line 174
    iget-object v3, v0, Lv4/v;->o:Lm4/f1;

    .line 175
    .line 176
    invoke-virtual {v1, v2, v3}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v11}, Lj5/d0;->b()Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v1, :cond_9

    .line 184
    .line 185
    iget-object v1, v0, Lv4/v;->o:Lm4/f1;

    .line 186
    .line 187
    iget v2, v11, Lj5/d0;->b:I

    .line 188
    .line 189
    iget v3, v11, Lj5/d0;->c:I

    .line 190
    .line 191
    invoke-virtual {v1, v2, v3}, Lm4/f1;->a(II)J

    .line 192
    .line 193
    .line 194
    move-result-wide v1

    .line 195
    :goto_4
    move-object v10, v11

    .line 196
    goto :goto_5

    .line 197
    :cond_9
    iget-object v1, v0, Lv4/v;->o:Lm4/f1;

    .line 198
    .line 199
    iget-wide v1, v1, Lm4/f1;->d:J

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :goto_5
    iget-wide v11, v9, Lv4/u0;->s:J

    .line 203
    .line 204
    iget-wide v13, v9, Lv4/u0;->s:J

    .line 205
    .line 206
    iget-wide v3, v9, Lv4/u0;->d:J

    .line 207
    .line 208
    iget-wide v5, v9, Lv4/u0;->s:J

    .line 209
    .line 210
    sub-long v17, v1, v5

    .line 211
    .line 212
    iget-object v5, v9, Lv4/u0;->h:Lj5/o1;

    .line 213
    .line 214
    iget-object v6, v9, Lv4/u0;->i:Lm5/u;

    .line 215
    .line 216
    iget-object v7, v9, Lv4/u0;->j:Ljava/util/List;

    .line 217
    .line 218
    move-wide v15, v3

    .line 219
    move-object/from16 v19, v5

    .line 220
    .line 221
    move-object/from16 v20, v6

    .line 222
    .line 223
    move-object/from16 v21, v7

    .line 224
    .line 225
    invoke-virtual/range {v9 .. v21}, Lv4/u0;->b(Lj5/d0;JJJJLj5/o1;Lm5/u;Ljava/util/List;)Lv4/u0;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-virtual {v3, v10}, Lv4/u0;->a(Lj5/d0;)Lv4/u0;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    iput-wide v1, v3, Lv4/u0;->q:J

    .line 234
    .line 235
    return-object v3

    .line 236
    :cond_a
    move-object v10, v11

    .line 237
    invoke-virtual {v10}, Lj5/d0;->b()Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    xor-int/2addr v1, v5

    .line 242
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 243
    .line 244
    .line 245
    iget-wide v1, v9, Lv4/u0;->r:J

    .line 246
    .line 247
    sub-long v3, v12, v7

    .line 248
    .line 249
    sub-long/2addr v1, v3

    .line 250
    const-wide/16 v3, 0x0

    .line 251
    .line 252
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 253
    .line 254
    .line 255
    move-result-wide v17

    .line 256
    iget-wide v1, v9, Lv4/u0;->q:J

    .line 257
    .line 258
    iget-object v3, v9, Lv4/u0;->k:Lj5/d0;

    .line 259
    .line 260
    iget-object v4, v9, Lv4/u0;->b:Lj5/d0;

    .line 261
    .line 262
    invoke-virtual {v3, v4}, Lj5/d0;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    if-eqz v3, :cond_b

    .line 267
    .line 268
    add-long v1, v12, v17

    .line 269
    .line 270
    :cond_b
    iget-object v3, v9, Lv4/u0;->h:Lj5/o1;

    .line 271
    .line 272
    iget-object v4, v9, Lv4/u0;->i:Lm5/u;

    .line 273
    .line 274
    iget-object v5, v9, Lv4/u0;->j:Ljava/util/List;

    .line 275
    .line 276
    move-wide v11, v12

    .line 277
    move-wide v13, v11

    .line 278
    move-wide v15, v11

    .line 279
    move-object/from16 v19, v3

    .line 280
    .line 281
    move-object/from16 v20, v4

    .line 282
    .line 283
    move-object/from16 v21, v5

    .line 284
    .line 285
    invoke-virtual/range {v9 .. v21}, Lv4/u0;->b(Lj5/d0;JJJJLj5/o1;Lm5/u;Ljava/util/List;)Lv4/u0;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    iput-wide v1, v3, Lv4/u0;->q:J

    .line 290
    .line 291
    return-object v3

    .line 292
    :goto_6
    invoke-virtual {v10}, Lj5/d0;->b()Z

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    xor-int/2addr v2, v5

    .line 297
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 298
    .line 299
    .line 300
    if-nez v1, :cond_c

    .line 301
    .line 302
    sget-object v2, Lj5/o1;->d:Lj5/o1;

    .line 303
    .line 304
    :goto_7
    move-object/from16 v19, v2

    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_c
    iget-object v2, v9, Lv4/u0;->h:Lj5/o1;

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :goto_8
    if-nez v1, :cond_d

    .line 311
    .line 312
    iget-object v2, v0, Lv4/v;->b:Lm5/u;

    .line 313
    .line 314
    :goto_9
    move-object/from16 v20, v2

    .line 315
    .line 316
    goto :goto_a

    .line 317
    :cond_d
    iget-object v2, v9, Lv4/u0;->i:Lm5/u;

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :goto_a
    if-nez v1, :cond_e

    .line 321
    .line 322
    sget-object v1, Lya/i0;->b:Lya/g0;

    .line 323
    .line 324
    sget-object v1, Lya/a1;->e:Lya/a1;

    .line 325
    .line 326
    :goto_b
    move-object/from16 v21, v1

    .line 327
    .line 328
    goto :goto_c

    .line 329
    :cond_e
    iget-object v1, v9, Lv4/u0;->j:Ljava/util/List;

    .line 330
    .line 331
    goto :goto_b

    .line 332
    :goto_c
    const-wide/16 v17, 0x0

    .line 333
    .line 334
    move-wide v13, v11

    .line 335
    move-wide v15, v11

    .line 336
    invoke-virtual/range {v9 .. v21}, Lv4/u0;->b(Lj5/d0;JJJJLj5/o1;Lm5/u;Ljava/util/List;)Lv4/u0;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-virtual {v1, v10}, Lv4/u0;->a(Lj5/d0;)Lv4/u0;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    iput-wide v11, v1, Lv4/u0;->q:J

    .line 345
    .line 346
    return-object v1
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
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

.method public final R1(Lm4/i1;IJ)Landroid/util/Pair;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lm4/i1;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput p2, p0, Lv4/v;->u0:I

    .line 10
    .line 11
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v0, p3, p1

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    move-wide p3, v1

    .line 21
    :cond_0
    iput-wide p3, p0, Lv4/v;->v0:J

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1

    .line 25
    :cond_1
    const/4 v0, -0x1

    .line 26
    if-eq p2, v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p1}, Lm4/i1;->o()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lt p2, v0, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    :goto_0
    move v3, p2

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    :goto_1
    iget-boolean p2, p0, Lv4/v;->E:Z

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Lm4/i1;->a(Z)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iget-object p3, p0, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p3, Lm4/h1;

    .line 46
    .line 47
    invoke-virtual {p1, p2, p3, v1, v2}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    iget-wide p3, p3, Lm4/h1;->l:J

    .line 52
    .line 53
    invoke-static {p3, p4}, Lp4/c0;->c0(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p3

    .line 57
    goto :goto_0

    .line 58
    :goto_2
    iget-object p2, p0, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v1, p2

    .line 61
    check-cast v1, Lm4/h1;

    .line 62
    .line 63
    iget-object v2, p0, Lv4/v;->o:Lm4/f1;

    .line 64
    .line 65
    invoke-static {p3, p4}, Lp4/c0;->N(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    move-object v0, p1

    .line 70
    invoke-virtual/range {v0 .. v5}, Lm4/i1;->i(Lm4/h1;Lm4/f1;IJ)Landroid/util/Pair;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
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

.method public final S1(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv4/v;->S:Lp4/u;

    .line 2
    .line 3
    iget v1, v0, Lp4/u;->a:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_1

    .line 6
    .line 7
    iget v0, v0, Lp4/u;->b:I

    .line 8
    .line 9
    if-eq p2, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    new-instance v0, Lp4/u;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Lp4/u;-><init>(II)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lv4/v;->S:Lp4/u;

    .line 19
    .line 20
    new-instance v0, Lb7/b3;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-direct {v0, p1, p2, v1}, Lb7/b3;-><init>(III)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lv4/v;->m:Lp4/n;

    .line 27
    .line 28
    const/16 v2, 0x18

    .line 29
    .line 30
    invoke-virtual {v1, v2, v0}, Lp4/n;->e(ILp4/k;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lp4/u;

    .line 34
    .line 35
    invoke-direct {v0, p1, p2}, Lp4/u;-><init>(II)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x2

    .line 39
    const/16 p2, 0xe

    .line 40
    .line 41
    invoke-virtual {p0, p1, p2, v0}, Lv4/v;->a2(IILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void
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

.method public final T1(III)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    const/4 v3, 0x1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    if-gt p1, p2, :cond_0

    .line 8
    .line 9
    if-ltz p3, :cond_0

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v4, 0x0

    .line 14
    :goto_0
    invoke-static {v4}, Lp4/c;->c(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Lv4/v;->p:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    sub-int v1, v7, p1

    .line 28
    .line 29
    sub-int v1, v5, v1

    .line 30
    .line 31
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-ge p1, v5, :cond_2

    .line 36
    .line 37
    if-eq p1, v7, :cond_2

    .line 38
    .line 39
    if-ne p1, v8, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p0}, Lv4/v;->J()Lm4/i1;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget v2, p0, Lv4/v;->F:I

    .line 47
    .line 48
    add-int/2addr v2, v3

    .line 49
    iput v2, p0, Lv4/v;->F:I

    .line 50
    .line 51
    invoke-static {p1, v7, v8, v4}, Lp4/c0;->M(IIILjava/util/ArrayList;)V

    .line 52
    .line 53
    .line 54
    new-instance v2, Lv4/y0;

    .line 55
    .line 56
    iget-object v3, p0, Lv4/v;->I:Lj5/f1;

    .line 57
    .line 58
    invoke-direct {v2, v4, v3}, Lv4/y0;-><init>(Ljava/util/ArrayList;Lj5/f1;)V

    .line 59
    .line 60
    .line 61
    iget-object v9, p0, Lv4/v;->t0:Lv4/u0;

    .line 62
    .line 63
    invoke-virtual {p0, v9}, Lv4/v;->L1(Lv4/u0;)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    iget-object v4, p0, Lv4/v;->t0:Lv4/u0;

    .line 68
    .line 69
    invoke-virtual {p0, v4}, Lv4/v;->J1(Lv4/u0;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    move-object v0, p0

    .line 74
    invoke-virtual/range {v0 .. v5}, Lv4/v;->N1(Lm4/i1;Lv4/y0;IJ)Landroid/util/Pair;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {p0, v9, v2, v1}, Lv4/v;->Q1(Lv4/u0;Lm4/i1;Landroid/util/Pair;)Lv4/u0;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v2, p0, Lv4/v;->I:Lj5/f1;

    .line 83
    .line 84
    iget-object v3, p0, Lv4/v;->l:Lv4/c0;

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance v4, Lv4/y;

    .line 90
    .line 91
    invoke-direct {v4, p1, v7, v8, v2}, Lv4/y;-><init>(IIILj5/f1;)V

    .line 92
    .line 93
    .line 94
    iget-object v2, v3, Lv4/c0;->h:Lp4/x;

    .line 95
    .line 96
    const/16 v3, 0x13

    .line 97
    .line 98
    invoke-virtual {v2, v3, v4}, Lp4/x;->a(ILjava/lang/Object;)Lp4/w;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Lp4/w;->b()V

    .line 103
    .line 104
    .line 105
    const/4 v7, -0x1

    .line 106
    const/4 v8, 0x0

    .line 107
    const/4 v2, 0x0

    .line 108
    const/4 v3, 0x0

    .line 109
    const/4 v4, 0x5

    .line 110
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v0 .. v8}, Lv4/v;->k2(Lv4/u0;IZIJIZ)V

    .line 116
    .line 117
    .line 118
    :cond_2
    :goto_1
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
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

.method public final U1(Lm4/w0;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->m:Lp4/n;

    .line 5
    .line 6
    invoke-virtual {v0}, Lp4/n;->f()V

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, Lp4/n;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_2

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Lp4/m;

    .line 26
    .line 27
    iget-object v4, v3, Lp4/m;->a:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    iget-object v4, v0, Lp4/n;->c:Lp4/l;

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    iput-boolean v5, v3, Lp4/m;->d:Z

    .line 39
    .line 40
    iget-boolean v5, v3, Lp4/m;->c:Z

    .line 41
    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    iput-boolean v5, v3, Lp4/m;->c:Z

    .line 46
    .line 47
    iget-object v5, v3, Lp4/m;->a:Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v6, v3, Lp4/m;->b:Lk5/d;

    .line 50
    .line 51
    invoke-virtual {v6}, Lk5/d;->d()Lm4/o;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-interface {v4, v5, v6}, Lp4/l;->g(Ljava/lang/Object;Lm4/o;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    return-void
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

.method public final V1(II)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    if-lt p2, p1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-static {v1}, Lp4/c;->c(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lv4/v;->p:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-ge p1, v1, :cond_2

    .line 26
    .line 27
    if-ne p1, p2, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object v1, p0, Lv4/v;->t0:Lv4/u0;

    .line 31
    .line 32
    invoke-virtual {p0, v1, p1, p2}, Lv4/v;->W1(Lv4/u0;II)Lv4/u0;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object p1, v3, Lv4/u0;->b:Lj5/d0;

    .line 37
    .line 38
    iget-object p1, p1, Lj5/d0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object p2, p0, Lv4/v;->t0:Lv4/u0;

    .line 41
    .line 42
    iget-object p2, p2, Lv4/u0;->b:Lj5/d0;

    .line 43
    .line 44
    iget-object p2, p2, Lj5/d0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    xor-int/lit8 v5, p1, 0x1

    .line 51
    .line 52
    invoke-virtual {p0, v3}, Lv4/v;->K1(Lv4/u0;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    const/4 v9, -0x1

    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v4, 0x0

    .line 59
    const/4 v6, 0x4

    .line 60
    move-object v2, p0

    .line 61
    invoke-virtual/range {v2 .. v10}, Lv4/v;->k2(Lv4/u0;IZIJIZ)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_1
    return-void
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
.end method

.method public final W1(Lv4/u0;II)Lv4/u0;
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Lv4/v;->L1(Lv4/u0;)I

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-virtual {p0, p1}, Lv4/v;->J1(Lv4/u0;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    iget-object v1, p1, Lv4/u0;->a:Lm4/i1;

    .line 10
    .line 11
    iget-object v0, p0, Lv4/v;->p:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget v2, p0, Lv4/v;->F:I

    .line 18
    .line 19
    const/4 v7, 0x1

    .line 20
    add-int/2addr v2, v7

    .line 21
    iput v2, p0, Lv4/v;->F:I

    .line 22
    .line 23
    invoke-virtual {p0, p2, p3}, Lv4/v;->X1(II)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lv4/y0;

    .line 27
    .line 28
    iget-object v8, p0, Lv4/v;->I:Lj5/f1;

    .line 29
    .line 30
    invoke-direct {v2, v0, v8}, Lv4/y0;-><init>(Ljava/util/ArrayList;Lj5/f1;)V

    .line 31
    .line 32
    .line 33
    move-object v0, p0

    .line 34
    invoke-virtual/range {v0 .. v5}, Lv4/v;->N1(Lm4/i1;Lv4/y0;IJ)Landroid/util/Pair;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p0, p1, v2, v1}, Lv4/v;->Q1(Lv4/u0;Lm4/i1;Landroid/util/Pair;)Lv4/u0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget v1, p1, Lv4/u0;->e:I

    .line 43
    .line 44
    if-eq v1, v7, :cond_0

    .line 45
    .line 46
    const/4 v2, 0x4

    .line 47
    if-eq v1, v2, :cond_0

    .line 48
    .line 49
    if-ge p2, p3, :cond_0

    .line 50
    .line 51
    if-ne p3, v6, :cond_0

    .line 52
    .line 53
    iget-object v1, p1, Lv4/u0;->a:Lm4/i1;

    .line 54
    .line 55
    invoke-virtual {v1}, Lm4/i1;->o()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-lt v3, v1, :cond_0

    .line 60
    .line 61
    invoke-virtual {p1, v2}, Lv4/u0;->f(I)Lv4/u0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_0
    iget-object v1, v0, Lv4/v;->I:Lj5/f1;

    .line 66
    .line 67
    iget-object v2, v0, Lv4/v;->l:Lv4/c0;

    .line 68
    .line 69
    iget-object v2, v2, Lv4/c0;->h:Lp4/x;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lp4/x;->b()Lp4/w;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-object v2, v2, Lp4/x;->a:Landroid/os/Handler;

    .line 79
    .line 80
    const/16 v4, 0x14

    .line 81
    .line 82
    invoke-virtual {v2, v4, p2, p3, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    iput-object p2, v3, Lp4/w;->a:Landroid/os/Message;

    .line 87
    .line 88
    invoke-virtual {v3}, Lp4/w;->b()V

    .line 89
    .line 90
    .line 91
    return-object p1
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

.method public final X1(II)V
    .locals 8

    .line 1
    add-int/lit8 v0, p2, -0x1

    .line 2
    .line 3
    :goto_0
    if-lt v0, p1, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lv4/v;->p:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lv4/v;->I:Lj5/f1;

    .line 14
    .line 15
    sub-int v1, p2, p1

    .line 16
    .line 17
    iget-object v2, v0, Lj5/f1;->b:[I

    .line 18
    .line 19
    array-length v3, v2

    .line 20
    sub-int/2addr v3, v1

    .line 21
    new-array v3, v3, [I

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    :goto_1
    array-length v6, v2

    .line 26
    if-ge v4, v6, :cond_3

    .line 27
    .line 28
    aget v6, v2, v4

    .line 29
    .line 30
    if-lt v6, p1, :cond_1

    .line 31
    .line 32
    if-ge v6, p2, :cond_1

    .line 33
    .line 34
    add-int/lit8 v5, v5, 0x1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    sub-int v7, v4, v5

    .line 38
    .line 39
    if-lt v6, p1, :cond_2

    .line 40
    .line 41
    sub-int/2addr v6, v1

    .line 42
    :cond_2
    aput v6, v3, v7

    .line 43
    .line 44
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    new-instance p1, Lj5/f1;

    .line 48
    .line 49
    new-instance p2, Ljava/util/Random;

    .line 50
    .line 51
    iget-object v0, v0, Lj5/f1;->a:Ljava/util/Random;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    invoke-direct {p2, v0, v1}, Ljava/util/Random;-><init>(J)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, v3, p2}, Lj5/f1;-><init>([ILjava/util/Random;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lv4/v;->I:Lj5/f1;

    .line 64
    .line 65
    return-void
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
.end method

.method public final Y1()V
    .locals 4

    .line 1
    iget-object v0, p0, Lv4/v;->P:Lq5/k;

    .line 2
    .line 3
    iget-object v1, p0, Lv4/v;->x:Lv4/s;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lv4/v;->y:Lv4/t;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lv4/v;->G1(Lv4/w0;)Lv4/x0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-boolean v3, v0, Lv4/x0;->f:Z

    .line 15
    .line 16
    xor-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 19
    .line 20
    .line 21
    const/16 v3, 0x2710

    .line 22
    .line 23
    iput v3, v0, Lv4/x0;->c:I

    .line 24
    .line 25
    iget-boolean v3, v0, Lv4/x0;->f:Z

    .line 26
    .line 27
    xor-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 30
    .line 31
    .line 32
    iput-object v2, v0, Lv4/x0;->d:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v0}, Lv4/x0;->b()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lv4/v;->P:Lq5/k;

    .line 38
    .line 39
    iget-object v0, v0, Lq5/k;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, Lv4/v;->P:Lq5/k;

    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, Lv4/v;->O:Landroid/view/SurfaceHolder;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lv4/v;->O:Landroid/view/SurfaceHolder;

    .line 54
    .line 55
    :cond_1
    return-void
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

.method public final Z1(IILjava/util/List;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    const/4 v4, 0x0

    .line 5
    const/4 v5, 0x1

    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    if-lt p2, p1, :cond_0

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v6, 0x0

    .line 13
    :goto_0
    invoke-static {v6}, Lp4/c;->c(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v6, p0, Lv4/v;->p:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    if-le p1, v7, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {p2, v7}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    sub-int v7, v2, p1

    .line 30
    .line 31
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-eq v7, v8, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move v7, p1

    .line 39
    :goto_1
    if-ge v7, v2, :cond_6

    .line 40
    .line 41
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    check-cast v8, Lv4/u;

    .line 46
    .line 47
    iget-object v8, v8, Lv4/u;->b:Lj5/y;

    .line 48
    .line 49
    sub-int v9, v7, p1

    .line 50
    .line 51
    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    check-cast v9, Lm4/i0;

    .line 56
    .line 57
    iget-object v8, v8, Lj5/q1;->k:Lj5/a;

    .line 58
    .line 59
    invoke-virtual {v8, v9}, Lj5/a;->a(Lm4/i0;)Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-nez v8, :cond_5

    .line 64
    .line 65
    :goto_2
    invoke-virtual {p0, p3}, Lv4/v;->F1(Ljava/util/List;)Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    iget v2, p0, Lv4/v;->u0:I

    .line 76
    .line 77
    const/4 v3, -0x1

    .line 78
    if-ne v2, v3, :cond_3

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    const/4 v5, 0x0

    .line 82
    :goto_3
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 83
    .line 84
    .line 85
    const/4 v2, -0x1

    .line 86
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    move-object v0, p0

    .line 92
    invoke-virtual/range {v0 .. v5}, Lv4/v;->b2(Ljava/util/ArrayList;IJZ)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_4
    iget-object v3, p0, Lv4/v;->t0:Lv4/u0;

    .line 97
    .line 98
    invoke-virtual {p0, v3, v2, v1}, Lv4/v;->D1(Lv4/u0;ILjava/util/ArrayList;)Lv4/u0;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {p0, v1, p1, v2}, Lv4/v;->W1(Lv4/u0;II)Lv4/u0;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget-object v2, v1, Lv4/u0;->b:Lj5/d0;

    .line 107
    .line 108
    iget-object v2, v2, Lj5/d0;->a:Ljava/lang/Object;

    .line 109
    .line 110
    iget-object v3, p0, Lv4/v;->t0:Lv4/u0;

    .line 111
    .line 112
    iget-object v3, v3, Lv4/u0;->b:Lj5/d0;

    .line 113
    .line 114
    iget-object v3, v3, Lj5/d0;->a:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    xor-int/lit8 v3, v2, 0x1

    .line 121
    .line 122
    invoke-virtual {p0, v1}, Lv4/v;->K1(Lv4/u0;)J

    .line 123
    .line 124
    .line 125
    move-result-wide v5

    .line 126
    const/4 v7, -0x1

    .line 127
    const/4 v8, 0x0

    .line 128
    const/4 v2, 0x0

    .line 129
    const/4 v4, 0x4

    .line 130
    move-object v0, p0

    .line 131
    invoke-virtual/range {v0 .. v8}, Lv4/v;->k2(Lv4/u0;IZIJIZ)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_6
    iget v1, p0, Lv4/v;->F:I

    .line 139
    .line 140
    add-int/2addr v1, v5

    .line 141
    iput v1, p0, Lv4/v;->F:I

    .line 142
    .line 143
    iget-object v1, p0, Lv4/v;->l:Lv4/c0;

    .line 144
    .line 145
    iget-object v1, v1, Lv4/c0;->h:Lp4/x;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-static {}, Lp4/x;->b()Lp4/w;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    iget-object v1, v1, Lp4/x;->a:Landroid/os/Handler;

    .line 155
    .line 156
    const/16 v5, 0x1b

    .line 157
    .line 158
    invoke-virtual {v1, v5, p1, v2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iput-object v1, v4, Lp4/w;->a:Landroid/os/Message;

    .line 163
    .line 164
    invoke-virtual {v4}, Lp4/w;->b()V

    .line 165
    .line 166
    .line 167
    move v1, p1

    .line 168
    :goto_4
    if-ge v1, v2, :cond_7

    .line 169
    .line 170
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    check-cast v4, Lv4/u;

    .line 175
    .line 176
    new-instance v5, Lj5/n1;

    .line 177
    .line 178
    iget-object v7, v4, Lv4/u;->c:Lm4/i1;

    .line 179
    .line 180
    sub-int v9, v1, p1

    .line 181
    .line 182
    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    check-cast v9, Lm4/i0;

    .line 187
    .line 188
    invoke-direct {v5, v7, v9}, Lj5/n1;-><init>(Lm4/i1;Lm4/i0;)V

    .line 189
    .line 190
    .line 191
    iput-object v5, v4, Lv4/u;->c:Lm4/i1;

    .line 192
    .line 193
    add-int/lit8 v1, v1, 0x1

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_7
    new-instance v1, Lv4/y0;

    .line 197
    .line 198
    iget-object v2, p0, Lv4/v;->I:Lj5/f1;

    .line 199
    .line 200
    invoke-direct {v1, v6, v2}, Lv4/y0;-><init>(Ljava/util/ArrayList;Lj5/f1;)V

    .line 201
    .line 202
    .line 203
    iget-object v2, p0, Lv4/v;->t0:Lv4/u0;

    .line 204
    .line 205
    invoke-virtual {v2, v1}, Lv4/u0;->g(Lm4/i1;)Lv4/u0;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    const/4 v7, -0x1

    .line 210
    const/4 v8, 0x0

    .line 211
    const/4 v2, 0x0

    .line 212
    const/4 v3, 0x0

    .line 213
    const/4 v4, 0x4

    .line 214
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    move-object v0, p0

    .line 220
    invoke-virtual/range {v0 .. v8}, Lv4/v;->k2(Lv4/u0;IZIJIZ)V

    .line 221
    .line 222
    .line 223
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
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

.method public final a2(IILjava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lv4/v;->g:[Lv4/e;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_2

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    if-eq p1, v4, :cond_0

    .line 11
    .line 12
    iget v4, v3, Lv4/e;->b:I

    .line 13
    .line 14
    if-ne v4, p1, :cond_1

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0, v3}, Lv4/v;->G1(Lv4/w0;)Lv4/x0;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-boolean v4, v3, Lv4/x0;->f:Z

    .line 21
    .line 22
    xor-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    invoke-static {v4}, Lp4/c;->i(Z)V

    .line 25
    .line 26
    .line 27
    iput p2, v3, Lv4/x0;->c:I

    .line 28
    .line 29
    iget-boolean v4, v3, Lv4/x0;->f:Z

    .line 30
    .line 31
    xor-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    invoke-static {v4}, Lp4/c;->i(Z)V

    .line 34
    .line 35
    .line 36
    iput-object p3, v3, Lv4/x0;->d:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v3}, Lv4/x0;->b()V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
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

.method public final b2(Ljava/util/ArrayList;IJZ)V
    .locals 15

    .line 1
    move/from16 v1, p2

    .line 2
    .line 3
    iget-object v2, p0, Lv4/v;->t0:Lv4/u0;

    .line 4
    .line 5
    invoke-virtual {p0, v2}, Lv4/v;->L1(Lv4/u0;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {p0}, Lv4/v;->M()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    iget v5, p0, Lv4/v;->F:I

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    add-int/2addr v5, v6

    .line 17
    iput v5, p0, Lv4/v;->F:I

    .line 18
    .line 19
    iget-object v5, p0, Lv4/v;->p:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    const/4 v8, 0x0

    .line 26
    if-nez v7, :cond_0

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    invoke-virtual {p0, v8, v7}, Lv4/v;->X1(II)V

    .line 33
    .line 34
    .line 35
    :cond_0
    move-object/from16 v7, p1

    .line 36
    .line 37
    invoke-virtual {p0, v8, v7}, Lv4/v;->C1(ILjava/util/ArrayList;)Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    move-result-object v10

    .line 41
    new-instance v7, Lv4/y0;

    .line 42
    .line 43
    iget-object v9, p0, Lv4/v;->I:Lj5/f1;

    .line 44
    .line 45
    invoke-direct {v7, v5, v9}, Lv4/y0;-><init>(Ljava/util/ArrayList;Lj5/f1;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v7}, Lm4/i1;->p()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    iget v9, v7, Lv4/y0;->g:I

    .line 53
    .line 54
    if-nez v5, :cond_2

    .line 55
    .line 56
    if-ge v1, v9, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    new-instance v1, Lm4/t;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :cond_2
    :goto_0
    const/4 v5, -0x1

    .line 66
    if-eqz p5, :cond_3

    .line 67
    .line 68
    iget-boolean v1, p0, Lv4/v;->E:Z

    .line 69
    .line 70
    invoke-virtual {v7, v1}, Lv4/y0;->a(Z)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    :goto_1
    move v12, v1

    .line 80
    goto :goto_2

    .line 81
    :cond_3
    if-ne v1, v5, :cond_4

    .line 82
    .line 83
    move v12, v2

    .line 84
    move-wide v2, v3

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    move-wide/from16 v2, p3

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :goto_2
    iget-object v1, p0, Lv4/v;->t0:Lv4/u0;

    .line 90
    .line 91
    invoke-virtual {p0, v7, v12, v2, v3}, Lv4/v;->R1(Lm4/i1;IJ)Landroid/util/Pair;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {p0, v1, v7, v4}, Lv4/v;->Q1(Lv4/u0;Lm4/i1;Landroid/util/Pair;)Lv4/u0;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget v4, v1, Lv4/u0;->e:I

    .line 100
    .line 101
    if-eq v12, v5, :cond_7

    .line 102
    .line 103
    if-eq v4, v6, :cond_7

    .line 104
    .line 105
    invoke-virtual {v7}, Lm4/i1;->p()Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-nez v4, :cond_6

    .line 110
    .line 111
    if-lt v12, v9, :cond_5

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    const/4 v4, 0x2

    .line 115
    goto :goto_4

    .line 116
    :cond_6
    :goto_3
    const/4 v4, 0x4

    .line 117
    :cond_7
    :goto_4
    invoke-virtual {v1, v4}, Lv4/u0;->f(I)Lv4/u0;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-static {v2, v3}, Lp4/c0;->N(J)J

    .line 122
    .line 123
    .line 124
    move-result-wide v13

    .line 125
    iget-object v11, p0, Lv4/v;->I:Lj5/f1;

    .line 126
    .line 127
    iget-object v2, p0, Lv4/v;->l:Lv4/c0;

    .line 128
    .line 129
    iget-object v2, v2, Lv4/c0;->h:Lp4/x;

    .line 130
    .line 131
    new-instance v9, Lv4/x;

    .line 132
    .line 133
    invoke-direct/range {v9 .. v14}, Lv4/x;-><init>(Ljava/util/ArrayList;Lj5/f1;IJ)V

    .line 134
    .line 135
    .line 136
    const/16 v3, 0x11

    .line 137
    .line 138
    invoke-virtual {v2, v3, v9}, Lp4/x;->a(ILjava/lang/Object;)Lp4/w;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v2}, Lp4/w;->b()V

    .line 143
    .line 144
    .line 145
    iget-object v2, p0, Lv4/v;->t0:Lv4/u0;

    .line 146
    .line 147
    iget-object v2, v2, Lv4/u0;->b:Lj5/d0;

    .line 148
    .line 149
    iget-object v2, v2, Lj5/d0;->a:Ljava/lang/Object;

    .line 150
    .line 151
    iget-object v3, v1, Lv4/u0;->b:Lj5/d0;

    .line 152
    .line 153
    iget-object v3, v3, Lj5/d0;->a:Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-nez v2, :cond_8

    .line 160
    .line 161
    iget-object v2, p0, Lv4/v;->t0:Lv4/u0;

    .line 162
    .line 163
    iget-object v2, v2, Lv4/u0;->a:Lm4/i1;

    .line 164
    .line 165
    invoke-virtual {v2}, Lm4/i1;->p()Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_8

    .line 170
    .line 171
    const/4 v3, 0x1

    .line 172
    goto :goto_5

    .line 173
    :cond_8
    const/4 v3, 0x0

    .line 174
    :goto_5
    invoke-virtual {p0, v1}, Lv4/v;->K1(Lv4/u0;)J

    .line 175
    .line 176
    .line 177
    move-result-wide v5

    .line 178
    const/4 v7, -0x1

    .line 179
    const/4 v8, 0x0

    .line 180
    const/4 v2, 0x0

    .line 181
    const/4 v4, 0x4

    .line 182
    move-object v0, p0

    .line 183
    invoke-virtual/range {v0 .. v8}, Lv4/v;->k2(Lv4/u0;IZIJIZ)V

    .line 184
    .line 185
    .line 186
    return-void
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

.method public final c()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv4/v;->r()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Lv4/v;->z:Lv4/d;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-virtual {v1, v2, v0}, Lv4/d;->d(IZ)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v3, -0x1

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, 0x1

    .line 22
    :goto_0
    invoke-virtual {p0, v1, v3, v0}, Lv4/v;->j2(IIZ)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 26
    .line 27
    iget v1, v0, Lv4/u0;->e:I

    .line 28
    .line 29
    if-eq v1, v4, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Lv4/u0;->d(Lv4/m;)Lv4/u0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, v0, Lv4/u0;->a:Lm4/i1;

    .line 38
    .line 39
    invoke-virtual {v1}, Lm4/i1;->p()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    :cond_2
    invoke-virtual {v0, v2}, Lv4/u0;->f(I)Lv4/u0;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    iget v0, p0, Lv4/v;->F:I

    .line 51
    .line 52
    add-int/2addr v0, v4

    .line 53
    iput v0, p0, Lv4/v;->F:I

    .line 54
    .line 55
    iget-object v0, p0, Lv4/v;->l:Lv4/c0;

    .line 56
    .line 57
    iget-object v0, v0, Lv4/c0;->h:Lp4/x;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lp4/x;->b()Lp4/w;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v0, v0, Lp4/x;->a:Landroid/os/Handler;

    .line 67
    .line 68
    const/16 v2, 0x1d

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, v1, Lp4/w;->a:Landroid/os/Message;

    .line 75
    .line 76
    invoke-virtual {v1}, Lp4/w;->b()V

    .line 77
    .line 78
    .line 79
    const/4 v12, -0x1

    .line 80
    const/4 v13, 0x0

    .line 81
    const/4 v7, 0x1

    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x5

    .line 84
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    move-object v5, p0

    .line 90
    invoke-virtual/range {v5 .. v13}, Lv4/v;->k2(Lv4/u0;IZIJIZ)V

    .line 91
    .line 92
    .line 93
    return-void
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public final c2(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->z:Lv4/d;

    .line 5
    .line 6
    invoke-virtual {p0}, Lv4/v;->i()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1, p1}, Lv4/d;->d(IZ)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, -0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x1

    .line 20
    :goto_0
    invoke-virtual {p0, v0, v1, p1}, Lv4/v;->j2(IIZ)V

    .line 21
    .line 22
    .line 23
    return-void
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
.end method

.method public final d2(Lm4/s0;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    iget-object v0, v0, Lv4/u0;->o:Lm4/s0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lm4/s0;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lv4/u0;->e(Lm4/s0;)Lv4/u0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget v0, p0, Lv4/v;->F:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    iput v0, p0, Lv4/v;->F:I

    .line 26
    .line 27
    iget-object v0, p0, Lv4/v;->l:Lv4/c0;

    .line 28
    .line 29
    iget-object v0, v0, Lv4/c0;->h:Lp4/x;

    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    invoke-virtual {v0, v1, p1}, Lp4/x;->a(ILjava/lang/Object;)Lp4/w;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lp4/w;->b()V

    .line 37
    .line 38
    .line 39
    const/4 v8, -0x1

    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x5

    .line 44
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    move-object v1, p0

    .line 50
    invoke-virtual/range {v1 .. v9}, Lv4/v;->k2(Lv4/u0;IZIJIZ)V

    .line 51
    .line 52
    .line 53
    return-void
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

.method public final e2(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lv4/v;->D:I

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lv4/v;->D:I

    .line 9
    .line 10
    iget-object v0, p0, Lv4/v;->l:Lv4/c0;

    .line 11
    .line 12
    iget-object v0, v0, Lv4/c0;->h:Lp4/x;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lp4/x;->b()Lp4/w;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v0, v0, Lp4/x;->a:Landroid/os/Handler;

    .line 22
    .line 23
    const/16 v2, 0xb

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v0, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, v1, Lp4/w;->a:Landroid/os/Message;

    .line 31
    .line 32
    invoke-virtual {v1}, Lp4/w;->b()V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lb7/x2;

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    invoke-direct {v0, p1, v1}, Lb7/x2;-><init>(II)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lv4/v;->m:Lp4/n;

    .line 42
    .line 43
    const/16 v1, 0x8

    .line 44
    .line 45
    invoke-virtual {p1, v1, v0}, Lp4/n;->c(ILp4/k;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lv4/v;->i2()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lp4/n;->b()V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
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

.method public final f2(Landroid/view/Surface;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lv4/v;->M:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-wide v4, p0, Lv4/v;->C:J

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-wide v4, v2

    .line 22
    :goto_1
    iget-object v6, p0, Lv4/v;->l:Lv4/c0;

    .line 23
    .line 24
    monitor-enter v6

    .line 25
    :try_start_0
    iget-boolean v7, v6, Lv4/c0;->B:Z

    .line 26
    .line 27
    if-nez v7, :cond_4

    .line 28
    .line 29
    iget-object v7, v6, Lv4/c0;->j:Landroid/os/Looper;

    .line 30
    .line 31
    invoke-virtual {v7}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-virtual {v7}, Ljava/lang/Thread;->isAlive()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-nez v7, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    new-instance v7, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 43
    .line 44
    invoke-direct {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v8, v6, Lv4/c0;->h:Lp4/x;

    .line 48
    .line 49
    new-instance v9, Landroid/util/Pair;

    .line 50
    .line 51
    invoke-direct {v9, p1, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const/16 v10, 0x1e

    .line 55
    .line 56
    invoke-virtual {v8, v10, v9}, Lp4/x;->a(ILjava/lang/Object;)Lp4/w;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v8}, Lp4/w;->b()V

    .line 61
    .line 62
    .line 63
    cmp-long v8, v4, v2

    .line 64
    .line 65
    if-eqz v8, :cond_3

    .line 66
    .line 67
    new-instance v1, Lj5/o;

    .line 68
    .line 69
    const/4 v2, 0x4

    .line 70
    invoke-direct {v1, v2, v7}, Lj5/o;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6, v1, v4, v5}, Lv4/c0;->q0(Lj5/o;J)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 77
    .line 78
    .line 79
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    monitor-exit v6

    .line 81
    goto :goto_3

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto :goto_4

    .line 84
    :cond_3
    monitor-exit v6

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    :goto_2
    monitor-exit v6

    .line 87
    :goto_3
    if-eqz v0, :cond_5

    .line 88
    .line 89
    iget-object v0, p0, Lv4/v;->M:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v2, p0, Lv4/v;->N:Landroid/view/Surface;

    .line 92
    .line 93
    if-ne v0, v2, :cond_5

    .line 94
    .line 95
    invoke-virtual {v2}, Landroid/view/Surface;->release()V

    .line 96
    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    iput-object v0, p0, Lv4/v;->N:Landroid/view/Surface;

    .line 100
    .line 101
    :cond_5
    iput-object p1, p0, Lv4/v;->M:Ljava/lang/Object;

    .line 102
    .line 103
    if-nez v1, :cond_6

    .line 104
    .line 105
    new-instance p1, Lce/j0;

    .line 106
    .line 107
    const-string v0, "Detaching surface timed out."

    .line 108
    .line 109
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    new-instance v0, Lv4/m;

    .line 113
    .line 114
    const/4 v1, 0x2

    .line 115
    const/16 v2, 0x3eb

    .line 116
    .line 117
    invoke-direct {v0, v1, p1, v2}, Lv4/m;-><init>(ILjava/lang/Exception;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v0}, Lv4/v;->h2(Lv4/m;)V

    .line 121
    .line 122
    .line 123
    :cond_6
    return-void

    .line 124
    :goto_4
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    throw p1
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

.method public final g2()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->z:Lv4/d;

    .line 5
    .line 6
    invoke-virtual {p0}, Lv4/v;->r()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v0, v2, v1}, Lv4/d;->d(IZ)I

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0}, Lv4/v;->h2(Lv4/m;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lo4/c;

    .line 19
    .line 20
    sget-object v1, Lya/a1;->e:Lya/a1;

    .line 21
    .line 22
    iget-object v2, p0, Lv4/v;->t0:Lv4/u0;

    .line 23
    .line 24
    iget-wide v2, v2, Lv4/u0;->s:J

    .line 25
    .line 26
    invoke-direct {v0, v2, v3, v1}, Lo4/c;-><init>(JLjava/util/List;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lv4/v;->W:Lo4/c;

    .line 30
    .line 31
    return-void
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
.end method

.method public final h2(Lv4/m;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 2
    .line 3
    iget-object v1, v0, Lv4/u0;->b:Lj5/d0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lv4/u0;->a(Lj5/d0;)Lv4/u0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v1, v0, Lv4/u0;->s:J

    .line 10
    .line 11
    iput-wide v1, v0, Lv4/u0;->q:J

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, v0, Lv4/u0;->r:J

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lv4/u0;->f(I)Lv4/u0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lv4/u0;->d(Lv4/m;)Lv4/u0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    move-object v3, v0

    .line 29
    iget p1, p0, Lv4/v;->F:I

    .line 30
    .line 31
    add-int/2addr p1, v1

    .line 32
    iput p1, p0, Lv4/v;->F:I

    .line 33
    .line 34
    iget-object p1, p0, Lv4/v;->l:Lv4/c0;

    .line 35
    .line 36
    iget-object p1, p1, Lv4/c0;->h:Lp4/x;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lp4/x;->b()Lp4/w;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object p1, p1, Lp4/x;->a:Landroid/os/Handler;

    .line 46
    .line 47
    const/4 v1, 0x6

    .line 48
    invoke-virtual {p1, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, v0, Lp4/w;->a:Landroid/os/Message;

    .line 53
    .line 54
    invoke-virtual {v0}, Lp4/w;->b()V

    .line 55
    .line 56
    .line 57
    const/4 v9, -0x1

    .line 58
    const/4 v10, 0x0

    .line 59
    const/4 v4, 0x0

    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v6, 0x5

    .line 62
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    move-object v2, p0

    .line 68
    invoke-virtual/range {v2 .. v10}, Lv4/v;->k2(Lv4/u0;IZIJIZ)V

    .line 69
    .line 70
    .line 71
    return-void
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

.method public final i()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    iget v0, v0, Lv4/u0;->e:I

    .line 7
    .line 8
    return v0
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

.method public final i2()V
    .locals 15

    .line 1
    iget-object v0, p0, Lv4/v;->J:Lm4/u0;

    .line 2
    .line 3
    sget v1, Lp4/c0;->a:I

    .line 4
    .line 5
    iget-object v1, p0, Lv4/v;->f:Lv4/v;

    .line 6
    .line 7
    invoke-virtual {v1}, Lv4/v;->o()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v1}, Landroidx/lifecycle/q;->n1()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {v1}, Landroidx/lifecycle/q;->j1()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v1}, Landroidx/lifecycle/q;->i1()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-virtual {v1}, Landroidx/lifecycle/q;->m1()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v1}, Landroidx/lifecycle/q;->l1()Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    invoke-virtual {v1}, Lv4/v;->J()Lm4/i1;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lm4/i1;->p()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    new-instance v8, Lm4/t0;

    .line 40
    .line 41
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v9, Lk5/d;

    .line 45
    .line 46
    invoke-direct {v9}, Lk5/d;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v9, v8, Lm4/t0;->a:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v9, v8, Lm4/t0;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, Lk5/d;

    .line 54
    .line 55
    iget-object v10, p0, Lv4/v;->c:Lm4/u0;

    .line 56
    .line 57
    iget-object v10, v10, Lm4/u0;->a:Lm4/o;

    .line 58
    .line 59
    invoke-virtual {v9, v10}, Lk5/d;->b(Lm4/o;)V

    .line 60
    .line 61
    .line 62
    xor-int/lit8 v10, v2, 0x1

    .line 63
    .line 64
    const/4 v11, 0x4

    .line 65
    invoke-virtual {v8, v11, v10}, Lm4/t0;->a(IZ)V

    .line 66
    .line 67
    .line 68
    const/4 v11, 0x0

    .line 69
    const/4 v12, 0x1

    .line 70
    if-eqz v3, :cond_0

    .line 71
    .line 72
    if-nez v2, :cond_0

    .line 73
    .line 74
    const/4 v13, 0x1

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/4 v13, 0x0

    .line 77
    :goto_0
    const/4 v14, 0x5

    .line 78
    invoke-virtual {v8, v14, v13}, Lm4/t0;->a(IZ)V

    .line 79
    .line 80
    .line 81
    if-eqz v4, :cond_1

    .line 82
    .line 83
    if-nez v2, :cond_1

    .line 84
    .line 85
    const/4 v13, 0x1

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    const/4 v13, 0x0

    .line 88
    :goto_1
    const/4 v14, 0x6

    .line 89
    invoke-virtual {v8, v14, v13}, Lm4/t0;->a(IZ)V

    .line 90
    .line 91
    .line 92
    if-nez v1, :cond_3

    .line 93
    .line 94
    if-nez v4, :cond_2

    .line 95
    .line 96
    if-eqz v6, :cond_2

    .line 97
    .line 98
    if-eqz v3, :cond_3

    .line 99
    .line 100
    :cond_2
    if-nez v2, :cond_3

    .line 101
    .line 102
    const/4 v4, 0x1

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    const/4 v4, 0x0

    .line 105
    :goto_2
    const/4 v13, 0x7

    .line 106
    invoke-virtual {v8, v13, v4}, Lm4/t0;->a(IZ)V

    .line 107
    .line 108
    .line 109
    if-eqz v5, :cond_4

    .line 110
    .line 111
    if-nez v2, :cond_4

    .line 112
    .line 113
    const/4 v4, 0x1

    .line 114
    goto :goto_3

    .line 115
    :cond_4
    const/4 v4, 0x0

    .line 116
    :goto_3
    const/16 v13, 0x8

    .line 117
    .line 118
    invoke-virtual {v8, v13, v4}, Lm4/t0;->a(IZ)V

    .line 119
    .line 120
    .line 121
    if-nez v1, :cond_6

    .line 122
    .line 123
    if-nez v5, :cond_5

    .line 124
    .line 125
    if-eqz v6, :cond_6

    .line 126
    .line 127
    if-eqz v7, :cond_6

    .line 128
    .line 129
    :cond_5
    if-nez v2, :cond_6

    .line 130
    .line 131
    const/4 v1, 0x1

    .line 132
    goto :goto_4

    .line 133
    :cond_6
    const/4 v1, 0x0

    .line 134
    :goto_4
    const/16 v4, 0x9

    .line 135
    .line 136
    invoke-virtual {v8, v4, v1}, Lm4/t0;->a(IZ)V

    .line 137
    .line 138
    .line 139
    const/16 v1, 0xa

    .line 140
    .line 141
    invoke-virtual {v8, v1, v10}, Lm4/t0;->a(IZ)V

    .line 142
    .line 143
    .line 144
    if-eqz v3, :cond_7

    .line 145
    .line 146
    if-nez v2, :cond_7

    .line 147
    .line 148
    const/4 v1, 0x1

    .line 149
    goto :goto_5

    .line 150
    :cond_7
    const/4 v1, 0x0

    .line 151
    :goto_5
    const/16 v4, 0xb

    .line 152
    .line 153
    invoke-virtual {v8, v4, v1}, Lm4/t0;->a(IZ)V

    .line 154
    .line 155
    .line 156
    if-eqz v3, :cond_8

    .line 157
    .line 158
    if-nez v2, :cond_8

    .line 159
    .line 160
    const/4 v11, 0x1

    .line 161
    :cond_8
    const/16 v1, 0xc

    .line 162
    .line 163
    invoke-virtual {v8, v1, v11}, Lm4/t0;->a(IZ)V

    .line 164
    .line 165
    .line 166
    new-instance v1, Lm4/u0;

    .line 167
    .line 168
    invoke-virtual {v9}, Lk5/d;->d()Lm4/o;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-direct {v1, v2}, Lm4/u0;-><init>(Lm4/o;)V

    .line 173
    .line 174
    .line 175
    iput-object v1, p0, Lv4/v;->J:Lm4/u0;

    .line 176
    .line 177
    invoke-virtual {v1, v0}, Lm4/u0;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-nez v0, :cond_9

    .line 182
    .line 183
    new-instance v0, Lv4/q;

    .line 184
    .line 185
    invoke-direct {v0, p0, v12}, Lv4/q;-><init>(Lv4/v;I)V

    .line 186
    .line 187
    .line 188
    iget-object v1, p0, Lv4/v;->m:Lp4/n;

    .line 189
    .line 190
    const/16 v2, 0xd

    .line 191
    .line 192
    invoke-virtual {v1, v2, v0}, Lp4/n;->c(ILp4/k;)V

    .line 193
    .line 194
    .line 195
    :cond_9
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final j2(IIZ)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    const/4 v5, -0x1

    .line 12
    if-eq v1, v5, :cond_0

    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v5, 0x0

    .line 17
    :goto_0
    if-nez v1, :cond_1

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    :cond_1
    iget-object v1, v0, Lv4/v;->t0:Lv4/u0;

    .line 21
    .line 22
    iget-boolean v6, v1, Lv4/u0;->l:Z

    .line 23
    .line 24
    if-ne v6, v5, :cond_2

    .line 25
    .line 26
    iget v7, v1, Lv4/u0;->n:I

    .line 27
    .line 28
    if-ne v7, v3, :cond_2

    .line 29
    .line 30
    iget v7, v1, Lv4/u0;->m:I

    .line 31
    .line 32
    if-ne v7, v2, :cond_2

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    iget v7, v0, Lv4/v;->F:I

    .line 36
    .line 37
    add-int/2addr v7, v4

    .line 38
    iput v7, v0, Lv4/v;->F:I

    .line 39
    .line 40
    iget-boolean v7, v1, Lv4/u0;->p:Z

    .line 41
    .line 42
    if-eqz v7, :cond_3

    .line 43
    .line 44
    move/from16 v20, v6

    .line 45
    .line 46
    new-instance v6, Lv4/u0;

    .line 47
    .line 48
    iget-object v7, v1, Lv4/u0;->a:Lm4/i1;

    .line 49
    .line 50
    iget-object v8, v1, Lv4/u0;->b:Lj5/d0;

    .line 51
    .line 52
    iget-wide v9, v1, Lv4/u0;->c:J

    .line 53
    .line 54
    iget-wide v11, v1, Lv4/u0;->d:J

    .line 55
    .line 56
    iget v13, v1, Lv4/u0;->e:I

    .line 57
    .line 58
    iget-object v14, v1, Lv4/u0;->f:Lv4/m;

    .line 59
    .line 60
    iget-boolean v15, v1, Lv4/u0;->g:Z

    .line 61
    .line 62
    iget-object v4, v1, Lv4/u0;->h:Lj5/o1;

    .line 63
    .line 64
    move-object/from16 v16, v4

    .line 65
    .line 66
    iget-object v4, v1, Lv4/u0;->i:Lm5/u;

    .line 67
    .line 68
    move-object/from16 v17, v4

    .line 69
    .line 70
    iget-object v4, v1, Lv4/u0;->j:Ljava/util/List;

    .line 71
    .line 72
    move-object/from16 v18, v4

    .line 73
    .line 74
    iget-object v4, v1, Lv4/u0;->k:Lj5/d0;

    .line 75
    .line 76
    move-object/from16 v19, v4

    .line 77
    .line 78
    iget v4, v1, Lv4/u0;->m:I

    .line 79
    .line 80
    move/from16 v21, v4

    .line 81
    .line 82
    iget v4, v1, Lv4/u0;->n:I

    .line 83
    .line 84
    move/from16 v22, v4

    .line 85
    .line 86
    iget-object v4, v1, Lv4/u0;->o:Lm4/s0;

    .line 87
    .line 88
    move-object/from16 p1, v6

    .line 89
    .line 90
    move-object/from16 v23, v7

    .line 91
    .line 92
    iget-wide v6, v1, Lv4/u0;->q:J

    .line 93
    .line 94
    move-wide/from16 v24, v6

    .line 95
    .line 96
    iget-wide v6, v1, Lv4/u0;->r:J

    .line 97
    .line 98
    invoke-virtual {v1}, Lv4/u0;->i()J

    .line 99
    .line 100
    .line 101
    move-result-wide v28

    .line 102
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 103
    .line 104
    .line 105
    move-result-wide v30

    .line 106
    iget-boolean v1, v1, Lv4/u0;->p:Z

    .line 107
    .line 108
    move/from16 v32, v1

    .line 109
    .line 110
    move-wide/from16 v26, v6

    .line 111
    .line 112
    move-object/from16 v7, v23

    .line 113
    .line 114
    move-object/from16 v6, p1

    .line 115
    .line 116
    move-object/from16 v23, v4

    .line 117
    .line 118
    invoke-direct/range {v6 .. v32}, Lv4/u0;-><init>(Lm4/i1;Lj5/d0;JJILv4/m;ZLj5/o1;Lm5/u;Ljava/util/List;Lj5/d0;ZIILm4/s0;JJJJZ)V

    .line 119
    .line 120
    .line 121
    move-object v1, v6

    .line 122
    :cond_3
    invoke-virtual {v1, v2, v3, v5}, Lv4/u0;->c(IIZ)Lv4/u0;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iget-object v4, v0, Lv4/v;->l:Lv4/c0;

    .line 127
    .line 128
    shl-int/lit8 v3, v3, 0x4

    .line 129
    .line 130
    or-int/2addr v2, v3

    .line 131
    iget-object v3, v4, Lv4/c0;->h:Lp4/x;

    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-static {}, Lp4/x;->b()Lp4/w;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    iget-object v3, v3, Lp4/x;->a:Landroid/os/Handler;

    .line 141
    .line 142
    const/4 v6, 0x1

    .line 143
    invoke-virtual {v3, v6, v5, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    iput-object v2, v4, Lp4/w;->a:Landroid/os/Message;

    .line 148
    .line 149
    invoke-virtual {v4}, Lp4/w;->b()V

    .line 150
    .line 151
    .line 152
    const/4 v7, -0x1

    .line 153
    const/4 v8, 0x0

    .line 154
    const/4 v2, 0x0

    .line 155
    const/4 v3, 0x0

    .line 156
    const/4 v4, 0x5

    .line 157
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v0 .. v8}, Lv4/v;->k2(Lv4/u0;IZIJIZ)V

    .line 163
    .line 164
    .line 165
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
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

.method public final k2(Lv4/u0;IZIJIZ)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, Lv4/v;->t0:Lv4/u0;

    .line 8
    .line 9
    iput-object v1, v0, Lv4/v;->t0:Lv4/u0;

    .line 10
    .line 11
    iget-object v4, v3, Lv4/u0;->a:Lm4/i1;

    .line 12
    .line 13
    iget-object v5, v1, Lv4/u0;->a:Lm4/i1;

    .line 14
    .line 15
    invoke-virtual {v4, v5}, Lm4/i1;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    iget-object v5, v0, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, Lm4/h1;

    .line 22
    .line 23
    iget-object v6, v0, Lv4/v;->o:Lm4/f1;

    .line 24
    .line 25
    const/4 v7, -0x1

    .line 26
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    iget-object v9, v3, Lv4/u0;->a:Lm4/i1;

    .line 31
    .line 32
    iget-object v10, v3, Lv4/u0;->b:Lj5/d0;

    .line 33
    .line 34
    iget-object v11, v1, Lv4/u0;->a:Lm4/i1;

    .line 35
    .line 36
    iget-object v12, v1, Lv4/u0;->b:Lj5/d0;

    .line 37
    .line 38
    invoke-virtual {v11}, Lm4/i1;->p()Z

    .line 39
    .line 40
    .line 41
    move-result v13

    .line 42
    const/16 v16, 0x0

    .line 43
    .line 44
    const/16 v17, 0x2

    .line 45
    .line 46
    const-wide/16 v14, 0x0

    .line 47
    .line 48
    const/16 v18, 0x3

    .line 49
    .line 50
    if-eqz v13, :cond_0

    .line 51
    .line 52
    invoke-virtual {v9}, Lm4/i1;->p()Z

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    if-eqz v13, :cond_0

    .line 57
    .line 58
    new-instance v5, Landroid/util/Pair;

    .line 59
    .line 60
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-direct {v5, v6, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_1

    .line 66
    .line 67
    :cond_0
    invoke-virtual {v11}, Lm4/i1;->p()Z

    .line 68
    .line 69
    .line 70
    move-result v13

    .line 71
    invoke-virtual {v9}, Lm4/i1;->p()Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eq v13, v7, :cond_1

    .line 76
    .line 77
    new-instance v5, Landroid/util/Pair;

    .line 78
    .line 79
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_1

    .line 89
    .line 90
    :cond_1
    iget-object v7, v10, Lj5/d0;->a:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-virtual {v9, v7, v6}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    iget v7, v7, Lm4/f1;->c:I

    .line 97
    .line 98
    invoke-virtual {v9, v7, v5, v14, v15}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    iget-object v7, v7, Lm4/h1;->a:Ljava/lang/Object;

    .line 103
    .line 104
    iget-object v9, v12, Lj5/d0;->a:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-virtual {v11, v9, v6}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    iget v6, v6, Lm4/f1;->c:I

    .line 111
    .line 112
    invoke-virtual {v11, v6, v5, v14, v15}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    iget-object v5, v5, Lm4/h1;->a:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {v7, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-nez v5, :cond_5

    .line 123
    .line 124
    if-eqz p3, :cond_2

    .line 125
    .line 126
    if-nez v2, :cond_2

    .line 127
    .line 128
    const/4 v5, 0x1

    .line 129
    goto :goto_0

    .line 130
    :cond_2
    if-eqz p3, :cond_3

    .line 131
    .line 132
    const/4 v5, 0x1

    .line 133
    if-ne v2, v5, :cond_3

    .line 134
    .line 135
    const/4 v5, 0x2

    .line 136
    goto :goto_0

    .line 137
    :cond_3
    if-nez v4, :cond_4

    .line 138
    .line 139
    const/4 v5, 0x3

    .line 140
    :goto_0
    new-instance v6, Landroid/util/Pair;

    .line 141
    .line 142
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-direct {v6, v7, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    move-object v5, v6

    .line 152
    goto :goto_1

    .line 153
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 156
    .line 157
    .line 158
    throw v1

    .line 159
    :cond_5
    if-eqz p3, :cond_6

    .line 160
    .line 161
    if-nez v2, :cond_6

    .line 162
    .line 163
    iget-wide v5, v10, Lj5/d0;->d:J

    .line 164
    .line 165
    iget-wide v9, v12, Lj5/d0;->d:J

    .line 166
    .line 167
    cmp-long v7, v5, v9

    .line 168
    .line 169
    if-gez v7, :cond_6

    .line 170
    .line 171
    new-instance v5, Landroid/util/Pair;

    .line 172
    .line 173
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_6
    if-eqz p3, :cond_7

    .line 184
    .line 185
    const/4 v5, 0x1

    .line 186
    if-ne v2, v5, :cond_7

    .line 187
    .line 188
    if-eqz p8, :cond_7

    .line 189
    .line 190
    new-instance v5, Landroid/util/Pair;

    .line 191
    .line 192
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 193
    .line 194
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_7
    new-instance v5, Landroid/util/Pair;

    .line 203
    .line 204
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-direct {v5, v6, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :goto_1
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v6, Ljava/lang/Boolean;

    .line 212
    .line 213
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v5, Ljava/lang/Integer;

    .line 220
    .line 221
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-eqz v6, :cond_9

    .line 226
    .line 227
    iget-object v8, v1, Lv4/u0;->a:Lm4/i1;

    .line 228
    .line 229
    invoke-virtual {v8}, Lm4/i1;->p()Z

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    if-nez v8, :cond_8

    .line 234
    .line 235
    iget-object v8, v1, Lv4/u0;->a:Lm4/i1;

    .line 236
    .line 237
    iget-object v9, v1, Lv4/u0;->b:Lj5/d0;

    .line 238
    .line 239
    iget-object v9, v9, Lj5/d0;->a:Ljava/lang/Object;

    .line 240
    .line 241
    iget-object v10, v0, Lv4/v;->o:Lm4/f1;

    .line 242
    .line 243
    invoke-virtual {v8, v9, v10}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    iget v8, v8, Lm4/f1;->c:I

    .line 248
    .line 249
    iget-object v9, v1, Lv4/u0;->a:Lm4/i1;

    .line 250
    .line 251
    iget-object v10, v0, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v10, Lm4/h1;

    .line 254
    .line 255
    invoke-virtual {v9, v8, v10, v14, v15}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    iget-object v8, v8, Lm4/h1;->c:Lm4/i0;

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_8
    const/4 v8, 0x0

    .line 263
    :goto_2
    sget-object v9, Lm4/l0;->K:Lm4/l0;

    .line 264
    .line 265
    iput-object v9, v0, Lv4/v;->s0:Lm4/l0;

    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_9
    const/4 v8, 0x0

    .line 269
    :goto_3
    if-nez v6, :cond_a

    .line 270
    .line 271
    iget-object v9, v3, Lv4/u0;->j:Ljava/util/List;

    .line 272
    .line 273
    iget-object v10, v1, Lv4/u0;->j:Ljava/util/List;

    .line 274
    .line 275
    invoke-interface {v9, v10}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v9

    .line 279
    if-nez v9, :cond_d

    .line 280
    .line 281
    :cond_a
    iget-object v9, v0, Lv4/v;->s0:Lm4/l0;

    .line 282
    .line 283
    invoke-virtual {v9}, Lm4/l0;->a()Lm4/k0;

    .line 284
    .line 285
    .line 286
    move-result-object v9

    .line 287
    iget-object v10, v1, Lv4/u0;->j:Ljava/util/List;

    .line 288
    .line 289
    const/4 v11, 0x0

    .line 290
    :goto_4
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 291
    .line 292
    .line 293
    move-result v12

    .line 294
    if-ge v11, v12, :cond_c

    .line 295
    .line 296
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v12

    .line 300
    check-cast v12, Lm4/n0;

    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    :goto_5
    iget-object v7, v12, Lm4/n0;->a:[Lm4/m0;

    .line 304
    .line 305
    array-length v14, v7

    .line 306
    if-ge v13, v14, :cond_b

    .line 307
    .line 308
    aget-object v7, v7, v13

    .line 309
    .line 310
    invoke-interface {v7, v9}, Lm4/m0;->b(Lm4/k0;)V

    .line 311
    .line 312
    .line 313
    add-int/lit8 v13, v13, 0x1

    .line 314
    .line 315
    const-wide/16 v14, 0x0

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_b
    add-int/lit8 v11, v11, 0x1

    .line 319
    .line 320
    const-wide/16 v14, 0x0

    .line 321
    .line 322
    goto :goto_4

    .line 323
    :cond_c
    new-instance v7, Lm4/l0;

    .line 324
    .line 325
    invoke-direct {v7, v9}, Lm4/l0;-><init>(Lm4/k0;)V

    .line 326
    .line 327
    .line 328
    iput-object v7, v0, Lv4/v;->s0:Lm4/l0;

    .line 329
    .line 330
    :cond_d
    invoke-virtual {v0}, Lv4/v;->E1()Lm4/l0;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    iget-object v9, v0, Lv4/v;->K:Lm4/l0;

    .line 335
    .line 336
    invoke-virtual {v7, v9}, Lm4/l0;->equals(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v9

    .line 340
    iput-object v7, v0, Lv4/v;->K:Lm4/l0;

    .line 341
    .line 342
    iget-boolean v7, v3, Lv4/u0;->l:Z

    .line 343
    .line 344
    iget-boolean v10, v1, Lv4/u0;->l:Z

    .line 345
    .line 346
    if-eq v7, v10, :cond_e

    .line 347
    .line 348
    const/4 v7, 0x1

    .line 349
    goto :goto_6

    .line 350
    :cond_e
    const/4 v7, 0x0

    .line 351
    :goto_6
    iget v10, v3, Lv4/u0;->e:I

    .line 352
    .line 353
    iget v11, v1, Lv4/u0;->e:I

    .line 354
    .line 355
    if-eq v10, v11, :cond_f

    .line 356
    .line 357
    const/4 v10, 0x1

    .line 358
    goto :goto_7

    .line 359
    :cond_f
    const/4 v10, 0x0

    .line 360
    :goto_7
    if-nez v10, :cond_10

    .line 361
    .line 362
    if-eqz v7, :cond_11

    .line 363
    .line 364
    :cond_10
    invoke-virtual {v0}, Lv4/v;->l2()V

    .line 365
    .line 366
    .line 367
    :cond_11
    iget-boolean v11, v3, Lv4/u0;->g:Z

    .line 368
    .line 369
    iget-boolean v12, v1, Lv4/u0;->g:Z

    .line 370
    .line 371
    if-eq v11, v12, :cond_12

    .line 372
    .line 373
    const/4 v11, 0x1

    .line 374
    goto :goto_8

    .line 375
    :cond_12
    const/4 v11, 0x0

    .line 376
    :goto_8
    if-nez v4, :cond_13

    .line 377
    .line 378
    iget-object v4, v0, Lv4/v;->m:Lp4/n;

    .line 379
    .line 380
    new-instance v12, Lb7/e1;

    .line 381
    .line 382
    const/4 v13, 0x2

    .line 383
    move/from16 v14, p2

    .line 384
    .line 385
    invoke-direct {v12, v14, v13, v1}, Lb7/e1;-><init>(IILjava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    const/4 v13, 0x0

    .line 389
    invoke-virtual {v4, v13, v12}, Lp4/n;->c(ILp4/k;)V

    .line 390
    .line 391
    .line 392
    :cond_13
    if-eqz p3, :cond_1b

    .line 393
    .line 394
    new-instance v4, Lm4/f1;

    .line 395
    .line 396
    invoke-direct {v4}, Lm4/f1;-><init>()V

    .line 397
    .line 398
    .line 399
    iget-object v12, v3, Lv4/u0;->a:Lm4/i1;

    .line 400
    .line 401
    invoke-virtual {v12}, Lm4/i1;->p()Z

    .line 402
    .line 403
    .line 404
    move-result v12

    .line 405
    if-nez v12, :cond_14

    .line 406
    .line 407
    iget-object v12, v3, Lv4/u0;->b:Lj5/d0;

    .line 408
    .line 409
    iget-object v12, v12, Lj5/d0;->a:Ljava/lang/Object;

    .line 410
    .line 411
    iget-object v13, v3, Lv4/u0;->a:Lm4/i1;

    .line 412
    .line 413
    invoke-virtual {v13, v12, v4}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 414
    .line 415
    .line 416
    iget v13, v4, Lm4/f1;->c:I

    .line 417
    .line 418
    iget-object v14, v3, Lv4/u0;->a:Lm4/i1;

    .line 419
    .line 420
    invoke-virtual {v14, v12}, Lm4/i1;->b(Ljava/lang/Object;)I

    .line 421
    .line 422
    .line 423
    move-result v14

    .line 424
    iget-object v15, v3, Lv4/u0;->a:Lm4/i1;

    .line 425
    .line 426
    move/from16 v16, v6

    .line 427
    .line 428
    iget-object v6, v0, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v6, Lm4/h1;

    .line 431
    .line 432
    move/from16 v19, v9

    .line 433
    .line 434
    move/from16 v20, v10

    .line 435
    .line 436
    const-wide/16 v9, 0x0

    .line 437
    .line 438
    invoke-virtual {v15, v13, v6, v9, v10}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    iget-object v6, v6, Lm4/h1;->a:Ljava/lang/Object;

    .line 443
    .line 444
    iget-object v9, v0, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v9, Lm4/h1;

    .line 447
    .line 448
    iget-object v9, v9, Lm4/h1;->c:Lm4/i0;

    .line 449
    .line 450
    move-object/from16 v22, v6

    .line 451
    .line 452
    move-object/from16 v24, v9

    .line 453
    .line 454
    move-object/from16 v25, v12

    .line 455
    .line 456
    move/from16 v23, v13

    .line 457
    .line 458
    move/from16 v26, v14

    .line 459
    .line 460
    goto :goto_9

    .line 461
    :cond_14
    move/from16 v16, v6

    .line 462
    .line 463
    move/from16 v19, v9

    .line 464
    .line 465
    move/from16 v20, v10

    .line 466
    .line 467
    move/from16 v23, p7

    .line 468
    .line 469
    const/16 v22, 0x0

    .line 470
    .line 471
    const/16 v24, 0x0

    .line 472
    .line 473
    const/16 v25, 0x0

    .line 474
    .line 475
    const/16 v26, -0x1

    .line 476
    .line 477
    :goto_9
    if-nez v2, :cond_17

    .line 478
    .line 479
    iget-object v6, v3, Lv4/u0;->b:Lj5/d0;

    .line 480
    .line 481
    invoke-virtual {v6}, Lj5/d0;->b()Z

    .line 482
    .line 483
    .line 484
    move-result v6

    .line 485
    if-eqz v6, :cond_15

    .line 486
    .line 487
    iget-object v6, v3, Lv4/u0;->b:Lj5/d0;

    .line 488
    .line 489
    iget v9, v6, Lj5/d0;->b:I

    .line 490
    .line 491
    iget v6, v6, Lj5/d0;->c:I

    .line 492
    .line 493
    invoke-virtual {v4, v9, v6}, Lm4/f1;->a(II)J

    .line 494
    .line 495
    .line 496
    move-result-wide v9

    .line 497
    invoke-static {v3}, Lv4/v;->P1(Lv4/u0;)J

    .line 498
    .line 499
    .line 500
    move-result-wide v12

    .line 501
    goto :goto_c

    .line 502
    :cond_15
    iget-object v6, v3, Lv4/u0;->b:Lj5/d0;

    .line 503
    .line 504
    iget v6, v6, Lj5/d0;->e:I

    .line 505
    .line 506
    const/4 v9, -0x1

    .line 507
    if-eq v6, v9, :cond_16

    .line 508
    .line 509
    iget-object v4, v0, Lv4/v;->t0:Lv4/u0;

    .line 510
    .line 511
    invoke-static {v4}, Lv4/v;->P1(Lv4/u0;)J

    .line 512
    .line 513
    .line 514
    move-result-wide v9

    .line 515
    :goto_a
    move-wide v12, v9

    .line 516
    goto :goto_c

    .line 517
    :cond_16
    iget-wide v9, v4, Lm4/f1;->e:J

    .line 518
    .line 519
    iget-wide v12, v4, Lm4/f1;->d:J

    .line 520
    .line 521
    :goto_b
    add-long/2addr v9, v12

    .line 522
    goto :goto_a

    .line 523
    :cond_17
    iget-object v6, v3, Lv4/u0;->b:Lj5/d0;

    .line 524
    .line 525
    invoke-virtual {v6}, Lj5/d0;->b()Z

    .line 526
    .line 527
    .line 528
    move-result v6

    .line 529
    if-eqz v6, :cond_18

    .line 530
    .line 531
    iget-wide v9, v3, Lv4/u0;->s:J

    .line 532
    .line 533
    invoke-static {v3}, Lv4/v;->P1(Lv4/u0;)J

    .line 534
    .line 535
    .line 536
    move-result-wide v12

    .line 537
    goto :goto_c

    .line 538
    :cond_18
    iget-wide v9, v4, Lm4/f1;->e:J

    .line 539
    .line 540
    iget-wide v12, v3, Lv4/u0;->s:J

    .line 541
    .line 542
    goto :goto_b

    .line 543
    :goto_c
    new-instance v21, Lm4/x0;

    .line 544
    .line 545
    invoke-static {v9, v10}, Lp4/c0;->c0(J)J

    .line 546
    .line 547
    .line 548
    move-result-wide v27

    .line 549
    invoke-static {v12, v13}, Lp4/c0;->c0(J)J

    .line 550
    .line 551
    .line 552
    move-result-wide v29

    .line 553
    iget-object v4, v3, Lv4/u0;->b:Lj5/d0;

    .line 554
    .line 555
    iget v6, v4, Lj5/d0;->b:I

    .line 556
    .line 557
    iget v4, v4, Lj5/d0;->c:I

    .line 558
    .line 559
    move/from16 v32, v4

    .line 560
    .line 561
    move/from16 v31, v6

    .line 562
    .line 563
    invoke-direct/range {v21 .. v32}, Lm4/x0;-><init>(Ljava/lang/Object;ILm4/i0;Ljava/lang/Object;IJJII)V

    .line 564
    .line 565
    .line 566
    move-object/from16 v4, v21

    .line 567
    .line 568
    iget-object v6, v0, Landroidx/lifecycle/q;->a:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v6, Lm4/h1;

    .line 571
    .line 572
    invoke-virtual {v0}, Lv4/v;->G()I

    .line 573
    .line 574
    .line 575
    move-result v9

    .line 576
    iget-object v10, v0, Lv4/v;->t0:Lv4/u0;

    .line 577
    .line 578
    iget-object v10, v10, Lv4/u0;->a:Lm4/i1;

    .line 579
    .line 580
    invoke-virtual {v10}, Lm4/i1;->p()Z

    .line 581
    .line 582
    .line 583
    move-result v10

    .line 584
    if-nez v10, :cond_19

    .line 585
    .line 586
    iget-object v10, v0, Lv4/v;->t0:Lv4/u0;

    .line 587
    .line 588
    iget-object v12, v10, Lv4/u0;->b:Lj5/d0;

    .line 589
    .line 590
    iget-object v12, v12, Lj5/d0;->a:Ljava/lang/Object;

    .line 591
    .line 592
    iget-object v10, v10, Lv4/u0;->a:Lm4/i1;

    .line 593
    .line 594
    iget-object v13, v0, Lv4/v;->o:Lm4/f1;

    .line 595
    .line 596
    invoke-virtual {v10, v12, v13}, Lm4/i1;->g(Ljava/lang/Object;Lm4/f1;)Lm4/f1;

    .line 597
    .line 598
    .line 599
    iget-object v10, v0, Lv4/v;->t0:Lv4/u0;

    .line 600
    .line 601
    iget-object v10, v10, Lv4/u0;->a:Lm4/i1;

    .line 602
    .line 603
    invoke-virtual {v10, v12}, Lm4/i1;->b(Ljava/lang/Object;)I

    .line 604
    .line 605
    .line 606
    move-result v10

    .line 607
    iget-object v13, v0, Lv4/v;->t0:Lv4/u0;

    .line 608
    .line 609
    iget-object v13, v13, Lv4/u0;->a:Lm4/i1;

    .line 610
    .line 611
    const-wide/16 v14, 0x0

    .line 612
    .line 613
    invoke-virtual {v13, v9, v6, v14, v15}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 614
    .line 615
    .line 616
    move-result-object v13

    .line 617
    iget-object v13, v13, Lm4/h1;->a:Ljava/lang/Object;

    .line 618
    .line 619
    iget-object v6, v6, Lm4/h1;->c:Lm4/i0;

    .line 620
    .line 621
    move-object/from16 v24, v6

    .line 622
    .line 623
    move/from16 v26, v10

    .line 624
    .line 625
    move-object/from16 v25, v12

    .line 626
    .line 627
    move-object/from16 v22, v13

    .line 628
    .line 629
    goto :goto_d

    .line 630
    :cond_19
    const/16 v22, 0x0

    .line 631
    .line 632
    const/16 v24, 0x0

    .line 633
    .line 634
    const/16 v25, 0x0

    .line 635
    .line 636
    const/16 v26, -0x1

    .line 637
    .line 638
    :goto_d
    invoke-static/range {p5 .. p6}, Lp4/c0;->c0(J)J

    .line 639
    .line 640
    .line 641
    move-result-wide v27

    .line 642
    new-instance v21, Lm4/x0;

    .line 643
    .line 644
    iget-object v6, v0, Lv4/v;->t0:Lv4/u0;

    .line 645
    .line 646
    iget-object v6, v6, Lv4/u0;->b:Lj5/d0;

    .line 647
    .line 648
    invoke-virtual {v6}, Lj5/d0;->b()Z

    .line 649
    .line 650
    .line 651
    move-result v6

    .line 652
    if-eqz v6, :cond_1a

    .line 653
    .line 654
    iget-object v6, v0, Lv4/v;->t0:Lv4/u0;

    .line 655
    .line 656
    invoke-static {v6}, Lv4/v;->P1(Lv4/u0;)J

    .line 657
    .line 658
    .line 659
    move-result-wide v12

    .line 660
    invoke-static {v12, v13}, Lp4/c0;->c0(J)J

    .line 661
    .line 662
    .line 663
    move-result-wide v12

    .line 664
    move-wide/from16 v29, v12

    .line 665
    .line 666
    goto :goto_e

    .line 667
    :cond_1a
    move-wide/from16 v29, v27

    .line 668
    .line 669
    :goto_e
    iget-object v6, v0, Lv4/v;->t0:Lv4/u0;

    .line 670
    .line 671
    iget-object v6, v6, Lv4/u0;->b:Lj5/d0;

    .line 672
    .line 673
    iget v10, v6, Lj5/d0;->b:I

    .line 674
    .line 675
    iget v6, v6, Lj5/d0;->c:I

    .line 676
    .line 677
    move/from16 v32, v6

    .line 678
    .line 679
    move/from16 v23, v9

    .line 680
    .line 681
    move/from16 v31, v10

    .line 682
    .line 683
    invoke-direct/range {v21 .. v32}, Lm4/x0;-><init>(Ljava/lang/Object;ILm4/i0;Ljava/lang/Object;IJJII)V

    .line 684
    .line 685
    .line 686
    move-object/from16 v6, v21

    .line 687
    .line 688
    iget-object v9, v0, Lv4/v;->m:Lp4/n;

    .line 689
    .line 690
    new-instance v10, Lb7/g1;

    .line 691
    .line 692
    invoke-direct {v10, v2, v4, v6}, Lb7/g1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    const/16 v2, 0xb

    .line 696
    .line 697
    invoke-virtual {v9, v2, v10}, Lp4/n;->c(ILp4/k;)V

    .line 698
    .line 699
    .line 700
    goto :goto_f

    .line 701
    :cond_1b
    move/from16 v16, v6

    .line 702
    .line 703
    move/from16 v19, v9

    .line 704
    .line 705
    move/from16 v20, v10

    .line 706
    .line 707
    :goto_f
    if-eqz v16, :cond_1c

    .line 708
    .line 709
    iget-object v2, v0, Lv4/v;->m:Lp4/n;

    .line 710
    .line 711
    new-instance v4, Lb7/e1;

    .line 712
    .line 713
    const/4 v6, 0x3

    .line 714
    invoke-direct {v4, v5, v6, v8}, Lb7/e1;-><init>(IILjava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    const/4 v5, 0x1

    .line 718
    invoke-virtual {v2, v5, v4}, Lp4/n;->c(ILp4/k;)V

    .line 719
    .line 720
    .line 721
    :cond_1c
    iget-object v2, v3, Lv4/u0;->f:Lv4/m;

    .line 722
    .line 723
    iget-object v4, v1, Lv4/u0;->f:Lv4/m;

    .line 724
    .line 725
    if-eq v2, v4, :cond_1d

    .line 726
    .line 727
    iget-object v2, v0, Lv4/v;->m:Lp4/n;

    .line 728
    .line 729
    new-instance v4, Lv4/p;

    .line 730
    .line 731
    const/4 v5, 0x7

    .line 732
    invoke-direct {v4, v1, v5}, Lv4/p;-><init>(Lv4/u0;I)V

    .line 733
    .line 734
    .line 735
    const/16 v5, 0xa

    .line 736
    .line 737
    invoke-virtual {v2, v5, v4}, Lp4/n;->c(ILp4/k;)V

    .line 738
    .line 739
    .line 740
    iget-object v2, v1, Lv4/u0;->f:Lv4/m;

    .line 741
    .line 742
    if-eqz v2, :cond_1d

    .line 743
    .line 744
    iget-object v2, v0, Lv4/v;->m:Lp4/n;

    .line 745
    .line 746
    new-instance v4, Lv4/p;

    .line 747
    .line 748
    const/16 v6, 0x8

    .line 749
    .line 750
    invoke-direct {v4, v1, v6}, Lv4/p;-><init>(Lv4/u0;I)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v2, v5, v4}, Lp4/n;->c(ILp4/k;)V

    .line 754
    .line 755
    .line 756
    :cond_1d
    iget-object v2, v3, Lv4/u0;->i:Lm5/u;

    .line 757
    .line 758
    iget-object v4, v1, Lv4/u0;->i:Lm5/u;

    .line 759
    .line 760
    if-eq v2, v4, :cond_1e

    .line 761
    .line 762
    iget-object v2, v0, Lv4/v;->i:Lj2/b;

    .line 763
    .line 764
    iget-object v4, v4, Lm5/u;->e:Ljava/lang/Object;

    .line 765
    .line 766
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 767
    .line 768
    .line 769
    check-cast v4, Lm5/t;

    .line 770
    .line 771
    iget-object v2, v0, Lv4/v;->m:Lp4/n;

    .line 772
    .line 773
    new-instance v4, Lv4/p;

    .line 774
    .line 775
    const/16 v5, 0x9

    .line 776
    .line 777
    invoke-direct {v4, v1, v5}, Lv4/p;-><init>(Lv4/u0;I)V

    .line 778
    .line 779
    .line 780
    const/4 v5, 0x2

    .line 781
    invoke-virtual {v2, v5, v4}, Lp4/n;->c(ILp4/k;)V

    .line 782
    .line 783
    .line 784
    :cond_1e
    if-nez v19, :cond_1f

    .line 785
    .line 786
    iget-object v2, v0, Lv4/v;->K:Lm4/l0;

    .line 787
    .line 788
    iget-object v4, v0, Lv4/v;->m:Lp4/n;

    .line 789
    .line 790
    new-instance v5, Lb7/e3;

    .line 791
    .line 792
    invoke-direct {v5, v2}, Lb7/e3;-><init>(Lm4/l0;)V

    .line 793
    .line 794
    .line 795
    const/16 v2, 0xe

    .line 796
    .line 797
    invoke-virtual {v4, v2, v5}, Lp4/n;->c(ILp4/k;)V

    .line 798
    .line 799
    .line 800
    :cond_1f
    if-eqz v11, :cond_20

    .line 801
    .line 802
    iget-object v2, v0, Lv4/v;->m:Lp4/n;

    .line 803
    .line 804
    new-instance v4, Lv4/p;

    .line 805
    .line 806
    const/4 v5, 0x0

    .line 807
    invoke-direct {v4, v1, v5}, Lv4/p;-><init>(Lv4/u0;I)V

    .line 808
    .line 809
    .line 810
    const/4 v5, 0x3

    .line 811
    invoke-virtual {v2, v5, v4}, Lp4/n;->c(ILp4/k;)V

    .line 812
    .line 813
    .line 814
    :cond_20
    if-nez v20, :cond_21

    .line 815
    .line 816
    if-eqz v7, :cond_22

    .line 817
    .line 818
    :cond_21
    iget-object v2, v0, Lv4/v;->m:Lp4/n;

    .line 819
    .line 820
    new-instance v4, Lv4/p;

    .line 821
    .line 822
    const/4 v5, 0x1

    .line 823
    invoke-direct {v4, v1, v5}, Lv4/p;-><init>(Lv4/u0;I)V

    .line 824
    .line 825
    .line 826
    const/4 v9, -0x1

    .line 827
    invoke-virtual {v2, v9, v4}, Lp4/n;->c(ILp4/k;)V

    .line 828
    .line 829
    .line 830
    :cond_22
    if-eqz v20, :cond_23

    .line 831
    .line 832
    iget-object v2, v0, Lv4/v;->m:Lp4/n;

    .line 833
    .line 834
    new-instance v4, Lv4/p;

    .line 835
    .line 836
    const/4 v5, 0x2

    .line 837
    invoke-direct {v4, v1, v5}, Lv4/p;-><init>(Lv4/u0;I)V

    .line 838
    .line 839
    .line 840
    const/4 v5, 0x4

    .line 841
    invoke-virtual {v2, v5, v4}, Lp4/n;->c(ILp4/k;)V

    .line 842
    .line 843
    .line 844
    :cond_23
    if-nez v7, :cond_24

    .line 845
    .line 846
    iget v2, v3, Lv4/u0;->m:I

    .line 847
    .line 848
    iget v4, v1, Lv4/u0;->m:I

    .line 849
    .line 850
    if-eq v2, v4, :cond_25

    .line 851
    .line 852
    :cond_24
    iget-object v2, v0, Lv4/v;->m:Lp4/n;

    .line 853
    .line 854
    new-instance v4, Lv4/p;

    .line 855
    .line 856
    const/4 v5, 0x3

    .line 857
    invoke-direct {v4, v1, v5}, Lv4/p;-><init>(Lv4/u0;I)V

    .line 858
    .line 859
    .line 860
    const/4 v5, 0x5

    .line 861
    invoke-virtual {v2, v5, v4}, Lp4/n;->c(ILp4/k;)V

    .line 862
    .line 863
    .line 864
    :cond_25
    iget v2, v3, Lv4/u0;->n:I

    .line 865
    .line 866
    iget v4, v1, Lv4/u0;->n:I

    .line 867
    .line 868
    if-eq v2, v4, :cond_26

    .line 869
    .line 870
    iget-object v2, v0, Lv4/v;->m:Lp4/n;

    .line 871
    .line 872
    new-instance v4, Lv4/p;

    .line 873
    .line 874
    const/4 v5, 0x4

    .line 875
    invoke-direct {v4, v1, v5}, Lv4/p;-><init>(Lv4/u0;I)V

    .line 876
    .line 877
    .line 878
    const/4 v5, 0x6

    .line 879
    invoke-virtual {v2, v5, v4}, Lp4/n;->c(ILp4/k;)V

    .line 880
    .line 881
    .line 882
    :cond_26
    invoke-virtual {v3}, Lv4/u0;->j()Z

    .line 883
    .line 884
    .line 885
    move-result v2

    .line 886
    invoke-virtual {v1}, Lv4/u0;->j()Z

    .line 887
    .line 888
    .line 889
    move-result v4

    .line 890
    if-eq v2, v4, :cond_27

    .line 891
    .line 892
    iget-object v2, v0, Lv4/v;->m:Lp4/n;

    .line 893
    .line 894
    new-instance v4, Lv4/p;

    .line 895
    .line 896
    const/4 v5, 0x5

    .line 897
    invoke-direct {v4, v1, v5}, Lv4/p;-><init>(Lv4/u0;I)V

    .line 898
    .line 899
    .line 900
    const/4 v5, 0x7

    .line 901
    invoke-virtual {v2, v5, v4}, Lp4/n;->c(ILp4/k;)V

    .line 902
    .line 903
    .line 904
    :cond_27
    iget-object v2, v3, Lv4/u0;->o:Lm4/s0;

    .line 905
    .line 906
    iget-object v4, v1, Lv4/u0;->o:Lm4/s0;

    .line 907
    .line 908
    invoke-virtual {v2, v4}, Lm4/s0;->equals(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    move-result v2

    .line 912
    if-nez v2, :cond_28

    .line 913
    .line 914
    iget-object v2, v0, Lv4/v;->m:Lp4/n;

    .line 915
    .line 916
    new-instance v4, Lv4/p;

    .line 917
    .line 918
    const/4 v5, 0x6

    .line 919
    invoke-direct {v4, v1, v5}, Lv4/p;-><init>(Lv4/u0;I)V

    .line 920
    .line 921
    .line 922
    const/16 v5, 0xc

    .line 923
    .line 924
    invoke-virtual {v2, v5, v4}, Lp4/n;->c(ILp4/k;)V

    .line 925
    .line 926
    .line 927
    :cond_28
    invoke-virtual {v0}, Lv4/v;->i2()V

    .line 928
    .line 929
    .line 930
    iget-object v2, v0, Lv4/v;->m:Lp4/n;

    .line 931
    .line 932
    invoke-virtual {v2}, Lp4/n;->b()V

    .line 933
    .line 934
    .line 935
    iget-boolean v2, v3, Lv4/u0;->p:Z

    .line 936
    .line 937
    iget-boolean v1, v1, Lv4/u0;->p:Z

    .line 938
    .line 939
    if-eq v2, v1, :cond_29

    .line 940
    .line 941
    iget-object v1, v0, Lv4/v;->n:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 942
    .line 943
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 948
    .line 949
    .line 950
    move-result v2

    .line 951
    if-eqz v2, :cond_29

    .line 952
    .line 953
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v2

    .line 957
    check-cast v2, Lv4/s;

    .line 958
    .line 959
    iget-object v2, v2, Lv4/s;->a:Lv4/v;

    .line 960
    .line 961
    invoke-virtual {v2}, Lv4/v;->l2()V

    .line 962
    .line 963
    .line 964
    goto :goto_10

    .line 965
    :cond_29
    return-void
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
.end method

.method public final l2()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lv4/v;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lv4/v;->B:Lp4/f;

    .line 6
    .line 7
    iget-object v2, p0, Lv4/v;->A:Lp4/f;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eq v0, v4, :cond_5

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    if-eq v0, v5, :cond_1

    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    if-eq v0, v5, :cond_1

    .line 18
    .line 19
    const/4 v4, 0x4

    .line 20
    if-ne v0, v4, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 33
    .line 34
    iget-boolean v0, v0, Lv4/u0;->p:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Lv4/v;->r()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    :cond_2
    iget-boolean v0, v2, Lp4/f;->a:Z

    .line 46
    .line 47
    if-ne v0, v3, :cond_3

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    iput-boolean v3, v2, Lp4/f;->a:Z

    .line 51
    .line 52
    :goto_0
    invoke-virtual {p0}, Lv4/v;->r()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean v2, v1, Lp4/f;->a:Z

    .line 57
    .line 58
    if-ne v2, v0, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    iput-boolean v0, v1, Lp4/f;->a:Z

    .line 62
    .line 63
    return-void

    .line 64
    :cond_5
    :goto_1
    iget-boolean v0, v2, Lp4/f;->a:Z

    .line 65
    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_6
    iput-boolean v3, v2, Lp4/f;->a:Z

    .line 70
    .line 71
    :goto_2
    iget-boolean v0, v1, Lp4/f;->a:Z

    .line 72
    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    :goto_3
    return-void

    .line 76
    :cond_7
    iput-boolean v3, v1, Lp4/f;->a:Z

    .line 77
    .line 78
    return-void
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

.method public final m2()V
    .locals 4

    .line 1
    iget-object v0, p0, Lv4/v;->d:Lp4/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp4/f;->d()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lv4/v;->t:Landroid/os/Looper;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eq v0, v2, :cond_2

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget v2, Lp4/c0;->a:I

    .line 35
    .line 36
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 37
    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, "Player is accessed on the wrong thread.\nCurrent thread: \'"

    .line 41
    .line 42
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, "\'\nExpected thread: \'"

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v0, "\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    .line 57
    .line 58
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-boolean v1, p0, Lv4/v;->X:Z

    .line 66
    .line 67
    if-nez v1, :cond_1

    .line 68
    .line 69
    iget-boolean v1, p0, Lv4/v;->Y:Z

    .line 70
    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 78
    .line 79
    .line 80
    :goto_0
    const-string v2, "ExoPlayerImpl"

    .line 81
    .line 82
    invoke-static {v2, v0, v1}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    const/4 v0, 0x1

    .line 86
    iput-boolean v0, p0, Lv4/v;->Y:Z

    .line 87
    .line 88
    return-void

    .line 89
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v1

    .line 95
    :cond_2
    return-void
    .line 96
    .line 97
    .line 98
.end method

.method public final o()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    iget-object v0, v0, Lv4/u0;->b:Lj5/d0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lj5/d0;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
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

.method public final q()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    iget-wide v0, v0, Lv4/u0;->r:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Lp4/c0;->c0(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
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

.method public final r()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    iget-boolean v0, v0, Lv4/u0;->l:Z

    .line 7
    .line 8
    return v0
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

.method public final r1(IZJ)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    const/4 v2, -0x1

    .line 5
    if-ne p1, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v3, 0x1

    .line 9
    if-ltz p1, :cond_1

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 v4, 0x0

    .line 14
    :goto_0
    invoke-static {v4}, Lp4/c;->c(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Lv4/v;->t0:Lv4/u0;

    .line 18
    .line 19
    iget-object v4, v4, Lv4/u0;->a:Lm4/i1;

    .line 20
    .line 21
    invoke-virtual {v4}, Lm4/i1;->p()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_2

    .line 26
    .line 27
    invoke-virtual {v4}, Lm4/i1;->o()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-lt p1, v5, :cond_2

    .line 32
    .line 33
    :goto_1
    return-void

    .line 34
    :cond_2
    iget-object v5, p0, Lv4/v;->s:Lw4/d;

    .line 35
    .line 36
    iget-boolean v6, v5, Lw4/d;->h:Z

    .line 37
    .line 38
    if-nez v6, :cond_3

    .line 39
    .line 40
    invoke-virtual {v5}, Lw4/d;->V()Lw4/a;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    iput-boolean v3, v5, Lw4/d;->h:Z

    .line 45
    .line 46
    new-instance v7, Lw4/b;

    .line 47
    .line 48
    const/4 v8, 0x6

    .line 49
    invoke-direct {v7, v8}, Lw4/b;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v6, v2, v7}, Lw4/d;->a0(Lw4/a;ILp4/k;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    iget v2, p0, Lv4/v;->F:I

    .line 56
    .line 57
    add-int/2addr v2, v3

    .line 58
    iput v2, p0, Lv4/v;->F:I

    .line 59
    .line 60
    invoke-virtual {p0}, Lv4/v;->o()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    const-string v1, "ExoPlayerImpl"

    .line 67
    .line 68
    const-string v2, "seekTo ignored because an ad is playing"

    .line 69
    .line 70
    invoke-static {v1, v2}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    new-instance v1, Lv4/z;

    .line 74
    .line 75
    iget-object v2, p0, Lv4/v;->t0:Lv4/u0;

    .line 76
    .line 77
    invoke-direct {v1, v2}, Lv4/z;-><init>(Lv4/u0;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v3}, Lv4/z;->c(I)V

    .line 81
    .line 82
    .line 83
    iget-object v2, p0, Lv4/v;->k:Lv4/q;

    .line 84
    .line 85
    iget-object v2, v2, Lv4/q;->b:Lv4/v;

    .line 86
    .line 87
    iget-object v3, v2, Lv4/v;->j:Lp4/x;

    .line 88
    .line 89
    new-instance v4, Lb5/h;

    .line 90
    .line 91
    const/16 v5, 0x1a

    .line 92
    .line 93
    invoke-direct {v4, v5, v2, v1}, Lb5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v4}, Lp4/x;->c(Ljava/lang/Runnable;)Z

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_4
    iget-object v2, p0, Lv4/v;->t0:Lv4/u0;

    .line 101
    .line 102
    iget v3, v2, Lv4/u0;->e:I

    .line 103
    .line 104
    const/4 v5, 0x3

    .line 105
    if-eq v3, v5, :cond_5

    .line 106
    .line 107
    const/4 v6, 0x4

    .line 108
    if-ne v3, v6, :cond_6

    .line 109
    .line 110
    invoke-virtual {v4}, Lm4/i1;->p()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_6

    .line 115
    .line 116
    :cond_5
    iget-object v2, p0, Lv4/v;->t0:Lv4/u0;

    .line 117
    .line 118
    const/4 v3, 0x2

    .line 119
    invoke-virtual {v2, v3}, Lv4/u0;->f(I)Lv4/u0;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    :cond_6
    invoke-virtual {p0}, Lv4/v;->G()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    invoke-virtual {p0, v4, p1, p3, p4}, Lv4/v;->R1(Lm4/i1;IJ)Landroid/util/Pair;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {p0, v2, v4, v3}, Lv4/v;->Q1(Lv4/u0;Lm4/i1;Landroid/util/Pair;)Lv4/u0;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {p3, p4}, Lp4/c0;->N(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide v8

    .line 139
    iget-object v3, p0, Lv4/v;->l:Lv4/c0;

    .line 140
    .line 141
    iget-object v3, v3, Lv4/c0;->h:Lp4/x;

    .line 142
    .line 143
    new-instance v6, Lv4/b0;

    .line 144
    .line 145
    invoke-direct {v6, v4, p1, v8, v9}, Lv4/b0;-><init>(Lm4/i1;IJ)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v5, v6}, Lp4/x;->a(ILjava/lang/Object;)Lp4/w;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, Lp4/w;->b()V

    .line 153
    .line 154
    .line 155
    const/4 v4, 0x1

    .line 156
    invoke-virtual {p0, v2}, Lv4/v;->K1(Lv4/u0;)J

    .line 157
    .line 158
    .line 159
    move-result-wide v5

    .line 160
    move-object v1, v2

    .line 161
    const/4 v2, 0x0

    .line 162
    const/4 v3, 0x1

    .line 163
    move-object v0, p0

    .line 164
    move v8, p2

    .line 165
    invoke-virtual/range {v0 .. v8}, Lv4/v;->k2(Lv4/u0;IZIJIZ)V

    .line 166
    .line 167
    .line 168
    return-void
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
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

.method public final setImageOutput(Landroidx/media3/exoplayer/image/ImageOutput;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    const/16 v1, 0xf

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, p1}, Lv4/v;->a2(IILjava/lang/Object;)V

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
.end method

.method public final u()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 5
    .line 6
    iget-object v0, v0, Lv4/u0;->a:Lm4/i1;

    .line 7
    .line 8
    invoke-virtual {v0}, Lm4/i1;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_0
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 17
    .line 18
    iget-object v1, v0, Lv4/u0;->a:Lm4/i1;

    .line 19
    .line 20
    iget-object v0, v0, Lv4/u0;->b:Lj5/d0;

    .line 21
    .line 22
    iget-object v0, v0, Lj5/d0;->a:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lm4/i1;->b(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    return v0
    .line 29
.end method

.method public final x()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv4/v;->m2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv4/v;->o()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lv4/v;->t0:Lv4/u0;

    .line 11
    .line 12
    iget-object v0, v0, Lv4/u0;->b:Lj5/d0;

    .line 13
    .line 14
    iget v0, v0, Lj5/d0;->c:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
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
