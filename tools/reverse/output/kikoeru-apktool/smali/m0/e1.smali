.class public final Lm0/e1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# static fields
.field public static final b:Lm0/e1;

.field public static final c:Lm0/e1;

.field public static final d:Lm0/e1;

.field public static final e:Lm0/e1;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm0/e1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lm0/e1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm0/e1;->b:Lm0/e1;

    .line 8
    .line 9
    new-instance v0, Lm0/e1;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lm0/e1;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lm0/e1;->c:Lm0/e1;

    .line 16
    .line 17
    new-instance v0, Lm0/e1;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lm0/e1;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lm0/e1;->d:Lm0/e1;

    .line 24
    .line 25
    new-instance v0, Lm0/e1;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lm0/e1;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lm0/e1;->e:Lm0/e1;

    .line 32
    .line 33
    return-void
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

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lm0/e1;->a:I

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
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lm0/e1;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lr/k1;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Lx0/o;

    .line 15
    .line 16
    move-object/from16 v3, p3

    .line 17
    .line 18
    check-cast v3, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    const v3, 0x6e392619

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lx0/o;->W(I)V

    .line 27
    .line 28
    .line 29
    sget-object v3, Lm0/s3;->a:Lm0/s3;

    .line 30
    .line 31
    sget-object v4, Lm0/s3;->b:Lm0/s3;

    .line 32
    .line 33
    invoke-interface {v1, v3, v4}, Lr/k1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    const/4 v6, 0x0

    .line 38
    const/16 v7, 0x43

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    sget-object v1, Lr/w;->d:Lm4/d1;

    .line 43
    .line 44
    const/4 v3, 0x2

    .line 45
    invoke-static {v7, v6, v1, v3}, Lr/d;->r(IILr/v;I)Lr/u1;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    invoke-interface {v1, v4, v3}, Lr/k1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    sget-object v3, Lm0/s3;->c:Lm0/s3;

    .line 57
    .line 58
    invoke-interface {v1, v3, v4}, Lr/k1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 v1, 0x7

    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-static {v1, v3}, Lr/d;->q(ILjava/lang/Object;)Lr/z0;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    :goto_0
    sget-object v1, Lr/w;->d:Lm4/d1;

    .line 73
    .line 74
    new-instance v3, Lr/u1;

    .line 75
    .line 76
    const/16 v4, 0x53

    .line 77
    .line 78
    invoke-direct {v3, v4, v7, v1}, Lr/u1;-><init>(IILr/v;)V

    .line 79
    .line 80
    .line 81
    move-object v1, v3

    .line 82
    :goto_1
    invoke-virtual {v2, v6}, Lx0/o;->p(Z)V

    .line 83
    .line 84
    .line 85
    return-object v1

    .line 86
    :pswitch_0
    if-nez p1, :cond_8

    .line 87
    .line 88
    move-object/from16 v1, p2

    .line 89
    .line 90
    check-cast v1, Lx0/o;

    .line 91
    .line 92
    move-object/from16 v2, p3

    .line 93
    .line 94
    check-cast v2, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    and-int/lit8 v3, v2, 0x6

    .line 101
    .line 102
    if-nez v3, :cond_5

    .line 103
    .line 104
    and-int/lit8 v3, v2, 0x8

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    if-nez v3, :cond_3

    .line 108
    .line 109
    invoke-virtual {v1, v4}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    goto :goto_2

    .line 114
    :cond_3
    invoke-virtual {v1, v4}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    :goto_2
    if-eqz v3, :cond_4

    .line 119
    .line 120
    const/4 v3, 0x4

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    const/4 v3, 0x2

    .line 123
    :goto_3
    or-int/2addr v2, v3

    .line 124
    :cond_5
    and-int/lit8 v3, v2, 0x13

    .line 125
    .line 126
    const/16 v4, 0x12

    .line 127
    .line 128
    if-eq v3, v4, :cond_6

    .line 129
    .line 130
    const/4 v3, 0x1

    .line 131
    goto :goto_4

    .line 132
    :cond_6
    const/4 v3, 0x0

    .line 133
    :goto_4
    and-int/lit8 v4, v2, 0x1

    .line 134
    .line 135
    invoke-virtual {v1, v4, v3}, Lx0/o;->N(IZ)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_7

    .line 140
    .line 141
    and-int/lit8 v17, v2, 0xe

    .line 142
    .line 143
    const/4 v7, 0x0

    .line 144
    const/4 v8, 0x0

    .line 145
    const-wide/16 v9, 0x0

    .line 146
    .line 147
    const-wide/16 v11, 0x0

    .line 148
    .line 149
    const-wide/16 v13, 0x0

    .line 150
    .line 151
    const/4 v15, 0x0

    .line 152
    move-object/from16 v16, v1

    .line 153
    .line 154
    invoke-static/range {v7 .. v17}, Lm0/a7;->d(Lj1/q;Lq1/l0;JJJFLx0/o;I)V

    .line 155
    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_7
    move-object/from16 v16, v1

    .line 159
    .line 160
    invoke-virtual/range {v16 .. v16}, Lx0/o;->Q()V

    .line 161
    .line 162
    .line 163
    :goto_5
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 164
    .line 165
    return-object v1

    .line 166
    :cond_8
    new-instance v1, Ljava/lang/ClassCastException;

    .line 167
    .line 168
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 169
    .line 170
    .line 171
    throw v1

    .line 172
    :pswitch_1
    move-object/from16 v1, p1

    .line 173
    .line 174
    check-cast v1, Lm0/u6;

    .line 175
    .line 176
    move-object/from16 v2, p2

    .line 177
    .line 178
    check-cast v2, Lx0/o;

    .line 179
    .line 180
    move-object/from16 v3, p3

    .line 181
    .line 182
    check-cast v3, Ljava/lang/Number;

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    and-int/lit8 v4, v3, 0x6

    .line 189
    .line 190
    if-nez v4, :cond_a

    .line 191
    .line 192
    invoke-virtual {v2, v1}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-eqz v4, :cond_9

    .line 197
    .line 198
    const/4 v4, 0x4

    .line 199
    goto :goto_6

    .line 200
    :cond_9
    const/4 v4, 0x2

    .line 201
    :goto_6
    or-int/2addr v3, v4

    .line 202
    :cond_a
    and-int/lit8 v4, v3, 0x13

    .line 203
    .line 204
    const/16 v5, 0x12

    .line 205
    .line 206
    if-eq v4, v5, :cond_b

    .line 207
    .line 208
    const/4 v4, 0x1

    .line 209
    goto :goto_7

    .line 210
    :cond_b
    const/4 v4, 0x0

    .line 211
    :goto_7
    and-int/lit8 v5, v3, 0x1

    .line 212
    .line 213
    invoke-virtual {v2, v5, v4}, Lx0/o;->N(IZ)Z

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    if-eqz v4, :cond_c

    .line 218
    .line 219
    and-int/lit8 v3, v3, 0xe

    .line 220
    .line 221
    const/4 v4, 0x0

    .line 222
    invoke-static {v1, v4, v4, v2, v3}, La/a;->l(Lm0/u6;Lj1/q;Lic/o;Lx0/o;I)V

    .line 223
    .line 224
    .line 225
    goto :goto_8

    .line 226
    :cond_c
    invoke-virtual {v2}, Lx0/o;->Q()V

    .line 227
    .line 228
    .line 229
    :goto_8
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 230
    .line 231
    return-object v1

    .line 232
    :pswitch_2
    move-object/from16 v1, p1

    .line 233
    .line 234
    check-cast v1, Lm0/u6;

    .line 235
    .line 236
    move-object/from16 v2, p2

    .line 237
    .line 238
    check-cast v2, Lx0/o;

    .line 239
    .line 240
    move-object/from16 v3, p3

    .line 241
    .line 242
    check-cast v3, Ljava/lang/Number;

    .line 243
    .line 244
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    and-int/lit8 v4, v3, 0x6

    .line 249
    .line 250
    if-nez v4, :cond_e

    .line 251
    .line 252
    invoke-virtual {v2, v1}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-eqz v4, :cond_d

    .line 257
    .line 258
    const/4 v4, 0x4

    .line 259
    goto :goto_9

    .line 260
    :cond_d
    const/4 v4, 0x2

    .line 261
    :goto_9
    or-int/2addr v3, v4

    .line 262
    :cond_e
    and-int/lit8 v4, v3, 0x13

    .line 263
    .line 264
    const/16 v5, 0x12

    .line 265
    .line 266
    if-eq v4, v5, :cond_f

    .line 267
    .line 268
    const/4 v4, 0x1

    .line 269
    goto :goto_a

    .line 270
    :cond_f
    const/4 v4, 0x0

    .line 271
    :goto_a
    and-int/lit8 v5, v3, 0x1

    .line 272
    .line 273
    invoke-virtual {v2, v5, v4}, Lx0/o;->N(IZ)Z

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-eqz v4, :cond_10

    .line 278
    .line 279
    and-int/lit8 v3, v3, 0xe

    .line 280
    .line 281
    const/4 v4, 0x0

    .line 282
    invoke-static {v1, v4, v4, v2, v3}, La/a;->l(Lm0/u6;Lj1/q;Lic/o;Lx0/o;I)V

    .line 283
    .line 284
    .line 285
    goto :goto_b

    .line 286
    :cond_10
    invoke-virtual {v2}, Lx0/o;->Q()V

    .line 287
    .line 288
    .line 289
    :goto_b
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 290
    .line 291
    return-object v1

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
