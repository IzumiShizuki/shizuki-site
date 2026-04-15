.class public final Lu/q2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final f:Lr/l;


# instance fields
.field public final a:Lr/x1;

.field public b:J

.field public c:Lr/l;

.field public d:Z

.field public e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lr/l;-><init>(F)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lu/q2;->f:Lr/l;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>(Lr/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lr/w1;->a:Lr/v1;

    .line 5
    .line 6
    invoke-interface {p1, v0}, Lr/j;->a(Lr/v1;)Lr/x1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lu/q2;->a:Lr/x1;

    .line 11
    .line 12
    const-wide/high16 v0, -0x8000000000000000L

    .line 13
    .line 14
    iput-wide v0, p0, Lu/q2;->b:J

    .line 15
    .line 16
    sget-object p1, Lu/q2;->f:Lr/l;

    .line 17
    .line 18
    iput-object p1, p0, Lu/q2;->c:Lr/l;

    .line 19
    .line 20
    return-void
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
.method public final a(Lcg/b;La0/o;Lac/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, Lu/p2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lu/p2;

    .line 7
    .line 8
    iget v1, v0, Lu/p2;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lu/p2;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu/p2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lu/p2;-><init>(Lu/q2;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lu/p2;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lu/p2;->j:I

    .line 28
    .line 29
    sget-object v2, Lu/q2;->f:Lr/l;

    .line 30
    .line 31
    const-wide/high16 v3, -0x8000000000000000L

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x2

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x1

    .line 37
    sget-object v9, Lzb/a;->a:Lzb/a;

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    if-eq v1, v8, :cond_2

    .line 42
    .line 43
    if-ne v1, v6, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, Lu/p2;->e:Lub/e;

    .line 46
    .line 47
    check-cast p1, Lic/a;

    .line 48
    .line 49
    iget-object p2, v0, Lu/p2;->d:Lu/q2;

    .line 50
    .line 51
    :try_start_0
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto/16 :goto_8

    .line 58
    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_2
    iget p1, v0, Lu/p2;->g:F

    .line 68
    .line 69
    iget-object p2, v0, Lu/p2;->f:Lic/a;

    .line 70
    .line 71
    iget-object v1, v0, Lu/p2;->e:Lub/e;

    .line 72
    .line 73
    check-cast v1, Lic/k;

    .line 74
    .line 75
    iget-object v10, v0, Lu/p2;->d:Lu/q2;

    .line 76
    .line 77
    :try_start_1
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    .line 79
    .line 80
    move-object p3, v0

    .line 81
    move-object v0, p2

    .line 82
    move-object p2, v1

    .line 83
    move-object v1, p3

    .line 84
    move-object p3, v10

    .line 85
    goto/16 :goto_3

    .line 86
    .line 87
    :catchall_1
    move-exception p1

    .line 88
    move-object p2, v10

    .line 89
    goto/16 :goto_8

    .line 90
    .line 91
    :cond_3
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-boolean p3, p0, Lu/q2;->d:Z

    .line 95
    .line 96
    if-eqz p3, :cond_4

    .line 97
    .line 98
    const-string p3, "animateToZero called while previous animation is running"

    .line 99
    .line 100
    invoke-static {p3}, Lx/a;->c(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    iget-object p3, v0, Lac/c;->b:Lyb/h;

    .line 104
    .line 105
    invoke-static {p3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object v1, Lj1/c;->p:Lj1/c;

    .line 109
    .line 110
    invoke-interface {p3, v1}, Lyb/h;->R(Lyb/g;)Lyb/f;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    check-cast p3, Lj1/r;

    .line 115
    .line 116
    if-eqz p3, :cond_5

    .line 117
    .line 118
    invoke-interface {p3}, Lj1/r;->D()F

    .line 119
    .line 120
    .line 121
    move-result p3

    .line 122
    goto :goto_1

    .line 123
    :cond_5
    const/high16 p3, 0x3f800000    # 1.0f

    .line 124
    .line 125
    :goto_1
    iput-boolean v8, p0, Lu/q2;->d:Z

    .line 126
    .line 127
    move-object v1, v0

    .line 128
    move-object v0, p2

    .line 129
    move-object p2, p1

    .line 130
    move p1, p3

    .line 131
    move-object p3, p0

    .line 132
    :cond_6
    :try_start_2
    iget v10, p3, Lu/q2;->e:F

    .line 133
    .line 134
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    const v11, 0x3c23d70a    # 0.01f

    .line 139
    .line 140
    .line 141
    cmpg-float v10, v10, v11

    .line 142
    .line 143
    if-gez v10, :cond_7

    .line 144
    .line 145
    :goto_2
    move-object p1, p3

    .line 146
    move-object p3, p2

    .line 147
    move-object p2, p1

    .line 148
    move-object p1, v0

    .line 149
    goto :goto_4

    .line 150
    :cond_7
    new-instance v10, Lb0/g1;

    .line 151
    .line 152
    invoke-direct {v10, p3, p1, p2}, Lb0/g1;-><init>(Lu/q2;FLic/k;)V

    .line 153
    .line 154
    .line 155
    iput-object p3, v1, Lu/p2;->d:Lu/q2;

    .line 156
    .line 157
    iput-object p2, v1, Lu/p2;->e:Lub/e;

    .line 158
    .line 159
    iput-object v0, v1, Lu/p2;->f:Lic/a;

    .line 160
    .line 161
    iput p1, v1, Lu/p2;->g:F

    .line 162
    .line 163
    iput v8, v1, Lu/p2;->j:I

    .line 164
    .line 165
    iget-object v11, v1, Lac/c;->b:Lyb/h;

    .line 166
    .line 167
    invoke-static {v11}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v11}, Lx0/v;->s(Lyb/h;)Lx0/s0;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    invoke-interface {v11, v10, v1}, Lx0/s0;->k(Lic/k;Lyb/c;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    if-ne v10, v9, :cond_8

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_8
    :goto_3
    invoke-interface {v0}, Lic/a;->b()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 182
    .line 183
    .line 184
    cmpg-float v10, p1, v5

    .line 185
    .line 186
    if-nez v10, :cond_6

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :goto_4
    :try_start_3
    iget v0, p2, Lu/q2;->e:F

    .line 190
    .line 191
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    cmpg-float v0, v0, v5

    .line 196
    .line 197
    if-nez v0, :cond_9

    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_9
    new-instance v0, Lr/p1;

    .line 201
    .line 202
    const/16 v5, 0xb

    .line 203
    .line 204
    invoke-direct {v0, v5, p2, p3}, Lr/p1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    iput-object p2, v1, Lu/p2;->d:Lu/q2;

    .line 208
    .line 209
    iput-object p1, v1, Lu/p2;->e:Lub/e;

    .line 210
    .line 211
    const/4 p3, 0x0

    .line 212
    iput-object p3, v1, Lu/p2;->f:Lic/a;

    .line 213
    .line 214
    iput v6, v1, Lu/p2;->j:I

    .line 215
    .line 216
    iget-object p3, v1, Lac/c;->b:Lyb/h;

    .line 217
    .line 218
    invoke-static {p3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-static {p3}, Lx0/v;->s(Lyb/h;)Lx0/s0;

    .line 222
    .line 223
    .line 224
    move-result-object p3

    .line 225
    invoke-interface {p3, v0, v1}, Lx0/s0;->k(Lic/k;Lyb/c;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p3

    .line 229
    if-ne p3, v9, :cond_a

    .line 230
    .line 231
    :goto_5
    return-object v9

    .line 232
    :cond_a
    :goto_6
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 233
    .line 234
    .line 235
    :goto_7
    iput-wide v3, p2, Lu/q2;->b:J

    .line 236
    .line 237
    iput-object v2, p2, Lu/q2;->c:Lr/l;

    .line 238
    .line 239
    iput-boolean v7, p2, Lu/q2;->d:Z

    .line 240
    .line 241
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 242
    .line 243
    return-object p1

    .line 244
    :catchall_2
    move-exception p1

    .line 245
    move-object p2, p3

    .line 246
    :goto_8
    iput-wide v3, p2, Lu/q2;->b:J

    .line 247
    .line 248
    iput-object v2, p2, Lu/q2;->c:Lr/l;

    .line 249
    .line 250
    iput-boolean v7, p2, Lu/q2;->d:Z

    .line 251
    .line 252
    throw p1
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
