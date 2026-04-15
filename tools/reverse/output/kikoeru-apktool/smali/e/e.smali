.class public final synthetic Le/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Le/e;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Le/e;->a:I

    .line 4
    .line 5
    const-string v2, "never happen repeatMode else"

    .line 6
    .line 7
    const-class v3, Ljava/lang/String;

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    const/4 v5, 0x6

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    sget-object v9, Lub/a0;->a:Lub/a0;

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    new-instance v0, Lr4/b;

    .line 22
    .line 23
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "exoplayer_internal.db"

    .line 32
    .line 33
    invoke-direct {v0, v2, v3, v8, v7}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_0
    new-instance v0, Li9/e;

    .line 38
    .line 39
    invoke-direct {v0}, Li9/e;-><init>()V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_1
    new-instance v0, Ls4/o;

    .line 44
    .line 45
    invoke-direct {v0}, Ls4/o;-><init>()V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_2
    return-object v8

    .line 50
    :pswitch_3
    sget-object v0, Li1/f;->a:Lx0/o2;

    .line 51
    .line 52
    return-object v8

    .line 53
    :pswitch_4
    sget-object v0, Li1/d;->a:Lx0/o2;

    .line 54
    .line 55
    return-object v8

    .line 56
    :pswitch_5
    sget-object v0, Li9/n;->a:Lg1/d;

    .line 57
    .line 58
    const-string v0, "bufferForPlaybackMs"

    .line 59
    .line 60
    const/16 v15, 0x9c4

    .line 61
    .line 62
    const-string v2, "0"

    .line 63
    .line 64
    invoke-static {v0, v15, v10, v2}, Lv4/j;->a(Ljava/lang/String;IILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v3, "bufferForPlaybackAfterRebufferMs"

    .line 68
    .line 69
    const/16 v5, 0x1388

    .line 70
    .line 71
    invoke-static {v3, v5, v10, v2}, Lv4/j;->a(Ljava/lang/String;IILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string v2, "minBufferMs"

    .line 75
    .line 76
    const/16 v13, 0x7530

    .line 77
    .line 78
    invoke-static {v2, v13, v15, v0}, Lv4/j;->a(Ljava/lang/String;IILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v13, v5, v3}, Lv4/j;->a(Ljava/lang/String;IILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v0, "maxBufferMs"

    .line 85
    .line 86
    const v14, 0x186a0

    .line 87
    .line 88
    .line 89
    invoke-static {v0, v14, v13, v2}, Lv4/j;->a(Ljava/lang/String;IILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    new-instance v12, Ln5/f;

    .line 93
    .line 94
    invoke-direct {v12}, Ln5/f;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance v11, Lv4/j;

    .line 98
    .line 99
    const/16 v17, 0x1

    .line 100
    .line 101
    const/16 v16, 0x1388

    .line 102
    .line 103
    invoke-direct/range {v11 .. v17}, Lv4/j;-><init>(Ln5/f;IIIIZ)V

    .line 104
    .line 105
    .line 106
    new-instance v0, Lv4/n;

    .line 107
    .line 108
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-direct {v0, v2}, Lv4/n;-><init>(Landroid/content/Context;)V

    .line 113
    .line 114
    .line 115
    new-instance v2, Li9/h;

    .line 116
    .line 117
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const-string v5, "context"

    .line 122
    .line 123
    invoke-static {v3, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-direct {v2, v3}, Lv4/l;-><init>(Landroid/content/Context;)V

    .line 127
    .line 128
    .line 129
    iget-boolean v3, v0, Lv4/n;->t:Z

    .line 130
    .line 131
    xor-int/2addr v3, v7

    .line 132
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 133
    .line 134
    .line 135
    new-instance v3, Lj5/o;

    .line 136
    .line 137
    const/4 v12, 0x3

    .line 138
    invoke-direct {v3, v12, v2}, Lj5/o;-><init>(ILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iput-object v3, v0, Lv4/n;->c:Lxa/i;

    .line 142
    .line 143
    sget-object v2, Li9/g;->a:Lub/p;

    .line 144
    .line 145
    new-instance v2, Ljava/io/File;

    .line 146
    .line 147
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    const-string v12, "media"

    .line 156
    .line 157
    invoke-direct {v2, v3, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    const/16 v3, 0x7d0

    .line 161
    .line 162
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 167
    .line 168
    .line 169
    move-result-object v12

    .line 170
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 171
    .line 172
    invoke-static {v13}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 173
    .line 174
    .line 175
    move-result-object v13

    .line 176
    const-string v14, "mediaCacheSizeMB"

    .line 177
    .line 178
    invoke-static {v12, v14, v3, v13}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-virtual {v3}, Lhg/b;->a()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    check-cast v3, Ljava/lang/Number;

    .line 187
    .line 188
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-nez v3, :cond_0

    .line 193
    .line 194
    sget-object v2, Li9/g;->d:Lub/p;

    .line 195
    .line 196
    invoke-virtual {v2}, Lub/p;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, Lt4/e;

    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_0
    new-instance v12, Lt4/u;

    .line 204
    .line 205
    sget-object v13, Lna/q;->a:Lub/p;

    .line 206
    .line 207
    const/high16 v13, 0x100000

    .line 208
    .line 209
    mul-int v3, v3, v13

    .line 210
    .line 211
    int-to-long v13, v3

    .line 212
    invoke-direct {v12, v13, v14}, Lt4/u;-><init>(J)V

    .line 213
    .line 214
    .line 215
    new-instance v3, Lt4/y;

    .line 216
    .line 217
    new-instance v13, Li9/i;

    .line 218
    .line 219
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 220
    .line 221
    .line 222
    move-result-object v14

    .line 223
    invoke-static {v14, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    const-string v5, "exoplayer_music_cache.db"

    .line 227
    .line 228
    invoke-direct {v13, v14, v5, v8, v7}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 229
    .line 230
    .line 231
    invoke-direct {v3, v2, v12, v13}, Lt4/y;-><init>(Ljava/io/File;Lt4/g;Lr4/a;)V

    .line 232
    .line 233
    .line 234
    new-instance v2, Lr/y1;

    .line 235
    .line 236
    const/16 v5, 0x8

    .line 237
    .line 238
    invoke-direct {v2, v5, v10}, Lr/y1;-><init>(IZ)V

    .line 239
    .line 240
    .line 241
    iput-object v3, v2, Lr/y1;->b:Ljava/lang/Object;

    .line 242
    .line 243
    new-instance v5, Lt4/e;

    .line 244
    .line 245
    invoke-direct {v5}, Lt4/e;-><init>()V

    .line 246
    .line 247
    .line 248
    iput-object v3, v5, Lt4/e;->a:Lt4/b;

    .line 249
    .line 250
    sget-object v3, Li9/g;->d:Lub/p;

    .line 251
    .line 252
    invoke-virtual {v3}, Lub/p;->getValue()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    check-cast v3, Lt4/e;

    .line 257
    .line 258
    iput-object v3, v5, Lt4/e;->e:Ls4/g;

    .line 259
    .line 260
    iput-object v2, v5, Lt4/e;->c:Lr/y1;

    .line 261
    .line 262
    iput-boolean v10, v5, Lt4/e;->d:Z

    .line 263
    .line 264
    iput v6, v5, Lt4/e;->f:I

    .line 265
    .line 266
    move-object v2, v5

    .line 267
    :goto_0
    new-instance v3, Lj5/q;

    .line 268
    .line 269
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-direct {v3, v5}, Lj5/q;-><init>(Lcom/cnl/kikoeru/MainApplication;)V

    .line 274
    .line 275
    .line 276
    iput-object v2, v3, Lj5/q;->b:Ls4/g;

    .line 277
    .line 278
    iget-object v5, v3, Lj5/q;->a:Ld0/y;

    .line 279
    .line 280
    iget-object v8, v5, Ld0/y;->e:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v8, Ls4/g;

    .line 283
    .line 284
    if-eq v2, v8, :cond_1

    .line 285
    .line 286
    iput-object v2, v5, Ld0/y;->e:Ljava/lang/Object;

    .line 287
    .line 288
    iget-object v2, v5, Ld0/y;->c:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v2, Ljava/util/HashMap;

    .line 291
    .line 292
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 293
    .line 294
    .line 295
    iget-object v2, v5, Ld0/y;->d:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v2, Ljava/util/HashMap;

    .line 298
    .line 299
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 300
    .line 301
    .line 302
    :cond_1
    iget-boolean v2, v0, Lv4/n;->t:Z

    .line 303
    .line 304
    xor-int/2addr v2, v7

    .line 305
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 306
    .line 307
    .line 308
    new-instance v2, Lj5/o;

    .line 309
    .line 310
    invoke-direct {v2, v6, v3}, Lj5/o;-><init>(ILjava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    iput-object v2, v0, Lv4/n;->d:Lxa/i;

    .line 314
    .line 315
    iget-boolean v2, v0, Lv4/n;->t:Z

    .line 316
    .line 317
    xor-int/2addr v2, v7

    .line 318
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 319
    .line 320
    .line 321
    new-instance v2, Lj5/o;

    .line 322
    .line 323
    invoke-direct {v2, v7, v11}, Lj5/o;-><init>(ILjava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    iput-object v2, v0, Lv4/n;->f:Lxa/i;

    .line 327
    .line 328
    iget-boolean v2, v0, Lv4/n;->t:Z

    .line 329
    .line 330
    xor-int/2addr v2, v7

    .line 331
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 332
    .line 333
    .line 334
    iput-boolean v7, v0, Lv4/n;->t:Z

    .line 335
    .line 336
    sget v2, Lp4/c0;->a:I

    .line 337
    .line 338
    new-instance v2, Lv4/v;

    .line 339
    .line 340
    invoke-direct {v2, v0}, Lv4/v;-><init>(Lv4/n;)V

    .line 341
    .line 342
    .line 343
    new-instance v0, Li9/l;

    .line 344
    .line 345
    invoke-direct {v0, v2}, Li9/l;-><init>(Lv4/v;)V

    .line 346
    .line 347
    .line 348
    iget-object v3, v2, Lv4/v;->m:Lp4/n;

    .line 349
    .line 350
    invoke-virtual {v3, v0}, Lp4/n;->a(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    new-instance v0, Li9/m;

    .line 354
    .line 355
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v3, v0}, Lp4/n;->a(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    sget-object v0, Lh9/d;->a:Lx0/e1;

    .line 362
    .line 363
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    if-nez v0, :cond_3

    .line 368
    .line 369
    sget-object v0, Li9/o;->a:Li9/o;

    .line 370
    .line 371
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    invoke-static {}, Li9/o;->b()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    if-nez v0, :cond_2

    .line 383
    .line 384
    goto :goto_2

    .line 385
    :cond_2
    :try_start_0
    invoke-static {v2}, Li9/o;->c(Lv4/v;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 386
    .line 387
    .line 388
    goto :goto_1

    .line 389
    :catchall_0
    move-exception v0

    .line 390
    invoke-static {v0}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 391
    .line 392
    .line 393
    move-result-object v9

    .line 394
    :goto_1
    invoke-static {v9}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    if-eqz v0, :cond_3

    .line 399
    .line 400
    sget-object v0, Li9/o;->a:Li9/o;

    .line 401
    .line 402
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    sget-object v0, Li9/o;->c:Lhg/b;

    .line 406
    .line 407
    sget-object v3, Li9/o;->b:[Lpc/u;

    .line 408
    .line 409
    aget-object v5, v3, v10

    .line 410
    .line 411
    invoke-virtual {v0, v4, v5}, Lhg/b;->e(Ljava/lang/Object;Lpc/u;)V

    .line 412
    .line 413
    .line 414
    sget-object v0, Li9/o;->d:Lhg/b;

    .line 415
    .line 416
    aget-object v5, v3, v7

    .line 417
    .line 418
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object v7

    .line 422
    invoke-virtual {v0, v7, v5}, Lhg/b;->e(Ljava/lang/Object;Lpc/u;)V

    .line 423
    .line 424
    .line 425
    sget-object v0, Li9/o;->e:Lhg/b;

    .line 426
    .line 427
    aget-object v3, v3, v6

    .line 428
    .line 429
    invoke-virtual {v0, v4, v3}, Lhg/b;->e(Ljava/lang/Object;Lpc/u;)V

    .line 430
    .line 431
    .line 432
    :cond_3
    :goto_2
    return-object v2

    .line 433
    :pswitch_6
    sget-object v0, Li9/g;->a:Lub/p;

    .line 434
    .line 435
    new-instance v8, Landroidx/media3/exoplayer/offline/m;

    .line 436
    .line 437
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 438
    .line 439
    .line 440
    move-result-object v9

    .line 441
    sget-object v0, Li9/g;->b:Lub/p;

    .line 442
    .line 443
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    move-object v10, v0

    .line 448
    check-cast v10, Lr4/b;

    .line 449
    .line 450
    sget-object v0, Li9/g;->c:Lub/p;

    .line 451
    .line 452
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    move-object v11, v0

    .line 457
    check-cast v11, Lt4/y;

    .line 458
    .line 459
    sget-object v0, Li9/g;->a:Lub/p;

    .line 460
    .line 461
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    move-object v12, v0

    .line 466
    check-cast v12, Li9/e;

    .line 467
    .line 468
    invoke-static {v5}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 469
    .line 470
    .line 471
    move-result-object v13

    .line 472
    invoke-direct/range {v8 .. v13}, Landroidx/media3/exoplayer/offline/m;-><init>(Lcom/cnl/kikoeru/MainApplication;Lr4/b;Lt4/y;Li9/e;Ljava/util/concurrent/ExecutorService;)V

    .line 473
    .line 474
    .line 475
    :try_start_1
    const-class v0, Landroidx/media3/exoplayer/offline/m;

    .line 476
    .line 477
    const-string v2, "listeners"

    .line 478
    .line 479
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    new-instance v2, Li9/b;

    .line 484
    .line 485
    invoke-direct {v2}, Li9/b;-><init>()V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v0, v8, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 492
    .line 493
    .line 494
    goto :goto_3

    .line 495
    :catch_0
    move-exception v0

    .line 496
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 497
    .line 498
    .line 499
    :goto_3
    return-object v8

    .line 500
    :pswitch_7
    new-instance v0, Lug/x;

    .line 501
    .line 502
    invoke-direct {v0}, Lug/x;-><init>()V

    .line 503
    .line 504
    .line 505
    return-object v0

    .line 506
    :pswitch_8
    new-instance v0, Li4/d;

    .line 507
    .line 508
    invoke-direct {v0, v10}, Li4/d;-><init>(I)V

    .line 509
    .line 510
    .line 511
    new-instance v2, Lg1/d;

    .line 512
    .line 513
    const/4 v3, 0x4

    .line 514
    invoke-direct {v2, v3}, Lg1/d;-><init>(I)V

    .line 515
    .line 516
    .line 517
    const-class v3, Lh7/b;

    .line 518
    .line 519
    sget-object v4, Ljc/z;->a:Ljc/a0;

    .line 520
    .line 521
    invoke-virtual {v4, v3}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-virtual {v0, v3, v2}, Li4/d;->a(Lpc/c;Lic/k;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0}, Li4/d;->b()Li4/c;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    return-object v0

    .line 533
    :pswitch_9
    new-instance v0, Landroidx/lifecycle/q0;

    .line 534
    .line 535
    invoke-direct {v0}, Landroidx/lifecycle/q0;-><init>()V

    .line 536
    .line 537
    .line 538
    return-object v0

    .line 539
    :pswitch_a
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 540
    .line 541
    const-string v2, "MANUFACTURER"

    .line 542
    .line 543
    invoke-static {v0, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    const-string v2, "huawei"

    .line 547
    .line 548
    invoke-static {v0, v2, v7}, Lef/n;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    return-object v0

    .line 557
    :pswitch_b
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-static {v3}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    const-string v3, "username"

    .line 566
    .line 567
    invoke-static {v3, v4, v0, v10, v2}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    return-object v0

    .line 572
    :pswitch_c
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-static {v3}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    const-string v3, "server"

    .line 581
    .line 582
    const-string v4, "https://api.asmr-300.com"

    .line 583
    .line 584
    invoke-static {v3, v4, v0, v10, v2}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    return-object v0

    .line 589
    :pswitch_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 590
    .line 591
    const-string v2, "CompositionLocal LocalLifecycleOwner not present"

    .line 592
    .line 593
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    throw v0

    .line 597
    :pswitch_e
    sget-object v0, Lg1/i;->a:Lx0/o2;

    .line 598
    .line 599
    return-object v8

    .line 600
    :pswitch_f
    new-instance v0, Lg1/e;

    .line 601
    .line 602
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 603
    .line 604
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 605
    .line 606
    .line 607
    invoke-direct {v0, v2}, Lg1/e;-><init>(Ljava/util/Map;)V

    .line 608
    .line 609
    .line 610
    return-object v0

    .line 611
    :pswitch_10
    sget-object v0, Lmc/d;->a:Lmc/a;

    .line 612
    .line 613
    sget-object v0, Lmc/d;->a:Lmc/a;

    .line 614
    .line 615
    invoke-virtual {v0}, Lmc/a;->d()Ljava/util/Random;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    const/high16 v2, 0x7fff0000

    .line 620
    .line 621
    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    .line 622
    .line 623
    .line 624
    move-result v0

    .line 625
    const/high16 v2, 0x10000

    .line 626
    .line 627
    add-int/2addr v0, v2

    .line 628
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    return-object v0

    .line 633
    :pswitch_11
    sget-object v0, Lfa/v;->a:Lfa/v;

    .line 634
    .line 635
    sget-object v0, Lfa/v;->e:Lx0/e1;

    .line 636
    .line 637
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 638
    .line 639
    invoke-virtual {v0, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    return-object v9

    .line 643
    :pswitch_12
    sget-object v0, Lfa/v;->a:Lfa/v;

    .line 644
    .line 645
    sget-object v0, Lfa/v;->h:Lx0/e1;

    .line 646
    .line 647
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 648
    .line 649
    invoke-virtual {v0, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    return-object v9

    .line 653
    :pswitch_13
    sget-object v0, Lj9/d;->a:Lj9/d;

    .line 654
    .line 655
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    sget-boolean v0, Lj9/d;->e:Z

    .line 659
    .line 660
    if-eqz v0, :cond_4

    .line 661
    .line 662
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-static {v0}, Lj9/d;->d(Lcom/cnl/kikoeru/MainApplication;)V

    .line 667
    .line 668
    .line 669
    goto :goto_4

    .line 670
    :cond_4
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-static {v0}, Lj9/d;->c(Landroid/content/Context;)Z

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    if-eqz v0, :cond_5

    .line 679
    .line 680
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    invoke-static {v0}, Lj9/d;->b(Lcom/cnl/kikoeru/MainApplication;)V

    .line 685
    .line 686
    .line 687
    :cond_5
    :goto_4
    return-object v9

    .line 688
    :pswitch_14
    sget-object v0, Lfa/v;->a:Lfa/v;

    .line 689
    .line 690
    sget-object v0, Lfa/v;->h:Lx0/e1;

    .line 691
    .line 692
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 693
    .line 694
    invoke-virtual {v0, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    return-object v9

    .line 698
    :pswitch_15
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    check-cast v0, Landroidx/lifecycle/q;

    .line 703
    .line 704
    invoke-virtual {v0}, Landroidx/lifecycle/q;->i1()Z

    .line 705
    .line 706
    .line 707
    move-result v0

    .line 708
    if-eqz v0, :cond_6

    .line 709
    .line 710
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    check-cast v0, Landroidx/lifecycle/q;

    .line 715
    .line 716
    invoke-virtual {v0}, Landroidx/lifecycle/q;->t1()V

    .line 717
    .line 718
    .line 719
    goto :goto_5

    .line 720
    :cond_6
    const v0, 0x7f0c0158

    .line 721
    .line 722
    .line 723
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    const/4 v6, 0x0

    .line 728
    const/16 v7, 0x1ff

    .line 729
    .line 730
    const-wide/16 v3, 0x0

    .line 731
    .line 732
    const/4 v5, 0x0

    .line 733
    invoke-static/range {v2 .. v7}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 734
    .line 735
    .line 736
    :goto_5
    return-object v9

    .line 737
    :pswitch_16
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    check-cast v0, Landroidx/lifecycle/q;

    .line 742
    .line 743
    invoke-virtual {v0}, Landroidx/lifecycle/q;->o1()Z

    .line 744
    .line 745
    .line 746
    move-result v0

    .line 747
    xor-int/2addr v0, v7

    .line 748
    invoke-static {v0}, Lh9/d;->f(Z)V

    .line 749
    .line 750
    .line 751
    return-object v9

    .line 752
    :pswitch_17
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    check-cast v0, Landroidx/lifecycle/q;

    .line 757
    .line 758
    invoke-virtual {v0}, Landroidx/lifecycle/q;->j1()Z

    .line 759
    .line 760
    .line 761
    move-result v0

    .line 762
    if-eqz v0, :cond_7

    .line 763
    .line 764
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    check-cast v0, Landroidx/lifecycle/q;

    .line 769
    .line 770
    invoke-virtual {v0}, Landroidx/lifecycle/q;->v1()V

    .line 771
    .line 772
    .line 773
    goto :goto_6

    .line 774
    :cond_7
    const v0, 0x7f0c0159

    .line 775
    .line 776
    .line 777
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v2

    .line 781
    const/4 v6, 0x0

    .line 782
    const/16 v7, 0x1ff

    .line 783
    .line 784
    const-wide/16 v3, 0x0

    .line 785
    .line 786
    const/4 v5, 0x0

    .line 787
    invoke-static/range {v2 .. v7}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 788
    .line 789
    .line 790
    :goto_6
    return-object v9

    .line 791
    :pswitch_18
    sget-object v0, Lh9/d;->e:Lx0/e1;

    .line 792
    .line 793
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    check-cast v0, Ljava/lang/Number;

    .line 798
    .line 799
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 800
    .line 801
    .line 802
    move-result v0

    .line 803
    if-eqz v0, :cond_9

    .line 804
    .line 805
    if-eq v0, v7, :cond_a

    .line 806
    .line 807
    if-ne v0, v6, :cond_8

    .line 808
    .line 809
    const/4 v6, 0x0

    .line 810
    goto :goto_7

    .line 811
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 812
    .line 813
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    throw v0

    .line 817
    :cond_9
    const/4 v6, 0x1

    .line 818
    :cond_a
    :goto_7
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    check-cast v0, Lv4/v;

    .line 823
    .line 824
    invoke-virtual {v0, v6}, Lv4/v;->e2(I)V

    .line 825
    .line 826
    .line 827
    return-object v9

    .line 828
    :pswitch_19
    sget-object v0, Lh9/d;->e:Lx0/e1;

    .line 829
    .line 830
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    check-cast v0, Ljava/lang/Number;

    .line 835
    .line 836
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 837
    .line 838
    .line 839
    move-result v0

    .line 840
    const/high16 v4, 0x40000000    # 2.0f

    .line 841
    .line 842
    if-eqz v0, :cond_f

    .line 843
    .line 844
    const/high16 v11, 0x40c00000    # 6.0f

    .line 845
    .line 846
    const/high16 v12, 0x41200000    # 10.0f

    .line 847
    .line 848
    const/high16 v13, 0x40e00000    # 7.0f

    .line 849
    .line 850
    const/high16 v14, 0x40800000    # 4.0f

    .line 851
    .line 852
    const/high16 v15, -0x3f800000    # -4.0f

    .line 853
    .line 854
    const/high16 v8, 0x40400000    # 3.0f

    .line 855
    .line 856
    const/high16 v9, 0x40a00000    # 5.0f

    .line 857
    .line 858
    const/high16 v3, -0x3fc00000    # -3.0f

    .line 859
    .line 860
    if-eq v0, v7, :cond_d

    .line 861
    .line 862
    if-ne v0, v6, :cond_c

    .line 863
    .line 864
    sget-object v0, Ln7/e;->i:Lw1/f;

    .line 865
    .line 866
    if-eqz v0, :cond_b

    .line 867
    .line 868
    goto/16 :goto_8

    .line 869
    .line 870
    :cond_b
    new-instance v20, Lw1/e;

    .line 871
    .line 872
    const/16 v28, 0x0

    .line 873
    .line 874
    const/16 v30, 0x60

    .line 875
    .line 876
    const-string v21, "Filled.Repeat"

    .line 877
    .line 878
    const/high16 v22, 0x41c00000    # 24.0f

    .line 879
    .line 880
    const/high16 v23, 0x41c00000    # 24.0f

    .line 881
    .line 882
    const/high16 v24, 0x41c00000    # 24.0f

    .line 883
    .line 884
    const/high16 v25, 0x41c00000    # 24.0f

    .line 885
    .line 886
    const-wide/16 v26, 0x0

    .line 887
    .line 888
    const/16 v29, 0x0

    .line 889
    .line 890
    invoke-direct/range {v20 .. v30}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 891
    .line 892
    .line 893
    move-object/from16 v0, v20

    .line 894
    .line 895
    sget v2, Lw1/g0;->a:I

    .line 896
    .line 897
    new-instance v2, Lq1/n0;

    .line 898
    .line 899
    sget-wide v6, Lq1/q;->b:J

    .line 900
    .line 901
    invoke-direct {v2, v6, v7}, Lq1/n0;-><init>(J)V

    .line 902
    .line 903
    .line 904
    new-instance v6, Lhd/q0;

    .line 905
    .line 906
    invoke-direct {v6, v10, v5}, Lhd/q0;-><init>(BI)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v6, v13, v13}, Lhd/q0;->u(FF)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v6, v12}, Lhd/q0;->r(F)V

    .line 913
    .line 914
    .line 915
    invoke-virtual {v6, v8}, Lhd/q0;->z(F)V

    .line 916
    .line 917
    .line 918
    invoke-virtual {v6, v14, v15}, Lhd/q0;->t(FF)V

    .line 919
    .line 920
    .line 921
    invoke-virtual {v6, v15, v15}, Lhd/q0;->t(FF)V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v6, v8}, Lhd/q0;->z(F)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v6, v9, v9}, Lhd/q0;->s(FF)V

    .line 928
    .line 929
    .line 930
    invoke-virtual {v6, v11}, Lhd/q0;->z(F)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {v6, v4}, Lhd/q0;->r(F)V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v6, v13, v13}, Lhd/q0;->s(FF)V

    .line 937
    .line 938
    .line 939
    invoke-virtual {v6}, Lhd/q0;->l()V

    .line 940
    .line 941
    .line 942
    const/high16 v4, 0x41880000    # 17.0f

    .line 943
    .line 944
    invoke-virtual {v6, v4, v4}, Lhd/q0;->u(FF)V

    .line 945
    .line 946
    .line 947
    invoke-virtual {v6, v13, v4}, Lhd/q0;->s(FF)V

    .line 948
    .line 949
    .line 950
    invoke-virtual {v6, v3}, Lhd/q0;->z(F)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v6, v15, v14}, Lhd/q0;->t(FF)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v6, v14, v14}, Lhd/q0;->t(FF)V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v6, v3}, Lhd/q0;->z(F)V

    .line 960
    .line 961
    .line 962
    const/high16 v3, 0x41400000    # 12.0f

    .line 963
    .line 964
    invoke-virtual {v6, v3}, Lhd/q0;->r(F)V

    .line 965
    .line 966
    .line 967
    const/high16 v3, -0x3f400000    # -6.0f

    .line 968
    .line 969
    invoke-virtual {v6, v3}, Lhd/q0;->z(F)V

    .line 970
    .line 971
    .line 972
    const/high16 v3, -0x40000000    # -2.0f

    .line 973
    .line 974
    invoke-virtual {v6, v3}, Lhd/q0;->r(F)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v6, v14}, Lhd/q0;->z(F)V

    .line 978
    .line 979
    .line 980
    invoke-virtual {v6}, Lhd/q0;->l()V

    .line 981
    .line 982
    .line 983
    iget-object v3, v6, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 984
    .line 985
    invoke-static {v0, v3, v10, v2}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v0}, Lw1/e;->b()Lw1/f;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    sput-object v0, Ln7/e;->i:Lw1/f;

    .line 993
    .line 994
    goto/16 :goto_8

    .line 995
    .line 996
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 997
    .line 998
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    throw v0

    .line 1002
    :cond_d
    sget-object v0, Lu3/x0;->l:Lw1/f;

    .line 1003
    .line 1004
    if-eqz v0, :cond_e

    .line 1005
    .line 1006
    goto/16 :goto_8

    .line 1007
    .line 1008
    :cond_e
    new-instance v20, Lw1/e;

    .line 1009
    .line 1010
    const/16 v28, 0x0

    .line 1011
    .line 1012
    const/16 v30, 0x60

    .line 1013
    .line 1014
    const-string v21, "Filled.RepeatOne"

    .line 1015
    .line 1016
    const/high16 v22, 0x41c00000    # 24.0f

    .line 1017
    .line 1018
    const/high16 v23, 0x41c00000    # 24.0f

    .line 1019
    .line 1020
    const/high16 v24, 0x41c00000    # 24.0f

    .line 1021
    .line 1022
    const/high16 v25, 0x41c00000    # 24.0f

    .line 1023
    .line 1024
    const-wide/16 v26, 0x0

    .line 1025
    .line 1026
    const/16 v29, 0x0

    .line 1027
    .line 1028
    invoke-direct/range {v20 .. v30}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 1029
    .line 1030
    .line 1031
    move-object/from16 v0, v20

    .line 1032
    .line 1033
    sget v2, Lw1/g0;->a:I

    .line 1034
    .line 1035
    new-instance v2, Lq1/n0;

    .line 1036
    .line 1037
    sget-wide v6, Lq1/q;->b:J

    .line 1038
    .line 1039
    invoke-direct {v2, v6, v7}, Lq1/n0;-><init>(J)V

    .line 1040
    .line 1041
    .line 1042
    new-instance v6, Lhd/q0;

    .line 1043
    .line 1044
    invoke-direct {v6, v10, v5}, Lhd/q0;-><init>(BI)V

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v6, v13, v13}, Lhd/q0;->u(FF)V

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v6, v12}, Lhd/q0;->r(F)V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v6, v8}, Lhd/q0;->z(F)V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v6, v14, v15}, Lhd/q0;->t(FF)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v6, v15, v15}, Lhd/q0;->t(FF)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v6, v8}, Lhd/q0;->z(F)V

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v6, v9, v9}, Lhd/q0;->s(FF)V

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v6, v11}, Lhd/q0;->z(F)V

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v6, v4}, Lhd/q0;->r(F)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v6, v13, v13}, Lhd/q0;->s(FF)V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v6}, Lhd/q0;->l()V

    .line 1078
    .line 1079
    .line 1080
    const/high16 v4, 0x41880000    # 17.0f

    .line 1081
    .line 1082
    invoke-virtual {v6, v4, v4}, Lhd/q0;->u(FF)V

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v6, v13, v4}, Lhd/q0;->s(FF)V

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v6, v3}, Lhd/q0;->z(F)V

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v6, v15, v14}, Lhd/q0;->t(FF)V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v6, v14, v14}, Lhd/q0;->t(FF)V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v6, v3}, Lhd/q0;->z(F)V

    .line 1098
    .line 1099
    .line 1100
    const/high16 v3, 0x41400000    # 12.0f

    .line 1101
    .line 1102
    invoke-virtual {v6, v3}, Lhd/q0;->r(F)V

    .line 1103
    .line 1104
    .line 1105
    const/high16 v3, -0x3f400000    # -6.0f

    .line 1106
    .line 1107
    invoke-virtual {v6, v3}, Lhd/q0;->z(F)V

    .line 1108
    .line 1109
    .line 1110
    const/high16 v3, -0x40000000    # -2.0f

    .line 1111
    .line 1112
    invoke-virtual {v6, v3}, Lhd/q0;->r(F)V

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v6, v14}, Lhd/q0;->z(F)V

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v6}, Lhd/q0;->l()V

    .line 1119
    .line 1120
    .line 1121
    const/high16 v4, 0x41500000    # 13.0f

    .line 1122
    .line 1123
    const/high16 v5, 0x41700000    # 15.0f

    .line 1124
    .line 1125
    invoke-virtual {v6, v4, v5}, Lhd/q0;->u(FF)V

    .line 1126
    .line 1127
    .line 1128
    const/high16 v7, 0x41100000    # 9.0f

    .line 1129
    .line 1130
    invoke-virtual {v6, v4, v7}, Lhd/q0;->s(FF)V

    .line 1131
    .line 1132
    .line 1133
    const/high16 v7, -0x40800000    # -1.0f

    .line 1134
    .line 1135
    invoke-virtual {v6, v7}, Lhd/q0;->r(F)V

    .line 1136
    .line 1137
    .line 1138
    const/high16 v7, 0x3f800000    # 1.0f

    .line 1139
    .line 1140
    invoke-virtual {v6, v3, v7}, Lhd/q0;->t(FF)V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v6, v7}, Lhd/q0;->z(F)V

    .line 1144
    .line 1145
    .line 1146
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 1147
    .line 1148
    invoke-virtual {v6, v3}, Lhd/q0;->r(F)V

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v6, v14}, Lhd/q0;->z(F)V

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v6, v4, v5}, Lhd/q0;->s(FF)V

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v6}, Lhd/q0;->l()V

    .line 1158
    .line 1159
    .line 1160
    iget-object v3, v6, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 1161
    .line 1162
    invoke-static {v0, v3, v10, v2}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v0}, Lw1/e;->b()Lw1/f;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v0

    .line 1169
    sput-object v0, Lu3/x0;->l:Lw1/f;

    .line 1170
    .line 1171
    goto :goto_8

    .line 1172
    :cond_f
    sget-object v0, Lnd/h;->b:Lw1/f;

    .line 1173
    .line 1174
    if-eqz v0, :cond_10

    .line 1175
    .line 1176
    goto :goto_8

    .line 1177
    :cond_10
    new-instance v17, Lw1/e;

    .line 1178
    .line 1179
    const/16 v25, 0x0

    .line 1180
    .line 1181
    const/16 v27, 0x60

    .line 1182
    .line 1183
    const-string v18, "Filled.Dehaze"

    .line 1184
    .line 1185
    const/high16 v19, 0x41c00000    # 24.0f

    .line 1186
    .line 1187
    const/high16 v20, 0x41c00000    # 24.0f

    .line 1188
    .line 1189
    const/high16 v21, 0x41c00000    # 24.0f

    .line 1190
    .line 1191
    const/high16 v22, 0x41c00000    # 24.0f

    .line 1192
    .line 1193
    const-wide/16 v23, 0x0

    .line 1194
    .line 1195
    const/16 v26, 0x0

    .line 1196
    .line 1197
    invoke-direct/range {v17 .. v27}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 1198
    .line 1199
    .line 1200
    move-object/from16 v0, v17

    .line 1201
    .line 1202
    sget v2, Lw1/g0;->a:I

    .line 1203
    .line 1204
    new-instance v2, Lq1/n0;

    .line 1205
    .line 1206
    sget-wide v6, Lq1/q;->b:J

    .line 1207
    .line 1208
    invoke-direct {v2, v6, v7}, Lq1/n0;-><init>(J)V

    .line 1209
    .line 1210
    .line 1211
    new-instance v3, Lhd/q0;

    .line 1212
    .line 1213
    invoke-direct {v3, v10, v5}, Lhd/q0;-><init>(BI)V

    .line 1214
    .line 1215
    .line 1216
    const/high16 v5, 0x41780000    # 15.5f

    .line 1217
    .line 1218
    invoke-virtual {v3, v4, v5}, Lhd/q0;->u(FF)V

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v3, v4}, Lhd/q0;->z(F)V

    .line 1222
    .line 1223
    .line 1224
    const/high16 v6, 0x41a00000    # 20.0f

    .line 1225
    .line 1226
    invoke-virtual {v3, v6}, Lhd/q0;->r(F)V

    .line 1227
    .line 1228
    .line 1229
    const/high16 v7, -0x40000000    # -2.0f

    .line 1230
    .line 1231
    invoke-virtual {v3, v7}, Lhd/q0;->z(F)V

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v3, v4, v5}, Lhd/q0;->s(FF)V

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual {v3}, Lhd/q0;->l()V

    .line 1238
    .line 1239
    .line 1240
    const/high16 v5, 0x41280000    # 10.5f

    .line 1241
    .line 1242
    invoke-virtual {v3, v4, v5}, Lhd/q0;->u(FF)V

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v3, v4}, Lhd/q0;->z(F)V

    .line 1246
    .line 1247
    .line 1248
    invoke-virtual {v3, v6}, Lhd/q0;->r(F)V

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {v3, v7}, Lhd/q0;->z(F)V

    .line 1252
    .line 1253
    .line 1254
    invoke-virtual {v3, v4, v5}, Lhd/q0;->s(FF)V

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v3}, Lhd/q0;->l()V

    .line 1258
    .line 1259
    .line 1260
    const/high16 v5, 0x40b00000    # 5.5f

    .line 1261
    .line 1262
    invoke-virtual {v3, v4, v5}, Lhd/q0;->u(FF)V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v3, v4}, Lhd/q0;->z(F)V

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v3, v6}, Lhd/q0;->r(F)V

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v3, v7}, Lhd/q0;->z(F)V

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v3, v4, v5}, Lhd/q0;->s(FF)V

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v3}, Lhd/q0;->l()V

    .line 1278
    .line 1279
    .line 1280
    iget-object v3, v3, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 1281
    .line 1282
    invoke-static {v0, v3, v10, v2}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {v0}, Lw1/e;->b()Lw1/f;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v0

    .line 1289
    sput-object v0, Lnd/h;->b:Lw1/f;

    .line 1290
    .line 1291
    :goto_8
    return-object v0

    .line 1292
    :pswitch_1a
    sget-object v0, Lh9/d;->d:Lx0/e1;

    .line 1293
    .line 1294
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v0

    .line 1298
    check-cast v0, Ljava/lang/Boolean;

    .line 1299
    .line 1300
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1301
    .line 1302
    .line 1303
    move-result v0

    .line 1304
    if-eqz v0, :cond_11

    .line 1305
    .line 1306
    invoke-static {}, Ln7/e;->u()Lw1/f;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v0

    .line 1310
    goto :goto_9

    .line 1311
    :cond_11
    invoke-static {}, Lnh/a;->r()Lw1/f;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    :goto_9
    return-object v0

    .line 1316
    :pswitch_1b
    sget-object v0, Le/g;->a:Lx0/z;

    .line 1317
    .line 1318
    return-object v8

    .line 1319
    :pswitch_1c
    sget-object v0, Le/f;->a:Lx0/z;

    .line 1320
    .line 1321
    return-object v8

    .line 1322
    nop

    .line 1323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
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
