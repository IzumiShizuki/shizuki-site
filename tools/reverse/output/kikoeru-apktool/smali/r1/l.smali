.class public final Lr1/l;
.super Lr1/c;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final d:[F

.field public static final e:[F

.field public static final f:[F

.field public static final g:[F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v1, v0, [F

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sget-object v2, Lr1/a;->b:Lr1/a;

    .line 9
    .line 10
    iget-object v2, v2, Lr1/a;->a:[F

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    new-array v4, v3, [F

    .line 14
    .line 15
    fill-array-data v4, :array_1

    .line 16
    .line 17
    .line 18
    new-array v3, v3, [F

    .line 19
    .line 20
    fill-array-data v3, :array_2

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v4, v3}, Lr1/j;->c([F[F[F)[F

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v1, v2}, Lr1/j;->g([F[F)[F

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sput-object v1, Lr1/l;->d:[F

    .line 32
    .line 33
    new-array v0, v0, [F

    .line 34
    .line 35
    fill-array-data v0, :array_3

    .line 36
    .line 37
    .line 38
    sput-object v0, Lr1/l;->e:[F

    .line 39
    .line 40
    invoke-static {v1}, Lr1/j;->f([F)[F

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sput-object v1, Lr1/l;->f:[F

    .line 45
    .line 46
    invoke-static {v0}, Lr1/j;->f([F)[F

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lr1/l;->g:[F

    .line 51
    .line 52
    return-void

    .line 53
    :array_0
    .array-data 4
        0x3f51a598
        0x3d071acd
        0x3d456dae
        0x3eb94699
        0x3f6de762
        0x3e875b04
        -0x41fc0c33
        0x3d140d73
        0x3f22441b
    .end array-data

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
    :array_1
    .array-data 4
        0x3f76d699    # 0.964212f
        0x3f800000    # 1.0f
        0x3f533f8a
    .end array-data

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
    :array_2
    .array-data 4
        0x3f734f49
        0x3f800000    # 1.0f
        0x3f8b6117
    .end array-data

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
    :array_3
    .array-data 4
        0x3e578152
        0x3ffd2f0e
        0x3cd434b4
        0x3f4b2a89
        -0x3fe491f2
        0x3f4863bb
        -0x447a9132
        0x3ee6b438
        -0x40b0faa0
    .end array-data
    .line 96
    .line 97
    .line 98
.end method


# virtual methods
.method public final a(I)F
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/high16 p1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    const/high16 p1, 0x3f000000    # 0.5f

    .line 7
    .line 8
    return p1
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

.method public final b(I)F
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    const/high16 p1, -0x41000000    # -0.5f

    .line 6
    .line 7
    return p1
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

.method public final d(FFF)J
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-gez v1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpl-float v1, p1, v0

    .line 10
    .line 11
    if-lez v1, :cond_1

    .line 12
    .line 13
    const/high16 p1, 0x3f800000    # 1.0f

    .line 14
    .line 15
    :cond_1
    const/high16 v0, -0x41000000    # -0.5f

    .line 16
    .line 17
    cmpg-float v1, p2, v0

    .line 18
    .line 19
    if-gez v1, :cond_2

    .line 20
    .line 21
    const/high16 p2, -0x41000000    # -0.5f

    .line 22
    .line 23
    :cond_2
    const/high16 v1, 0x3f000000    # 0.5f

    .line 24
    .line 25
    cmpl-float v2, p2, v1

    .line 26
    .line 27
    if-lez v2, :cond_3

    .line 28
    .line 29
    const/high16 p2, 0x3f000000    # 0.5f

    .line 30
    .line 31
    :cond_3
    cmpg-float v2, p3, v0

    .line 32
    .line 33
    if-gez v2, :cond_4

    .line 34
    .line 35
    const/high16 p3, -0x41000000    # -0.5f

    .line 36
    .line 37
    :cond_4
    cmpl-float v0, p3, v1

    .line 38
    .line 39
    if-lez v0, :cond_5

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_5
    move v1, p3

    .line 43
    :goto_0
    sget-object p3, Lr1/l;->g:[F

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    aget v2, p3, v0

    .line 47
    .line 48
    mul-float v2, v2, p1

    .line 49
    .line 50
    const/4 v3, 0x3

    .line 51
    aget v4, p3, v3

    .line 52
    .line 53
    mul-float v4, v4, p2

    .line 54
    .line 55
    add-float/2addr v4, v2

    .line 56
    const/4 v2, 0x6

    .line 57
    aget v5, p3, v2

    .line 58
    .line 59
    mul-float v5, v5, v1

    .line 60
    .line 61
    add-float/2addr v5, v4

    .line 62
    const/4 v4, 0x1

    .line 63
    aget v6, p3, v4

    .line 64
    .line 65
    mul-float v6, v6, p1

    .line 66
    .line 67
    const/4 v7, 0x4

    .line 68
    aget v8, p3, v7

    .line 69
    .line 70
    mul-float v8, v8, p2

    .line 71
    .line 72
    add-float/2addr v8, v6

    .line 73
    const/4 v6, 0x7

    .line 74
    aget v9, p3, v6

    .line 75
    .line 76
    mul-float v9, v9, v1

    .line 77
    .line 78
    add-float/2addr v9, v8

    .line 79
    const/4 v8, 0x2

    .line 80
    aget v8, p3, v8

    .line 81
    .line 82
    mul-float v8, v8, p1

    .line 83
    .line 84
    const/4 p1, 0x5

    .line 85
    aget p1, p3, p1

    .line 86
    .line 87
    mul-float p1, p1, p2

    .line 88
    .line 89
    add-float/2addr p1, v8

    .line 90
    const/16 p2, 0x8

    .line 91
    .line 92
    aget p2, p3, p2

    .line 93
    .line 94
    mul-float p2, p2, v1

    .line 95
    .line 96
    add-float/2addr p2, p1

    .line 97
    mul-float p1, v5, v5

    .line 98
    .line 99
    mul-float p1, p1, v5

    .line 100
    .line 101
    mul-float p3, v9, v9

    .line 102
    .line 103
    mul-float p3, p3, v9

    .line 104
    .line 105
    mul-float v1, p2, p2

    .line 106
    .line 107
    mul-float v1, v1, p2

    .line 108
    .line 109
    sget-object p2, Lr1/l;->f:[F

    .line 110
    .line 111
    aget v0, p2, v0

    .line 112
    .line 113
    mul-float v0, v0, p1

    .line 114
    .line 115
    aget v3, p2, v3

    .line 116
    .line 117
    mul-float v3, v3, p3

    .line 118
    .line 119
    add-float/2addr v3, v0

    .line 120
    aget v0, p2, v2

    .line 121
    .line 122
    mul-float v0, v0, v1

    .line 123
    .line 124
    add-float/2addr v0, v3

    .line 125
    aget v2, p2, v4

    .line 126
    .line 127
    mul-float v2, v2, p1

    .line 128
    .line 129
    aget p1, p2, v7

    .line 130
    .line 131
    mul-float p1, p1, p3

    .line 132
    .line 133
    add-float/2addr p1, v2

    .line 134
    aget p2, p2, v6

    .line 135
    .line 136
    mul-float p2, p2, v1

    .line 137
    .line 138
    add-float/2addr p2, p1

    .line 139
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    int-to-long v0, p1

    .line 144
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    int-to-long p1, p1

    .line 149
    const/16 p3, 0x20

    .line 150
    .line 151
    shl-long/2addr v0, p3

    .line 152
    const-wide v2, 0xffffffffL

    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    and-long/2addr p1, v2

    .line 158
    or-long/2addr p1, v0

    .line 159
    return-wide p1
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

.method public final e(FFF)F
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-gez v1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpl-float v1, p1, v0

    .line 10
    .line 11
    if-lez v1, :cond_1

    .line 12
    .line 13
    const/high16 p1, 0x3f800000    # 1.0f

    .line 14
    .line 15
    :cond_1
    const/high16 v0, -0x41000000    # -0.5f

    .line 16
    .line 17
    cmpg-float v1, p2, v0

    .line 18
    .line 19
    if-gez v1, :cond_2

    .line 20
    .line 21
    const/high16 p2, -0x41000000    # -0.5f

    .line 22
    .line 23
    :cond_2
    const/high16 v1, 0x3f000000    # 0.5f

    .line 24
    .line 25
    cmpl-float v2, p2, v1

    .line 26
    .line 27
    if-lez v2, :cond_3

    .line 28
    .line 29
    const/high16 p2, 0x3f000000    # 0.5f

    .line 30
    .line 31
    :cond_3
    cmpg-float v2, p3, v0

    .line 32
    .line 33
    if-gez v2, :cond_4

    .line 34
    .line 35
    const/high16 p3, -0x41000000    # -0.5f

    .line 36
    .line 37
    :cond_4
    cmpl-float v0, p3, v1

    .line 38
    .line 39
    if-lez v0, :cond_5

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_5
    move v1, p3

    .line 43
    :goto_0
    const/4 p3, 0x0

    .line 44
    sget-object v0, Lr1/l;->g:[F

    .line 45
    .line 46
    aget p3, v0, p3

    .line 47
    .line 48
    mul-float p3, p3, p1

    .line 49
    .line 50
    const/4 v2, 0x3

    .line 51
    aget v2, v0, v2

    .line 52
    .line 53
    mul-float v2, v2, p2

    .line 54
    .line 55
    add-float/2addr v2, p3

    .line 56
    const/4 p3, 0x6

    .line 57
    aget p3, v0, p3

    .line 58
    .line 59
    mul-float p3, p3, v1

    .line 60
    .line 61
    add-float/2addr p3, v2

    .line 62
    const/4 v2, 0x1

    .line 63
    aget v2, v0, v2

    .line 64
    .line 65
    mul-float v2, v2, p1

    .line 66
    .line 67
    const/4 v3, 0x4

    .line 68
    aget v3, v0, v3

    .line 69
    .line 70
    mul-float v3, v3, p2

    .line 71
    .line 72
    add-float/2addr v3, v2

    .line 73
    const/4 v2, 0x7

    .line 74
    aget v2, v0, v2

    .line 75
    .line 76
    mul-float v2, v2, v1

    .line 77
    .line 78
    add-float/2addr v2, v3

    .line 79
    const/4 v3, 0x2

    .line 80
    aget v4, v0, v3

    .line 81
    .line 82
    mul-float v4, v4, p1

    .line 83
    .line 84
    const/4 p1, 0x5

    .line 85
    aget v5, v0, p1

    .line 86
    .line 87
    mul-float v5, v5, p2

    .line 88
    .line 89
    add-float/2addr v5, v4

    .line 90
    const/16 p2, 0x8

    .line 91
    .line 92
    aget v0, v0, p2

    .line 93
    .line 94
    mul-float v0, v0, v1

    .line 95
    .line 96
    add-float/2addr v0, v5

    .line 97
    mul-float v1, p3, p3

    .line 98
    .line 99
    mul-float v1, v1, p3

    .line 100
    .line 101
    mul-float p3, v2, v2

    .line 102
    .line 103
    mul-float p3, p3, v2

    .line 104
    .line 105
    mul-float v2, v0, v0

    .line 106
    .line 107
    mul-float v2, v2, v0

    .line 108
    .line 109
    sget-object v0, Lr1/l;->f:[F

    .line 110
    .line 111
    aget v3, v0, v3

    .line 112
    .line 113
    mul-float v3, v3, v1

    .line 114
    .line 115
    aget p1, v0, p1

    .line 116
    .line 117
    mul-float p1, p1, p3

    .line 118
    .line 119
    add-float/2addr p1, v3

    .line 120
    aget p2, v0, p2

    .line 121
    .line 122
    mul-float p2, p2, v2

    .line 123
    .line 124
    add-float/2addr p2, p1

    .line 125
    return p2
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

.method public final f(FFFFLr1/c;)J
    .locals 12

    .line 1
    sget-object v0, Lr1/l;->d:[F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v2, v0, v1

    .line 5
    .line 6
    mul-float v2, v2, p1

    .line 7
    .line 8
    const/4 v3, 0x3

    .line 9
    aget v4, v0, v3

    .line 10
    .line 11
    mul-float v4, v4, p2

    .line 12
    .line 13
    add-float/2addr v4, v2

    .line 14
    const/4 v2, 0x6

    .line 15
    aget v5, v0, v2

    .line 16
    .line 17
    mul-float v5, v5, p3

    .line 18
    .line 19
    add-float/2addr v5, v4

    .line 20
    const/4 v4, 0x1

    .line 21
    aget v6, v0, v4

    .line 22
    .line 23
    mul-float v6, v6, p1

    .line 24
    .line 25
    const/4 v7, 0x4

    .line 26
    aget v8, v0, v7

    .line 27
    .line 28
    mul-float v8, v8, p2

    .line 29
    .line 30
    add-float/2addr v8, v6

    .line 31
    const/4 v6, 0x7

    .line 32
    aget v9, v0, v6

    .line 33
    .line 34
    mul-float v9, v9, p3

    .line 35
    .line 36
    add-float/2addr v9, v8

    .line 37
    const/4 v8, 0x2

    .line 38
    aget v10, v0, v8

    .line 39
    .line 40
    mul-float v10, v10, p1

    .line 41
    .line 42
    const/4 p1, 0x5

    .line 43
    aget v11, v0, p1

    .line 44
    .line 45
    mul-float v11, v11, p2

    .line 46
    .line 47
    add-float/2addr v11, v10

    .line 48
    const/16 p2, 0x8

    .line 49
    .line 50
    aget v0, v0, p2

    .line 51
    .line 52
    mul-float v0, v0, p3

    .line 53
    .line 54
    add-float/2addr v0, v11

    .line 55
    invoke-static {v5}, Landroid/support/v4/media/session/b;->D(F)F

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-static {v9}, Landroid/support/v4/media/session/b;->D(F)F

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    invoke-static {v0}, Landroid/support/v4/media/session/b;->D(F)F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    sget-object v10, Lr1/l;->e:[F

    .line 68
    .line 69
    aget v1, v10, v1

    .line 70
    .line 71
    mul-float v1, v1, v5

    .line 72
    .line 73
    aget v3, v10, v3

    .line 74
    .line 75
    mul-float v3, v3, v9

    .line 76
    .line 77
    add-float/2addr v3, v1

    .line 78
    aget v1, v10, v2

    .line 79
    .line 80
    mul-float v1, v1, v0

    .line 81
    .line 82
    add-float/2addr v1, v3

    .line 83
    aget v2, v10, v4

    .line 84
    .line 85
    mul-float v2, v2, v5

    .line 86
    .line 87
    aget v3, v10, v7

    .line 88
    .line 89
    mul-float v3, v3, v9

    .line 90
    .line 91
    add-float/2addr v3, v2

    .line 92
    aget v2, v10, v6

    .line 93
    .line 94
    mul-float v2, v2, v0

    .line 95
    .line 96
    add-float/2addr v2, v3

    .line 97
    aget v3, v10, v8

    .line 98
    .line 99
    mul-float v3, v3, v5

    .line 100
    .line 101
    aget p1, v10, p1

    .line 102
    .line 103
    mul-float p1, p1, v9

    .line 104
    .line 105
    add-float/2addr p1, v3

    .line 106
    aget p2, v10, p2

    .line 107
    .line 108
    mul-float p2, p2, v0

    .line 109
    .line 110
    add-float/2addr p2, p1

    .line 111
    move/from16 p1, p4

    .line 112
    .line 113
    move-object/from16 v0, p5

    .line 114
    .line 115
    invoke-static {v1, v2, p2, p1, v0}, Lq1/h0;->b(FFFFLr1/c;)J

    .line 116
    .line 117
    .line 118
    move-result-wide p1

    .line 119
    return-wide p1
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
.end method
