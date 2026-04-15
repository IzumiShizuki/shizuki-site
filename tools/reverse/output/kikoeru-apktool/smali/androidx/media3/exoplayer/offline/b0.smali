.class public abstract Landroidx/media3/exoplayer/offline/b0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroidx/media3/exoplayer/offline/s;


# instance fields
.field public final a:Ls4/m;

.field public final b:Ln5/q;

.field public final c:Ljava/util/ArrayList;

.field public final d:Lt4/e;

.field public final e:Lt4/b;

.field public final f:Lt4/j;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:J

.field public final i:Ljava/util/ArrayList;

.field public volatile j:Z


# direct methods
.method public constructor <init>(Lm4/i0;Ln5/q;Lt4/e;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lm4/i0;->b:Lm4/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lm4/i0;->b:Lm4/d0;

    .line 10
    .line 11
    iget-object v0, p1, Lm4/d0;->a:Landroid/net/Uri;

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/media3/exoplayer/offline/b0;->d(Landroid/net/Uri;)Ls4/m;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Landroidx/media3/exoplayer/offline/b0;->a:Ls4/m;

    .line 18
    .line 19
    iput-object p2, p0, Landroidx/media3/exoplayer/offline/b0;->b:Ln5/q;

    .line 20
    .line 21
    new-instance p2, Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object p1, p1, Lm4/d0;->e:Ljava/util/List;

    .line 24
    .line 25
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Landroidx/media3/exoplayer/offline/b0;->c:Ljava/util/ArrayList;

    .line 29
    .line 30
    iput-object p3, p0, Landroidx/media3/exoplayer/offline/b0;->d:Lt4/e;

    .line 31
    .line 32
    iput-object p4, p0, Landroidx/media3/exoplayer/offline/b0;->g:Ljava/util/concurrent/Executor;

    .line 33
    .line 34
    iget-object p1, p3, Lt4/e;->a:Lt4/b;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/b0;->e:Lt4/b;

    .line 40
    .line 41
    sget-object p1, Lt4/j;->a:Lt4/j;

    .line 42
    .line 43
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/b0;->f:Lt4/j;

    .line 44
    .line 45
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 51
    .line 52
    const-wide/16 p1, 0x4e20

    .line 53
    .line 54
    invoke-static {p1, p2}, Lp4/c0;->N(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide p1

    .line 58
    iput-wide p1, p0, Landroidx/media3/exoplayer/offline/b0;->h:J

    .line 59
    .line 60
    return-void
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

.method public static d(Landroid/net/Uri;)Ls4/m;
    .locals 13

    .line 1
    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "The uri must be set."

    .line 4
    .line 5
    invoke-static {p0, v0}, Lp4/c;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ls4/m;

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    const/4 v5, 0x0

    .line 14
    const-wide/16 v7, 0x0

    .line 15
    .line 16
    const-wide/16 v9, -0x1

    .line 17
    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v12, 0x1

    .line 20
    move-object v1, p0

    .line 21
    invoke-direct/range {v0 .. v12}, Ls4/m;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    return-object v0
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

.method public static f(Ljava/util/List;Lt4/j;J)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-ge v2, v4, :cond_3

    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Landroidx/media3/exoplayer/offline/z;

    .line 21
    .line 22
    iget-object v5, v4, Landroidx/media3/exoplayer/offline/z;->b:Ls4/m;

    .line 23
    .line 24
    move-object/from16 v6, p1

    .line 25
    .line 26
    invoke-virtual {v6, v5}, Lt4/j;->a(Ls4/m;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    check-cast v8, Ljava/lang/Integer;

    .line 35
    .line 36
    if-nez v8, :cond_0

    .line 37
    .line 38
    const/4 v9, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    check-cast v9, Landroidx/media3/exoplayer/offline/z;

    .line 49
    .line 50
    :goto_1
    if-eqz v9, :cond_2

    .line 51
    .line 52
    iget-wide v10, v9, Landroidx/media3/exoplayer/offline/z;->a:J

    .line 53
    .line 54
    iget-object v9, v9, Landroidx/media3/exoplayer/offline/z;->b:Ls4/m;

    .line 55
    .line 56
    iget-wide v12, v4, Landroidx/media3/exoplayer/offline/z;->a:J

    .line 57
    .line 58
    add-long v14, v10, p2

    .line 59
    .line 60
    cmp-long v16, v12, v14

    .line 61
    .line 62
    if-gtz v16, :cond_2

    .line 63
    .line 64
    iget-object v12, v9, Ls4/m;->a:Landroid/net/Uri;

    .line 65
    .line 66
    iget-wide v13, v9, Ls4/m;->g:J

    .line 67
    .line 68
    iget-object v15, v5, Ls4/m;->a:Landroid/net/Uri;

    .line 69
    .line 70
    invoke-virtual {v12, v15}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    if-eqz v12, :cond_2

    .line 75
    .line 76
    const-wide/16 v15, -0x1

    .line 77
    .line 78
    cmp-long v12, v13, v15

    .line 79
    .line 80
    if-eqz v12, :cond_2

    .line 81
    .line 82
    move-wide/from16 v17, v13

    .line 83
    .line 84
    iget-wide v12, v9, Ls4/m;->f:J

    .line 85
    .line 86
    add-long v12, v12, v17

    .line 87
    .line 88
    move-wide/from16 v19, v12

    .line 89
    .line 90
    iget-wide v12, v5, Ls4/m;->f:J

    .line 91
    .line 92
    cmp-long v14, v19, v12

    .line 93
    .line 94
    if-nez v14, :cond_2

    .line 95
    .line 96
    iget-object v12, v9, Ls4/m;->h:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v13, v5, Ls4/m;->h:Ljava/lang/String;

    .line 99
    .line 100
    sget v14, Lp4/c0;->a:I

    .line 101
    .line 102
    invoke-static {v12, v13}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v12

    .line 106
    if-eqz v12, :cond_2

    .line 107
    .line 108
    iget v12, v9, Ls4/m;->i:I

    .line 109
    .line 110
    iget v13, v5, Ls4/m;->i:I

    .line 111
    .line 112
    if-ne v12, v13, :cond_2

    .line 113
    .line 114
    iget v12, v9, Ls4/m;->c:I

    .line 115
    .line 116
    iget v13, v5, Ls4/m;->c:I

    .line 117
    .line 118
    if-ne v12, v13, :cond_2

    .line 119
    .line 120
    iget-object v12, v9, Ls4/m;->e:Ljava/util/Map;

    .line 121
    .line 122
    iget-object v13, v5, Ls4/m;->e:Ljava/util/Map;

    .line 123
    .line 124
    invoke-interface {v12, v13}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    if-eqz v12, :cond_2

    .line 129
    .line 130
    iget-wide v4, v5, Ls4/m;->g:J

    .line 131
    .line 132
    cmp-long v7, v4, v15

    .line 133
    .line 134
    if-nez v7, :cond_1

    .line 135
    .line 136
    :goto_2
    move-wide v4, v15

    .line 137
    goto :goto_3

    .line 138
    :cond_1
    add-long v15, v17, v4

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :goto_3
    const-wide/16 v12, 0x0

    .line 142
    .line 143
    invoke-virtual {v9, v12, v13, v4, v5}, Ls4/m;->c(JJ)Ls4/m;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    new-instance v7, Landroidx/media3/exoplayer/offline/z;

    .line 155
    .line 156
    invoke-direct {v7, v10, v11, v4}, Landroidx/media3/exoplayer/offline/z;-><init>(JLs4/m;)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v0, v5, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-virtual {v1, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    invoke-interface {v0, v3, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    add-int/lit8 v3, v3, 0x1

    .line 174
    .line 175
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    invoke-static {v3, v1, v0}, Lp4/c0;->S(IILjava/util/List;)V

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


# virtual methods
.method public final a(Landroidx/media3/exoplayer/offline/l;)V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    :try_start_0
    iget-object v5, v1, Landroidx/media3/exoplayer/offline/b0;->d:Lt4/e;

    .line 16
    .line 17
    invoke-virtual {v5}, Lt4/e;->a()Lt4/f;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-object v6, v1, Landroidx/media3/exoplayer/offline/b0;->a:Ls4/m;

    .line 22
    .line 23
    new-instance v7, Landroidx/media3/exoplayer/offline/x;

    .line 24
    .line 25
    invoke-direct {v7, v1, v5, v6}, Landroidx/media3/exoplayer/offline/x;-><init>(Landroidx/media3/exoplayer/offline/b0;Lt4/f;Ls4/m;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v7, v3}, Landroidx/media3/exoplayer/offline/b0;->c(Lp4/t;Z)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    check-cast v6, Landroidx/media3/exoplayer/offline/t;

    .line 33
    .line 34
    iget-object v7, v1, Landroidx/media3/exoplayer/offline/b0;->c:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-nez v7, :cond_0

    .line 41
    .line 42
    iget-object v7, v1, Landroidx/media3/exoplayer/offline/b0;->c:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-interface {v6, v7}, Landroidx/media3/exoplayer/offline/t;->a(Ljava/util/List;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Landroidx/media3/exoplayer/offline/t;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto/16 :goto_8

    .line 53
    .line 54
    :cond_0
    :goto_0
    invoke-virtual {v1, v5, v6, v3}, Landroidx/media3/exoplayer/offline/b0;->e(Lt4/f;Landroidx/media3/exoplayer/offline/t;Z)Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-static {v5}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 59
    .line 60
    .line 61
    iget-object v6, v1, Landroidx/media3/exoplayer/offline/b0;->f:Lt4/j;

    .line 62
    .line 63
    iget-wide v7, v1, Landroidx/media3/exoplayer/offline/b0;->h:J

    .line 64
    .line 65
    invoke-static {v5, v6, v7, v8}, Landroidx/media3/exoplayer/offline/b0;->f(Ljava/util/List;Lt4/j;J)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v13

    .line 72
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    sub-int/2addr v6, v4

    .line 77
    const-wide/16 v7, 0x0

    .line 78
    .line 79
    move-wide v11, v7

    .line 80
    move-wide v14, v11

    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    :goto_1
    if-ltz v6, :cond_5

    .line 84
    .line 85
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    check-cast v7, Landroidx/media3/exoplayer/offline/z;

    .line 90
    .line 91
    iget-object v7, v7, Landroidx/media3/exoplayer/offline/z;->b:Ls4/m;

    .line 92
    .line 93
    iget-object v8, v1, Landroidx/media3/exoplayer/offline/b0;->f:Lt4/j;

    .line 94
    .line 95
    invoke-virtual {v8, v7}, Lt4/j;->a(Ls4/m;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    iget-wide v9, v7, Ls4/m;->g:J

    .line 100
    .line 101
    const-wide/16 v23, -0x1

    .line 102
    .line 103
    cmp-long v17, v9, v23

    .line 104
    .line 105
    if-nez v17, :cond_1

    .line 106
    .line 107
    iget-object v3, v1, Landroidx/media3/exoplayer/offline/b0;->e:Lt4/b;

    .line 108
    .line 109
    check-cast v3, Lt4/y;

    .line 110
    .line 111
    invoke-virtual {v3, v8}, Lt4/y;->j(Ljava/lang/String;)Lt4/s;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-static {v3}, Lq/t0;->t(Lt4/r;)J

    .line 116
    .line 117
    .line 118
    move-result-wide v17

    .line 119
    cmp-long v3, v17, v23

    .line 120
    .line 121
    if-eqz v3, :cond_1

    .line 122
    .line 123
    iget-wide v9, v7, Ls4/m;->f:J

    .line 124
    .line 125
    sub-long v9, v17, v9

    .line 126
    .line 127
    :cond_1
    move-wide/from16 v20, v9

    .line 128
    .line 129
    iget-object v3, v1, Landroidx/media3/exoplayer/offline/b0;->e:Lt4/b;

    .line 130
    .line 131
    iget-wide v9, v7, Ls4/m;->f:J

    .line 132
    .line 133
    move-object/from16 v17, v3

    .line 134
    .line 135
    check-cast v17, Lt4/y;

    .line 136
    .line 137
    move-object/from16 v22, v8

    .line 138
    .line 139
    move-wide/from16 v18, v9

    .line 140
    .line 141
    invoke-virtual/range {v17 .. v22}, Lt4/y;->g(JJLjava/lang/String;)J

    .line 142
    .line 143
    .line 144
    move-result-wide v7

    .line 145
    add-long/2addr v14, v7

    .line 146
    cmp-long v3, v20, v23

    .line 147
    .line 148
    if-eqz v3, :cond_3

    .line 149
    .line 150
    cmp-long v3, v20, v7

    .line 151
    .line 152
    if-nez v3, :cond_2

    .line 153
    .line 154
    add-int/lit8 v16, v16, 0x1

    .line 155
    .line 156
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    :cond_2
    cmp-long v3, v11, v23

    .line 160
    .line 161
    if-eqz v3, :cond_4

    .line 162
    .line 163
    add-long v11, v11, v20

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_3
    move-wide/from16 v11, v23

    .line 167
    .line 168
    :cond_4
    :goto_2
    add-int/lit8 v6, v6, -0x1

    .line 169
    .line 170
    const/4 v3, 0x0

    .line 171
    goto :goto_1

    .line 172
    :cond_5
    new-instance v9, Landroidx/media3/exoplayer/offline/y;

    .line 173
    .line 174
    move-object/from16 v10, p1

    .line 175
    .line 176
    invoke-direct/range {v9 .. v16}, Landroidx/media3/exoplayer/offline/y;-><init>(Landroidx/media3/exoplayer/offline/l;JIJI)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v5}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    .line 180
    .line 181
    .line 182
    :goto_3
    iget-boolean v3, v1, Landroidx/media3/exoplayer/offline/b0;->j:Z

    .line 183
    .line 184
    if-nez v3, :cond_b

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-nez v3, :cond_b

    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-nez v3, :cond_6

    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    check-cast v3, Landroidx/media3/exoplayer/offline/a0;

    .line 203
    .line 204
    iget-object v5, v3, Landroidx/media3/exoplayer/offline/a0;->h:Lt4/f;

    .line 205
    .line 206
    iget-object v3, v3, Landroidx/media3/exoplayer/offline/a0;->j:[B

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_6
    iget-object v3, v1, Landroidx/media3/exoplayer/offline/b0;->d:Lt4/e;

    .line 210
    .line 211
    invoke-virtual {v3}, Lt4/e;->a()Lt4/f;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    const/high16 v3, 0x20000

    .line 216
    .line 217
    new-array v3, v3, [B

    .line 218
    .line 219
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    check-cast v6, Landroidx/media3/exoplayer/offline/z;

    .line 224
    .line 225
    new-instance v7, Landroidx/media3/exoplayer/offline/a0;

    .line 226
    .line 227
    invoke-direct {v7, v6, v5, v9, v3}, Landroidx/media3/exoplayer/offline/a0;-><init>(Landroidx/media3/exoplayer/offline/z;Lt4/f;Landroidx/media3/exoplayer/offline/y;[B)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1, v7}, Landroidx/media3/exoplayer/offline/b0;->b(Lp4/t;)V

    .line 231
    .line 232
    .line 233
    iget-object v3, v1, Landroidx/media3/exoplayer/offline/b0;->g:Ljava/util/concurrent/Executor;

    .line 234
    .line 235
    invoke-interface {v3, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 236
    .line 237
    .line 238
    iget-object v3, v1, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    sub-int/2addr v3, v4

    .line 245
    :goto_5
    if-ltz v3, :cond_a

    .line 246
    .line 247
    iget-object v5, v1, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    check-cast v5, Landroidx/media3/exoplayer/offline/a0;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    if-nez v6, :cond_7

    .line 260
    .line 261
    iget-object v6, v5, Lp4/t;->b:Lp4/f;

    .line 262
    .line 263
    invoke-virtual {v6}, Lp4/f;->e()Z

    .line 264
    .line 265
    .line 266
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 267
    if-eqz v6, :cond_8

    .line 268
    .line 269
    :cond_7
    :try_start_1
    invoke-virtual {v5}, Lp4/t;->get()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1, v3}, Landroidx/media3/exoplayer/offline/b0;->g(I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v5}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 276
    .line 277
    .line 278
    :cond_8
    add-int/lit8 v3, v3, -0x1

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :catch_0
    move-exception v0

    .line 282
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    instance-of v2, v0, Ljava/io/IOException;

    .line 290
    .line 291
    if-eqz v2, :cond_9

    .line 292
    .line 293
    check-cast v0, Ljava/io/IOException;

    .line 294
    .line 295
    throw v0

    .line 296
    :cond_9
    throw v0

    .line 297
    :cond_a
    iget-object v3, v7, Lp4/t;->a:Lp4/f;

    .line 298
    .line 299
    invoke-virtual {v3}, Lp4/f;->d()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 300
    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_b
    const/4 v3, 0x0

    .line 304
    :goto_6
    iget-object v0, v1, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-ge v3, v0, :cond_c

    .line 311
    .line 312
    iget-object v0, v1, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 313
    .line 314
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    check-cast v0, Lp4/t;

    .line 319
    .line 320
    invoke-virtual {v0, v4}, Lp4/t;->cancel(Z)Z

    .line 321
    .line 322
    .line 323
    add-int/lit8 v3, v3, 0x1

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_c
    iget-object v0, v1, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    sub-int/2addr v0, v4

    .line 333
    :goto_7
    if-ltz v0, :cond_d

    .line 334
    .line 335
    iget-object v2, v1, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    check-cast v2, Lp4/t;

    .line 342
    .line 343
    invoke-virtual {v2}, Lp4/t;->b()V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v1, v0}, Landroidx/media3/exoplayer/offline/b0;->g(I)V

    .line 347
    .line 348
    .line 349
    add-int/lit8 v0, v0, -0x1

    .line 350
    .line 351
    goto :goto_7

    .line 352
    :cond_d
    return-void

    .line 353
    :goto_8
    const/4 v3, 0x0

    .line 354
    :goto_9
    iget-object v2, v1, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 355
    .line 356
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    if-ge v3, v2, :cond_e

    .line 361
    .line 362
    iget-object v2, v1, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 363
    .line 364
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    check-cast v2, Lp4/t;

    .line 369
    .line 370
    invoke-virtual {v2, v4}, Lp4/t;->cancel(Z)Z

    .line 371
    .line 372
    .line 373
    add-int/lit8 v3, v3, 0x1

    .line 374
    .line 375
    goto :goto_9

    .line 376
    :cond_e
    iget-object v2, v1, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 377
    .line 378
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    sub-int/2addr v2, v4

    .line 383
    :goto_a
    if-ltz v2, :cond_f

    .line 384
    .line 385
    iget-object v3, v1, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 386
    .line 387
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    check-cast v3, Lp4/t;

    .line 392
    .line 393
    invoke-virtual {v3}, Lp4/t;->b()V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/offline/b0;->g(I)V

    .line 397
    .line 398
    .line 399
    add-int/lit8 v2, v2, -0x1

    .line 400
    .line 401
    goto :goto_a

    .line 402
    :cond_f
    throw v0
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
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
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

.method public final b(Lp4/t;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Landroidx/media3/exoplayer/offline/b0;->j:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/InterruptedException;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1
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

.method public final c(Lp4/t;Z)Ljava/lang/Object;
    .locals 2

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lp4/t;->run()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Lp4/t;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-object p1

    .line 11
    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    instance-of v0, p2, Ljava/io/IOException;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    check-cast p2, Ljava/io/IOException;

    .line 24
    .line 25
    throw p2

    .line 26
    :cond_0
    sget p2, Lp4/c0;->a:I

    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    iget-boolean p2, p0, Landroidx/media3/exoplayer/offline/b0;->j:Z

    .line 30
    .line 31
    if-nez p2, :cond_3

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/offline/b0;->b(Lp4/t;)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Landroidx/media3/exoplayer/offline/b0;->g:Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    :try_start_1
    invoke-virtual {p1}, Lp4/t;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    invoke-virtual {p1}, Lp4/t;->b()V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 49
    .line 50
    monitor-enter v0

    .line 51
    :try_start_2
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    monitor-exit v0

    .line 57
    return-object p2

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    throw p1

    .line 61
    :catchall_1
    move-exception p2

    .line 62
    goto :goto_0

    .line 63
    :catch_1
    move-exception p2

    .line 64
    :try_start_3
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    instance-of v1, v0, Ljava/io/IOException;

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    check-cast v0, Ljava/io/IOException;

    .line 76
    .line 77
    throw v0

    .line 78
    :cond_2
    sget v0, Lp4/c0;->a:I

    .line 79
    .line 80
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 81
    :goto_0
    invoke-virtual {p1}, Lp4/t;->b()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/offline/b0;->h(Lp4/t;)V

    .line 85
    .line 86
    .line 87
    throw p2

    .line 88
    :cond_3
    new-instance p1, Ljava/lang/InterruptedException;

    .line 89
    .line 90
    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    .line 91
    .line 92
    .line 93
    throw p1
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

.method public final cancel()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Landroidx/media3/exoplayer/offline/b0;->j:Z

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    iget-object v3, p0, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ge v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lp4/t;

    .line 23
    .line 24
    invoke-virtual {v3, v1}, Lp4/t;->cancel(Z)Z

    .line 25
    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw v1
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

.method public abstract e(Lt4/f;Landroidx/media3/exoplayer/offline/t;Z)Ljava/util/ArrayList;
.end method

.method public final g(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
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

.method public final h(Lp4/t;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/b0;->i:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
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

.method public final remove()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/b0;->f:Lt4/j;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/b0;->e:Lt4/b;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/offline/b0;->a:Ls4/m;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/media3/exoplayer/offline/b0;->d:Lt4/e;

    .line 8
    .line 9
    iget v4, v3, Lt4/e;->f:I

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    or-int/2addr v4, v5

    .line 13
    const/4 v6, 0x0

    .line 14
    invoke-virtual {v3, v6, v4}, Lt4/e;->b(Ls4/h;I)Lt4/f;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    :try_start_0
    new-instance v4, Landroidx/media3/exoplayer/offline/x;

    .line 19
    .line 20
    invoke-direct {v4, p0, v3, v2}, Landroidx/media3/exoplayer/offline/x;-><init>(Landroidx/media3/exoplayer/offline/b0;Lt4/f;Ls4/m;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v4, v5}, Landroidx/media3/exoplayer/offline/b0;->c(Lp4/t;Z)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Landroidx/media3/exoplayer/offline/t;

    .line 28
    .line 29
    invoke-virtual {p0, v3, v4, v5}, Landroidx/media3/exoplayer/offline/b0;->e(Lt4/f;Landroidx/media3/exoplayer/offline/t;Z)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const/4 v4, 0x0

    .line 34
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-ge v4, v5, :cond_0

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Landroidx/media3/exoplayer/offline/z;

    .line 45
    .line 46
    iget-object v5, v5, Landroidx/media3/exoplayer/offline/z;->b:Ls4/m;

    .line 47
    .line 48
    invoke-virtual {v0, v5}, Lt4/j;->a(Ls4/m;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    move-object v6, v1

    .line 53
    check-cast v6, Lt4/y;

    .line 54
    .line 55
    invoke-virtual {v6, v5}, Lt4/y;->m(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v3

    .line 62
    goto :goto_3

    .line 63
    :cond_0
    invoke-virtual {v0, v2}, Lt4/j;->a(Ls4/m;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v1, Lt4/y;

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Lt4/y;->m(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :catch_0
    :goto_1
    invoke-virtual {v0, v2}, Lt4/j;->a(Ls4/m;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v1, Lt4/y;

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Lt4/y;->m(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :catch_1
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :goto_2
    return-void

    .line 92
    :goto_3
    invoke-virtual {v0, v2}, Lt4/j;->a(Ls4/m;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v1, Lt4/y;

    .line 97
    .line 98
    invoke-virtual {v1, v0}, Lt4/y;->m(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v3
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
