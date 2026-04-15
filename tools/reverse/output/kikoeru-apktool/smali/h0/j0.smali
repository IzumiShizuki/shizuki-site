.class public final Lh0/j0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Lt2/l0;


# direct methods
.method public constructor <init>(IILt2/l0;)V
    .locals 0

    .line 1
    iput p1, p0, Lh0/j0;->b:I

    .line 2
    .line 3
    iput p2, p0, Lh0/j0;->c:I

    .line 4
    .line 5
    iput-object p3, p0, Lh0/j0;->d:Lt2/l0;

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
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
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lj1/q;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Lx0/o;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    const v2, 0x1855405a

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lx0/o;->W(I)V

    .line 22
    .line 23
    .line 24
    iget v2, v0, Lh0/j0;->b:I

    .line 25
    .line 26
    iget v3, v0, Lh0/j0;->c:I

    .line 27
    .line 28
    invoke-static {v2, v3}, Lh0/q0;->w(II)V

    .line 29
    .line 30
    .line 31
    sget-object v4, Lj1/n;->a:Lj1/n;

    .line 32
    .line 33
    const v5, 0x7fffffff

    .line 34
    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x1

    .line 38
    if-ne v2, v7, :cond_0

    .line 39
    .line 40
    if-ne v3, v5, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1, v6}, Lx0/o;->p(Z)V

    .line 43
    .line 44
    .line 45
    return-object v4

    .line 46
    :cond_0
    sget-object v8, Lj2/l1;->h:Lx0/o2;

    .line 47
    .line 48
    invoke-virtual {v1, v8}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    check-cast v8, Lf3/c;

    .line 53
    .line 54
    sget-object v9, Lj2/l1;->k:Lx0/o2;

    .line 55
    .line 56
    invoke-virtual {v1, v9}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    check-cast v9, Lx2/d;

    .line 61
    .line 62
    sget-object v10, Lj2/l1;->n:Lx0/o2;

    .line 63
    .line 64
    invoke-virtual {v1, v10}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    check-cast v10, Lf3/m;

    .line 69
    .line 70
    iget-object v11, v0, Lh0/j0;->d:Lt2/l0;

    .line 71
    .line 72
    invoke-virtual {v1, v11}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    invoke-virtual {v1, v10}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    or-int/2addr v12, v13

    .line 81
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    sget-object v14, Lx0/k;->a:Lx0/r0;

    .line 86
    .line 87
    if-nez v12, :cond_1

    .line 88
    .line 89
    if-ne v13, v14, :cond_2

    .line 90
    .line 91
    :cond_1
    invoke-static {v11, v10}, Lt2/c0;->h(Lt2/l0;Lf3/m;)Lt2/l0;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    invoke-virtual {v1, v13}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    check-cast v13, Lt2/l0;

    .line 99
    .line 100
    invoke-virtual {v1, v9}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    invoke-virtual {v1, v13}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v15

    .line 108
    or-int/2addr v12, v15

    .line 109
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    if-nez v12, :cond_3

    .line 114
    .line 115
    if-ne v15, v14, :cond_7

    .line 116
    .line 117
    :cond_3
    iget-object v12, v13, Lt2/l0;->a:Lt2/d0;

    .line 118
    .line 119
    iget-object v15, v12, Lt2/d0;->f:Lx2/n;

    .line 120
    .line 121
    iget-object v6, v12, Lt2/d0;->c:Lx2/k;

    .line 122
    .line 123
    if-nez v6, :cond_4

    .line 124
    .line 125
    sget-object v6, Lx2/k;->d:Lx2/k;

    .line 126
    .line 127
    :cond_4
    iget-object v5, v12, Lt2/d0;->d:Lx2/i;

    .line 128
    .line 129
    if-eqz v5, :cond_5

    .line 130
    .line 131
    iget v5, v5, Lx2/i;->a:I

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_5
    const/4 v5, 0x0

    .line 135
    :goto_0
    iget-object v12, v12, Lt2/d0;->e:Lx2/j;

    .line 136
    .line 137
    if-eqz v12, :cond_6

    .line 138
    .line 139
    iget v12, v12, Lx2/j;->a:I

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_6
    const v12, 0xffff

    .line 143
    .line 144
    .line 145
    :goto_1
    move-object v7, v9

    .line 146
    check-cast v7, Lx2/e;

    .line 147
    .line 148
    invoke-virtual {v7, v15, v6, v5, v12}, Lx2/e;->b(Lx2/n;Lx2/k;II)Lx2/p;

    .line 149
    .line 150
    .line 151
    move-result-object v15

    .line 152
    invoke-virtual {v1, v15}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_7
    check-cast v15, Lx0/n2;

    .line 156
    .line 157
    invoke-interface {v15}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v1, v8}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    invoke-virtual {v1, v9}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    or-int/2addr v6, v7

    .line 170
    invoke-virtual {v1, v11}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    or-int/2addr v6, v7

    .line 175
    invoke-virtual {v1, v10}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    or-int/2addr v6, v7

    .line 180
    invoke-virtual {v1, v5}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    or-int/2addr v5, v6

    .line 185
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    const-wide v16, 0xffffffffL

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    if-nez v5, :cond_8

    .line 195
    .line 196
    if-ne v6, v14, :cond_9

    .line 197
    .line 198
    :cond_8
    sget-object v5, Lh0/g1;->a:Ljava/lang/String;

    .line 199
    .line 200
    const/4 v6, 0x1

    .line 201
    invoke-static {v13, v8, v9, v5, v6}, Lh0/g1;->a(Lt2/l0;Lf3/c;Lx2/d;Ljava/lang/String;I)J

    .line 202
    .line 203
    .line 204
    move-result-wide v18

    .line 205
    and-long v5, v18, v16

    .line 206
    .line 207
    long-to-int v6, v5

    .line 208
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    invoke-virtual {v1, v6}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_9
    check-cast v6, Ljava/lang/Number;

    .line 216
    .line 217
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    invoke-interface {v15}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-virtual {v1, v8}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    invoke-virtual {v1, v9}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v12

    .line 233
    or-int/2addr v7, v12

    .line 234
    invoke-virtual {v1, v11}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v11

    .line 238
    or-int/2addr v7, v11

    .line 239
    invoke-virtual {v1, v10}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    or-int/2addr v7, v10

    .line 244
    invoke-virtual {v1, v6}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    or-int/2addr v6, v7

    .line 249
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    if-nez v6, :cond_a

    .line 254
    .line 255
    if-ne v7, v14, :cond_b

    .line 256
    .line 257
    :cond_a
    new-instance v6, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 260
    .line 261
    .line 262
    sget-object v7, Lh0/g1;->a:Ljava/lang/String;

    .line 263
    .line 264
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const/16 v10, 0xa

    .line 268
    .line 269
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    const/4 v7, 0x2

    .line 280
    invoke-static {v13, v8, v9, v6, v7}, Lh0/g1;->a(Lt2/l0;Lf3/c;Lx2/d;Ljava/lang/String;I)J

    .line 281
    .line 282
    .line 283
    move-result-wide v6

    .line 284
    and-long v6, v6, v16

    .line 285
    .line 286
    long-to-int v7, v6

    .line 287
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    invoke-virtual {v1, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :cond_b
    check-cast v7, Ljava/lang/Number;

    .line 295
    .line 296
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    sub-int/2addr v6, v5

    .line 301
    const/4 v7, 0x0

    .line 302
    const/4 v9, 0x1

    .line 303
    if-ne v2, v9, :cond_c

    .line 304
    .line 305
    move-object v2, v7

    .line 306
    :goto_2
    const v10, 0x7fffffff

    .line 307
    .line 308
    .line 309
    goto :goto_3

    .line 310
    :cond_c
    sub-int/2addr v2, v9

    .line 311
    mul-int v2, v2, v6

    .line 312
    .line 313
    add-int/2addr v2, v5

    .line 314
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    goto :goto_2

    .line 319
    :goto_3
    if-ne v3, v10, :cond_d

    .line 320
    .line 321
    goto :goto_4

    .line 322
    :cond_d
    sub-int/2addr v3, v9

    .line 323
    mul-int v3, v3, v6

    .line 324
    .line 325
    add-int/2addr v3, v5

    .line 326
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    :goto_4
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 331
    .line 332
    if-eqz v2, :cond_e

    .line 333
    .line 334
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    invoke-interface {v8, v2}, Lf3/c;->I(I)F

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    goto :goto_5

    .line 343
    :cond_e
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 344
    .line 345
    :goto_5
    if-eqz v7, :cond_f

    .line 346
    .line 347
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    invoke-interface {v8, v3}, Lf3/c;->I(I)F

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    :cond_f
    invoke-static {v4, v2, v3}, Landroidx/compose/foundation/layout/c;->e(Lj1/q;FF)Lj1/q;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    const/4 v3, 0x0

    .line 360
    invoke-virtual {v1, v3}, Lx0/o;->p(Z)V

    .line 361
    .line 362
    .line 363
    return-object v2
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
