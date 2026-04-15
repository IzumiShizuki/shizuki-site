.class public final Lz6/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lr5/n;


# instance fields
.field public a:Lr5/q;

.field public b:Lr5/h0;

.field public c:I

.field public d:J

.field public e:Lz6/b;

.field public f:I

.field public g:J


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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

.method public final c()Lr5/n;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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

.method public final f(Lr5/o;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lud/e;->k(Lr5/o;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
    .line 6
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

.method public final g(Lr5/o;Lb0/a;)I
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lz6/d;->b:Lr5/h0;

    .line 6
    .line 7
    invoke-static {v2}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget v2, Lp4/c0;->a:I

    .line 11
    .line 12
    iget v2, v0, Lz6/d;->c:I

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, -0x1

    .line 16
    const/4 v5, 0x4

    .line 17
    const/4 v6, 0x1

    .line 18
    const/4 v7, 0x0

    .line 19
    if-eqz v2, :cond_17

    .line 20
    .line 21
    const/16 v8, 0x8

    .line 22
    .line 23
    const/4 v9, 0x2

    .line 24
    const-wide/16 v10, -0x1

    .line 25
    .line 26
    if-eq v2, v6, :cond_15

    .line 27
    .line 28
    const/4 v12, 0x3

    .line 29
    if-eq v2, v9, :cond_6

    .line 30
    .line 31
    if-eq v2, v12, :cond_3

    .line 32
    .line 33
    if-ne v2, v5, :cond_2

    .line 34
    .line 35
    iget-wide v2, v0, Lz6/d;->g:J

    .line 36
    .line 37
    cmp-long v5, v2, v10

    .line 38
    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v6, 0x0

    .line 43
    :goto_0
    invoke-static {v6}, Lp4/c;->i(Z)V

    .line 44
    .line 45
    .line 46
    iget-wide v2, v0, Lz6/d;->g:J

    .line 47
    .line 48
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    sub-long/2addr v2, v5

    .line 53
    iget-object v5, v0, Lz6/d;->e:Lz6/b;

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-interface {v5, v1, v2, v3}, Lz6/b;->b(Lr5/o;J)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    return v4

    .line 65
    :cond_1
    return v7

    .line 66
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 69
    .line 70
    .line 71
    throw v1

    .line 72
    :cond_3
    invoke-interface {v1}, Lr5/o;->q()V

    .line 73
    .line 74
    .line 75
    new-instance v2, Lp4/s;

    .line 76
    .line 77
    invoke-direct {v2, v8}, Lp4/s;-><init>(I)V

    .line 78
    .line 79
    .line 80
    const v3, 0x64617461

    .line 81
    .line 82
    .line 83
    invoke-static {v3, v1, v2}, Lud/e;->a0(ILr5/o;Lp4/s;)Lb7/q0;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-interface {v1, v8}, Lr5/o;->r(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    iget-wide v8, v2, Lb7/q0;->a:J

    .line 99
    .line 100
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-static {v3, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v3, Ljava/lang/Long;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Long;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    iput v3, v0, Lz6/d;->f:I

    .line 117
    .line 118
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Ljava/lang/Long;

    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 123
    .line 124
    .line 125
    move-result-wide v2

    .line 126
    iget-wide v8, v0, Lz6/d;->d:J

    .line 127
    .line 128
    cmp-long v4, v8, v10

    .line 129
    .line 130
    if-eqz v4, :cond_4

    .line 131
    .line 132
    const-wide v12, 0xffffffffL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    cmp-long v4, v2, v12

    .line 138
    .line 139
    if-nez v4, :cond_4

    .line 140
    .line 141
    move-wide v2, v8

    .line 142
    :cond_4
    iget v4, v0, Lz6/d;->f:I

    .line 143
    .line 144
    int-to-long v8, v4

    .line 145
    add-long/2addr v8, v2

    .line 146
    iput-wide v8, v0, Lz6/d;->g:J

    .line 147
    .line 148
    invoke-interface {v1}, Lr5/o;->getLength()J

    .line 149
    .line 150
    .line 151
    move-result-wide v1

    .line 152
    cmp-long v3, v1, v10

    .line 153
    .line 154
    if-eqz v3, :cond_5

    .line 155
    .line 156
    iget-wide v3, v0, Lz6/d;->g:J

    .line 157
    .line 158
    cmp-long v6, v3, v1

    .line 159
    .line 160
    if-lez v6, :cond_5

    .line 161
    .line 162
    new-instance v3, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v4, "Data exceeds input length: "

    .line 165
    .line 166
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    iget-wide v8, v0, Lz6/d;->g:J

    .line 170
    .line 171
    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v4, ", "

    .line 175
    .line 176
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    const-string v4, "WavExtractor"

    .line 187
    .line 188
    invoke-static {v4, v3}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    iput-wide v1, v0, Lz6/d;->g:J

    .line 192
    .line 193
    :cond_5
    iget-object v1, v0, Lz6/d;->e:Lz6/b;

    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    iget v2, v0, Lz6/d;->f:I

    .line 199
    .line 200
    iget-wide v3, v0, Lz6/d;->g:J

    .line 201
    .line 202
    invoke-interface {v1, v2, v3, v4}, Lz6/b;->c(IJ)V

    .line 203
    .line 204
    .line 205
    iput v5, v0, Lz6/d;->c:I

    .line 206
    .line 207
    return v7

    .line 208
    :cond_6
    new-instance v2, Lp4/s;

    .line 209
    .line 210
    const/16 v4, 0x10

    .line 211
    .line 212
    invoke-direct {v2, v4}, Lp4/s;-><init>(I)V

    .line 213
    .line 214
    .line 215
    const v8, 0x666d7420

    .line 216
    .line 217
    .line 218
    invoke-static {v8, v1, v2}, Lud/e;->a0(ILr5/o;Lp4/s;)Lb7/q0;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    iget-wide v8, v8, Lb7/q0;->a:J

    .line 223
    .line 224
    const-wide/16 v10, 0x10

    .line 225
    .line 226
    cmp-long v13, v8, v10

    .line 227
    .line 228
    if-ltz v13, :cond_7

    .line 229
    .line 230
    const/4 v10, 0x1

    .line 231
    goto :goto_1

    .line 232
    :cond_7
    const/4 v10, 0x0

    .line 233
    :goto_1
    invoke-static {v10}, Lp4/c;->i(Z)V

    .line 234
    .line 235
    .line 236
    iget-object v10, v2, Lp4/s;->a:[B

    .line 237
    .line 238
    invoke-interface {v1, v10, v7, v4}, Lr5/o;->z([BII)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v7}, Lp4/s;->G(I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Lp4/s;->n()I

    .line 245
    .line 246
    .line 247
    move-result v14

    .line 248
    invoke-virtual {v2}, Lp4/s;->n()I

    .line 249
    .line 250
    .line 251
    move-result v15

    .line 252
    invoke-virtual {v2}, Lp4/s;->m()I

    .line 253
    .line 254
    .line 255
    move-result v16

    .line 256
    invoke-virtual {v2}, Lp4/s;->m()I

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Lp4/s;->n()I

    .line 260
    .line 261
    .line 262
    move-result v17

    .line 263
    invoke-virtual {v2}, Lp4/s;->n()I

    .line 264
    .line 265
    .line 266
    move-result v18

    .line 267
    long-to-int v2, v8

    .line 268
    sub-int/2addr v2, v4

    .line 269
    const/16 v8, 0x20

    .line 270
    .line 271
    if-lez v2, :cond_a

    .line 272
    .line 273
    new-array v9, v2, [B

    .line 274
    .line 275
    invoke-interface {v1, v9, v7, v2}, Lr5/o;->z([BII)V

    .line 276
    .line 277
    .line 278
    const/16 v10, 0x18

    .line 279
    .line 280
    if-ne v2, v10, :cond_9

    .line 281
    .line 282
    new-instance v2, Lp4/s;

    .line 283
    .line 284
    invoke-direct {v2, v9}, Lp4/s;-><init>([B)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, Lp4/s;->n()I

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2}, Lp4/s;->n()I

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2}, Lp4/s;->m()I

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2}, Lp4/s;->a()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-lt v3, v4, :cond_8

    .line 301
    .line 302
    invoke-virtual {v2}, Lp4/s;->l()J

    .line 303
    .line 304
    .line 305
    move-result-wide v10

    .line 306
    invoke-virtual {v2}, Lp4/s;->n()I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    const/16 v13, 0x10

    .line 311
    .line 312
    int-to-long v4, v3

    .line 313
    invoke-virtual {v2}, Lp4/s;->n()I

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    move/from16 v19, v14

    .line 318
    .line 319
    const/16 v20, 0x10

    .line 320
    .line 321
    int-to-long v13, v3

    .line 322
    shl-long/2addr v10, v8

    .line 323
    shl-long v3, v4, v20

    .line 324
    .line 325
    or-long/2addr v3, v10

    .line 326
    or-long/2addr v3, v13

    .line 327
    invoke-virtual {v2}, Lp4/s;->o()J

    .line 328
    .line 329
    .line 330
    move-result-wide v10

    .line 331
    new-instance v2, Ljava/util/UUID;

    .line 332
    .line 333
    invoke-direct {v2, v3, v4, v10, v11}, Ljava/util/UUID;-><init>(JJ)V

    .line 334
    .line 335
    .line 336
    move-object/from16 v20, v2

    .line 337
    .line 338
    goto :goto_3

    .line 339
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 340
    .line 341
    const-string v2, "Not enough data"

    .line 342
    .line 343
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    throw v1

    .line 347
    :cond_9
    move/from16 v19, v14

    .line 348
    .line 349
    :goto_2
    move-object/from16 v20, v3

    .line 350
    .line 351
    goto :goto_3

    .line 352
    :cond_a
    move/from16 v19, v14

    .line 353
    .line 354
    sget-object v9, Lp4/c0;->f:[B

    .line 355
    .line 356
    goto :goto_2

    .line 357
    :goto_3
    invoke-interface {v1}, Lr5/o;->j()J

    .line 358
    .line 359
    .line 360
    move-result-wide v2

    .line 361
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 362
    .line 363
    .line 364
    move-result-wide v4

    .line 365
    sub-long/2addr v2, v4

    .line 366
    long-to-int v3, v2

    .line 367
    invoke-interface {v1, v3}, Lr5/o;->r(I)V

    .line 368
    .line 369
    .line 370
    new-instance v24, Ll6/d;

    .line 371
    .line 372
    move/from16 v14, v19

    .line 373
    .line 374
    move-object/from16 v13, v24

    .line 375
    .line 376
    move-object/from16 v19, v9

    .line 377
    .line 378
    invoke-direct/range {v13 .. v20}, Ll6/d;-><init>(IIIII[BLjava/util/UUID;)V

    .line 379
    .line 380
    .line 381
    move/from16 v1, v18

    .line 382
    .line 383
    move-object/from16 v3, v20

    .line 384
    .line 385
    const/16 v2, 0x11

    .line 386
    .line 387
    if-ne v14, v2, :cond_b

    .line 388
    .line 389
    new-instance v1, Lz6/a;

    .line 390
    .line 391
    iget-object v2, v0, Lz6/d;->a:Lr5/q;

    .line 392
    .line 393
    iget-object v3, v0, Lz6/d;->b:Lr5/h0;

    .line 394
    .line 395
    invoke-direct {v1, v2, v3, v13}, Lz6/a;-><init>(Lr5/q;Lr5/h0;Ll6/d;)V

    .line 396
    .line 397
    .line 398
    iput-object v1, v0, Lz6/d;->e:Lz6/b;

    .line 399
    .line 400
    goto/16 :goto_8

    .line 401
    .line 402
    :cond_b
    const/4 v2, 0x6

    .line 403
    if-eq v14, v2, :cond_c

    .line 404
    .line 405
    const v2, 0xfffe

    .line 406
    .line 407
    .line 408
    if-ne v14, v2, :cond_d

    .line 409
    .line 410
    sget-object v4, Lr5/j0;->b:Ljava/util/UUID;

    .line 411
    .line 412
    invoke-virtual {v4, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    if-eqz v4, :cond_d

    .line 417
    .line 418
    :cond_c
    move-object/from16 v24, v13

    .line 419
    .line 420
    goto/16 :goto_7

    .line 421
    .line 422
    :cond_d
    const/4 v4, 0x7

    .line 423
    if-eq v14, v4, :cond_e

    .line 424
    .line 425
    if-ne v14, v2, :cond_f

    .line 426
    .line 427
    sget-object v4, Lr5/j0;->c:Ljava/util/UUID;

    .line 428
    .line 429
    invoke-virtual {v4, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    if-eqz v4, :cond_f

    .line 434
    .line 435
    :cond_e
    move-object/from16 v24, v13

    .line 436
    .line 437
    goto :goto_6

    .line 438
    :cond_f
    sget-object v4, Lr5/j0;->a:Ljava/util/UUID;

    .line 439
    .line 440
    if-eq v14, v6, :cond_12

    .line 441
    .line 442
    if-eq v14, v12, :cond_11

    .line 443
    .line 444
    if-eq v14, v2, :cond_12

    .line 445
    .line 446
    :cond_10
    const/4 v1, 0x0

    .line 447
    goto :goto_4

    .line 448
    :cond_11
    if-ne v1, v8, :cond_10

    .line 449
    .line 450
    const/4 v1, 0x4

    .line 451
    goto :goto_4

    .line 452
    :cond_12
    invoke-static {v1}, Lp4/c0;->A(I)I

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    :goto_4
    if-ne v14, v2, :cond_13

    .line 457
    .line 458
    sget-object v2, Lr5/j0;->a:Ljava/util/UUID;

    .line 459
    .line 460
    invoke-virtual {v2, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    if-eqz v2, :cond_13

    .line 465
    .line 466
    const/16 v26, 0x4

    .line 467
    .line 468
    goto :goto_5

    .line 469
    :cond_13
    move/from16 v26, v1

    .line 470
    .line 471
    :goto_5
    if-eqz v26, :cond_14

    .line 472
    .line 473
    new-instance v21, Lz6/c;

    .line 474
    .line 475
    iget-object v1, v0, Lz6/d;->a:Lr5/q;

    .line 476
    .line 477
    iget-object v2, v0, Lz6/d;->b:Lr5/h0;

    .line 478
    .line 479
    const-string v25, "audio/raw"

    .line 480
    .line 481
    move-object/from16 v22, v1

    .line 482
    .line 483
    move-object/from16 v23, v2

    .line 484
    .line 485
    move-object/from16 v24, v13

    .line 486
    .line 487
    invoke-direct/range {v21 .. v26}, Lz6/c;-><init>(Lr5/q;Lr5/h0;Ll6/d;Ljava/lang/String;I)V

    .line 488
    .line 489
    .line 490
    move-object/from16 v1, v21

    .line 491
    .line 492
    iput-object v1, v0, Lz6/d;->e:Lz6/b;

    .line 493
    .line 494
    goto :goto_8

    .line 495
    :cond_14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 496
    .line 497
    const-string v2, "Unsupported WAV format type: "

    .line 498
    .line 499
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    invoke-static {v1}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    throw v1

    .line 514
    :goto_6
    new-instance v21, Lz6/c;

    .line 515
    .line 516
    iget-object v1, v0, Lz6/d;->a:Lr5/q;

    .line 517
    .line 518
    iget-object v2, v0, Lz6/d;->b:Lr5/h0;

    .line 519
    .line 520
    const-string v25, "audio/g711-mlaw"

    .line 521
    .line 522
    const/16 v26, -0x1

    .line 523
    .line 524
    move-object/from16 v22, v1

    .line 525
    .line 526
    move-object/from16 v23, v2

    .line 527
    .line 528
    invoke-direct/range {v21 .. v26}, Lz6/c;-><init>(Lr5/q;Lr5/h0;Ll6/d;Ljava/lang/String;I)V

    .line 529
    .line 530
    .line 531
    move-object/from16 v1, v21

    .line 532
    .line 533
    iput-object v1, v0, Lz6/d;->e:Lz6/b;

    .line 534
    .line 535
    goto :goto_8

    .line 536
    :goto_7
    new-instance v21, Lz6/c;

    .line 537
    .line 538
    iget-object v1, v0, Lz6/d;->a:Lr5/q;

    .line 539
    .line 540
    iget-object v2, v0, Lz6/d;->b:Lr5/h0;

    .line 541
    .line 542
    const-string v25, "audio/g711-alaw"

    .line 543
    .line 544
    const/16 v26, -0x1

    .line 545
    .line 546
    move-object/from16 v22, v1

    .line 547
    .line 548
    move-object/from16 v23, v2

    .line 549
    .line 550
    invoke-direct/range {v21 .. v26}, Lz6/c;-><init>(Lr5/q;Lr5/h0;Ll6/d;Ljava/lang/String;I)V

    .line 551
    .line 552
    .line 553
    move-object/from16 v1, v21

    .line 554
    .line 555
    iput-object v1, v0, Lz6/d;->e:Lz6/b;

    .line 556
    .line 557
    :goto_8
    iput v12, v0, Lz6/d;->c:I

    .line 558
    .line 559
    return v7

    .line 560
    :cond_15
    new-instance v2, Lp4/s;

    .line 561
    .line 562
    invoke-direct {v2, v8}, Lp4/s;-><init>(I)V

    .line 563
    .line 564
    .line 565
    invoke-static {v1, v2}, Lb7/q0;->b(Lr5/o;Lp4/s;)Lb7/q0;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    iget v4, v3, Lb7/q0;->b:I

    .line 570
    .line 571
    const v5, 0x64733634

    .line 572
    .line 573
    .line 574
    if-eq v4, v5, :cond_16

    .line 575
    .line 576
    invoke-interface {v1}, Lr5/o;->q()V

    .line 577
    .line 578
    .line 579
    goto :goto_9

    .line 580
    :cond_16
    invoke-interface {v1, v8}, Lr5/o;->k(I)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v2, v7}, Lp4/s;->G(I)V

    .line 584
    .line 585
    .line 586
    iget-object v4, v2, Lp4/s;->a:[B

    .line 587
    .line 588
    invoke-interface {v1, v4, v7, v8}, Lr5/o;->z([BII)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v2}, Lp4/s;->j()J

    .line 592
    .line 593
    .line 594
    move-result-wide v10

    .line 595
    iget-wide v2, v3, Lb7/q0;->a:J

    .line 596
    .line 597
    long-to-int v3, v2

    .line 598
    add-int/2addr v3, v8

    .line 599
    invoke-interface {v1, v3}, Lr5/o;->r(I)V

    .line 600
    .line 601
    .line 602
    :goto_9
    iput-wide v10, v0, Lz6/d;->d:J

    .line 603
    .line 604
    iput v9, v0, Lz6/d;->c:I

    .line 605
    .line 606
    return v7

    .line 607
    :cond_17
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 608
    .line 609
    .line 610
    move-result-wide v8

    .line 611
    const-wide/16 v10, 0x0

    .line 612
    .line 613
    cmp-long v2, v8, v10

    .line 614
    .line 615
    if-nez v2, :cond_18

    .line 616
    .line 617
    const/4 v2, 0x1

    .line 618
    goto :goto_a

    .line 619
    :cond_18
    const/4 v2, 0x0

    .line 620
    :goto_a
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 621
    .line 622
    .line 623
    iget v2, v0, Lz6/d;->f:I

    .line 624
    .line 625
    if-eq v2, v4, :cond_19

    .line 626
    .line 627
    invoke-interface {v1, v2}, Lr5/o;->r(I)V

    .line 628
    .line 629
    .line 630
    const/4 v1, 0x4

    .line 631
    iput v1, v0, Lz6/d;->c:I

    .line 632
    .line 633
    return v7

    .line 634
    :cond_19
    invoke-static {v1}, Lud/e;->k(Lr5/o;)Z

    .line 635
    .line 636
    .line 637
    move-result v2

    .line 638
    if-eqz v2, :cond_1a

    .line 639
    .line 640
    invoke-interface {v1}, Lr5/o;->j()J

    .line 641
    .line 642
    .line 643
    move-result-wide v2

    .line 644
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 645
    .line 646
    .line 647
    move-result-wide v4

    .line 648
    sub-long/2addr v2, v4

    .line 649
    long-to-int v3, v2

    .line 650
    invoke-interface {v1, v3}, Lr5/o;->r(I)V

    .line 651
    .line 652
    .line 653
    iput v6, v0, Lz6/d;->c:I

    .line 654
    .line 655
    return v7

    .line 656
    :cond_1a
    const-string v1, "Unsupported or unrecognized wav file type."

    .line 657
    .line 658
    invoke-static {v3, v1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    throw v1
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
.end method

.method public final h(Lr5/q;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lz6/d;->a:Lr5/q;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, Lr5/q;->u(II)Lr5/h0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lz6/d;->b:Lr5/h0;

    .line 10
    .line 11
    invoke-interface {p1}, Lr5/q;->n()V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public final i(JJ)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x4

    .line 10
    :goto_0
    iput p1, p0, Lz6/d;->c:I

    .line 11
    .line 12
    iget-object p1, p0, Lz6/d;->e:Lz6/b;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-interface {p1, p3, p4}, Lz6/b;->a(J)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
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
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lya/i0;->b:Lya/g0;

    .line 2
    .line 3
    sget-object v0, Lya/a1;->e:Lya/a1;

    .line 4
    .line 5
    return-object v0
    .line 6
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
