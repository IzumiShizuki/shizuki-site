.class public final Ln7/m0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final l:[Ljava/lang/String;


# instance fields
.field public final a:Lcom/cnl/kikoeru/data/db/AppDatabase_Impl;

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Z

.field public final e:Lde/h;

.field public final f:Ljava/util/LinkedHashMap;

.field public final g:[Ljava/lang/String;

.field public final h:Lb5/d0;

.field public final i:Li7/p2;

.field public final j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public k:Lic/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "UPDATE"

    .line 2
    .line 3
    const-string v1, "DELETE"

    .line 4
    .line 5
    const-string v2, "INSERT"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Ln7/m0;->l:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
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

.method public constructor <init>(Lcom/cnl/kikoeru/data/db/AppDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;ZLde/h;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln7/m0;->a:Lcom/cnl/kikoeru/data/db/AppDatabase_Impl;

    .line 5
    .line 6
    iput-object p2, p0, Ln7/m0;->b:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    iput-object p3, p0, Ln7/m0;->c:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    iput-boolean p5, p0, Ln7/m0;->d:Z

    .line 11
    .line 12
    iput-object p6, p0, Ln7/m0;->e:Lde/h;

    .line 13
    .line 14
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Ln7/m0;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    new-instance p1, Li9/f;

    .line 23
    .line 24
    const/16 p3, 0x14

    .line 25
    .line 26
    invoke-direct {p1, p3}, Li9/f;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ln7/m0;->k:Lic/a;

    .line 30
    .line 31
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Ln7/m0;->f:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    array-length p1, p4

    .line 39
    new-array p3, p1, [Ljava/lang/String;

    .line 40
    .line 41
    :goto_0
    const-string p5, "toLowerCase(...)"

    .line 42
    .line 43
    if-ge p2, p1, :cond_2

    .line 44
    .line 45
    aget-object p6, p4, p2

    .line 46
    .line 47
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 48
    .line 49
    invoke-virtual {p6, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p6

    .line 53
    invoke-static {p6, p5}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v2, p0, Ln7/m0;->f:Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-interface {v2, p6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Ln7/m0;->b:Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    aget-object v2, p4, p2

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v1, :cond_0

    .line 76
    .line 77
    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0, p5}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_0
    const/4 v0, 0x0

    .line 86
    :goto_1
    if-nez v0, :cond_1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_1
    move-object p6, v0

    .line 90
    :goto_2
    aput-object p6, p3, p2

    .line 91
    .line 92
    add-int/lit8 p2, p2, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    iput-object p3, p0, Ln7/m0;->g:[Ljava/lang/String;

    .line 96
    .line 97
    iget-object p1, p0, Ln7/m0;->b:Ljava/util/LinkedHashMap;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :cond_3
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-eqz p2, :cond_4

    .line 112
    .line 113
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    check-cast p2, Ljava/util/Map$Entry;

    .line 118
    .line 119
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    check-cast p3, Ljava/lang/String;

    .line 124
    .line 125
    sget-object p4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 126
    .line 127
    invoke-virtual {p3, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    invoke-static {p3, p5}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iget-object p6, p0, Ln7/m0;->f:Ljava/util/LinkedHashMap;

    .line 135
    .line 136
    invoke-interface {p6, p3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p6

    .line 140
    if-eqz p6, :cond_3

    .line 141
    .line 142
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    check-cast p2, Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {p2, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-static {p2, p5}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object p4, p0, Ln7/m0;->f:Ljava/util/LinkedHashMap;

    .line 156
    .line 157
    invoke-static {p3, p4}, Lvb/w;->r(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    invoke-interface {p4, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_4
    new-instance p1, Lb5/d0;

    .line 166
    .line 167
    iget-object p2, p0, Ln7/m0;->g:[Ljava/lang/String;

    .line 168
    .line 169
    array-length p2, p2

    .line 170
    invoke-direct {p1, p2}, Lb5/d0;-><init>(I)V

    .line 171
    .line 172
    .line 173
    iput-object p1, p0, Ln7/m0;->h:Lb5/d0;

    .line 174
    .line 175
    new-instance p1, Li7/p2;

    .line 176
    .line 177
    iget-object p2, p0, Ln7/m0;->g:[Ljava/lang/String;

    .line 178
    .line 179
    array-length p2, p2

    .line 180
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 181
    .line 182
    .line 183
    new-array p2, p2, [I

    .line 184
    .line 185
    invoke-static {p2}, Llf/p0;->c(Ljava/lang/Object;)Llf/b1;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    iput-object p2, p1, Li7/p2;->a:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object p1, p0, Ln7/m0;->i:Li7/p2;

    .line 192
    .line 193
    return-void
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
.end method

.method public static final a(Ln7/m0;Ln7/q;Lac/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Ln7/c0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ln7/c0;

    .line 7
    .line 8
    iget v1, v0, Ln7/c0;->g:I

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
    iput v1, v0, Ln7/c0;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ln7/c0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ln7/c0;-><init>(Ln7/m0;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Ln7/c0;->e:Ljava/lang/Object;

    .line 26
    .line 27
    iget p2, v0, Ln7/c0;->g:I

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    const/4 v2, 0x1

    .line 31
    sget-object v3, Lzb/a;->a:Lzb/a;

    .line 32
    .line 33
    if-eqz p2, :cond_3

    .line 34
    .line 35
    if-eq p2, v2, :cond_2

    .line 36
    .line 37
    if-ne p2, v1, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Ln7/c0;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/util/Set;

    .line 42
    .line 43
    invoke-static {p0}, Lub/a;->f(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_2
    iget-object p1, v0, Ln7/c0;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Ln7/q;

    .line 58
    .line 59
    invoke-static {p0}, Lub/a;->f(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p0}, Lub/a;->f(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance p0, Lm0/l3;

    .line 67
    .line 68
    const/16 p2, 0xc

    .line 69
    .line 70
    invoke-direct {p0, p2}, Lm0/l3;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput-object p1, v0, Ln7/c0;->d:Ljava/lang/Object;

    .line 74
    .line 75
    iput v2, v0, Ln7/c0;->g:I

    .line 76
    .line 77
    const-string p2, "SELECT * FROM room_table_modification_log WHERE invalidated = 1"

    .line 78
    .line 79
    invoke-interface {p1, p2, p0, v0}, Ln7/q;->a(Ljava/lang/String;Lic/k;Lac/c;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    if-ne p0, v3, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    :goto_1
    check-cast p0, Ljava/util/Set;

    .line 87
    .line 88
    move-object p2, p0

    .line 89
    check-cast p2, Ljava/util/Collection;

    .line 90
    .line 91
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-nez p2, :cond_5

    .line 96
    .line 97
    iput-object p0, v0, Ln7/c0;->d:Ljava/lang/Object;

    .line 98
    .line 99
    iput v1, v0, Ln7/c0;->g:I

    .line 100
    .line 101
    const-string p2, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"

    .line 102
    .line 103
    invoke-static {p1, p2, v0}, Ln7/b0;->j(Ln7/q;Ljava/lang/String;Lac/c;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v3, :cond_5

    .line 108
    .line 109
    :goto_2
    return-object v3

    .line 110
    :cond_5
    return-object p0
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static final b(Ln7/m0;Ln7/a0;ILac/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p3, Ln7/i0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p3

    .line 9
    check-cast v0, Ln7/i0;

    .line 10
    .line 11
    iget v1, v0, Ln7/i0;->m:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Ln7/i0;->m:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Ln7/i0;

    .line 24
    .line 25
    invoke-direct {v0, p0, p3}, Ln7/i0;-><init>(Ln7/m0;Lac/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p3, v0, Ln7/i0;->k:Ljava/lang/Object;

    .line 29
    .line 30
    iget v1, v0, Ln7/i0;->m:I

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    const/4 v3, 0x1

    .line 34
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iget p0, v0, Ln7/i0;->j:I

    .line 43
    .line 44
    iget p1, v0, Ln7/i0;->i:I

    .line 45
    .line 46
    iget p2, v0, Ln7/i0;->h:I

    .line 47
    .line 48
    iget-object v1, v0, Ln7/i0;->g:[Ljava/lang/String;

    .line 49
    .line 50
    iget-object v5, v0, Ln7/i0;->f:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v6, v0, Ln7/i0;->e:Ln7/q;

    .line 53
    .line 54
    iget-object v7, v0, Ln7/i0;->d:Ln7/m0;

    .line 55
    .line 56
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p0

    .line 69
    :cond_2
    iget p2, v0, Ln7/i0;->h:I

    .line 70
    .line 71
    iget-object p1, v0, Ln7/i0;->e:Ln7/q;

    .line 72
    .line 73
    iget-object p0, v0, Ln7/i0;->d:Ln7/m0;

    .line 74
    .line 75
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    new-instance p3, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v1, "INSERT OR IGNORE INTO room_table_modification_log VALUES("

    .line 85
    .line 86
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", 0)"

    .line 93
    .line 94
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    iput-object p0, v0, Ln7/i0;->d:Ln7/m0;

    .line 102
    .line 103
    iput-object p1, v0, Ln7/i0;->e:Ln7/q;

    .line 104
    .line 105
    iput p2, v0, Ln7/i0;->h:I

    .line 106
    .line 107
    iput v3, v0, Ln7/i0;->m:I

    .line 108
    .line 109
    invoke-static {p1, p3, v0}, Ln7/b0;->j(Ln7/q;Ljava/lang/String;Lac/c;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    if-ne p3, v4, :cond_4

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_4
    :goto_1
    iget-object p3, p0, Ln7/m0;->g:[Ljava/lang/String;

    .line 117
    .line 118
    aget-object p3, p3, p2

    .line 119
    .line 120
    sget-object v1, Ln7/m0;->l:[Ljava/lang/String;

    .line 121
    .line 122
    const/4 v5, 0x0

    .line 123
    const/4 v6, 0x3

    .line 124
    move-object v7, p0

    .line 125
    move-object v6, p1

    .line 126
    move-object v5, p3

    .line 127
    const/4 p0, 0x3

    .line 128
    const/4 p1, 0x0

    .line 129
    :goto_2
    if-ge p1, p0, :cond_7

    .line 130
    .line 131
    aget-object p3, v1, p1

    .line 132
    .line 133
    iget-boolean v8, v7, Ln7/m0;->d:Z

    .line 134
    .line 135
    if-eqz v8, :cond_5

    .line 136
    .line 137
    const-string v8, "TEMP"

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_5
    const-string v8, ""

    .line 141
    .line 142
    :goto_3
    new-instance v9, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v10, "room_table_modification_trigger_"

    .line 145
    .line 146
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const/16 v10, 0x5f

    .line 153
    .line 154
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v9, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    new-instance v10, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    const-string v11, "CREATE "

    .line 167
    .line 168
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v8, " TRIGGER IF NOT EXISTS `"

    .line 175
    .line 176
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v8, "` AFTER "

    .line 183
    .line 184
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v8, " ON `"

    .line 188
    .line 189
    const-string v9, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "

    .line 190
    .line 191
    invoke-static {v10, p3, v8, v5, v9}, Lj2/h0;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v10, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string p3, " AND invalidated = 0; END"

    .line 198
    .line 199
    invoke-virtual {v10, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p3

    .line 206
    iput-object v7, v0, Ln7/i0;->d:Ln7/m0;

    .line 207
    .line 208
    iput-object v6, v0, Ln7/i0;->e:Ln7/q;

    .line 209
    .line 210
    iput-object v5, v0, Ln7/i0;->f:Ljava/lang/String;

    .line 211
    .line 212
    iput-object v1, v0, Ln7/i0;->g:[Ljava/lang/String;

    .line 213
    .line 214
    iput p2, v0, Ln7/i0;->h:I

    .line 215
    .line 216
    iput p1, v0, Ln7/i0;->i:I

    .line 217
    .line 218
    iput p0, v0, Ln7/i0;->j:I

    .line 219
    .line 220
    iput v2, v0, Ln7/i0;->m:I

    .line 221
    .line 222
    invoke-static {v6, p3, v0}, Ln7/b0;->j(Ln7/q;Ljava/lang/String;Lac/c;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p3

    .line 226
    if-ne p3, v4, :cond_6

    .line 227
    .line 228
    :goto_4
    return-object v4

    .line 229
    :cond_6
    :goto_5
    add-int/2addr p1, v3

    .line 230
    goto :goto_2

    .line 231
    :cond_7
    sget-object p0, Lub/a0;->a:Lub/a0;

    .line 232
    .line 233
    return-object p0
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

.method public static final c(Ln7/m0;Ln7/a0;ILac/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p3, Ln7/j0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p3

    .line 9
    check-cast v0, Ln7/j0;

    .line 10
    .line 11
    iget v1, v0, Ln7/j0;->k:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Ln7/j0;->k:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Ln7/j0;

    .line 24
    .line 25
    invoke-direct {v0, p0, p3}, Ln7/j0;-><init>(Ln7/m0;Lac/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p3, v0, Ln7/j0;->i:Ljava/lang/Object;

    .line 29
    .line 30
    iget v1, v0, Ln7/j0;->k:I

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v2, :cond_1

    .line 36
    .line 37
    iget p0, v0, Ln7/j0;->h:I

    .line 38
    .line 39
    iget p1, v0, Ln7/j0;->g:I

    .line 40
    .line 41
    iget-object p2, v0, Ln7/j0;->f:[Ljava/lang/String;

    .line 42
    .line 43
    iget-object v1, v0, Ln7/j0;->e:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v3, v0, Ln7/j0;->d:Ln7/q;

    .line 46
    .line 47
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object p3, p2

    .line 51
    move-object p2, v3

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0

    .line 61
    :cond_2
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, Ln7/m0;->g:[Ljava/lang/String;

    .line 65
    .line 66
    aget-object p0, p0, p2

    .line 67
    .line 68
    sget-object p2, Ln7/m0;->l:[Ljava/lang/String;

    .line 69
    .line 70
    const/4 p3, 0x0

    .line 71
    const/4 v1, 0x3

    .line 72
    move-object v1, p0

    .line 73
    move-object p3, p2

    .line 74
    const/4 p0, 0x3

    .line 75
    move-object p2, p1

    .line 76
    const/4 p1, 0x0

    .line 77
    :goto_1
    if-ge p1, p0, :cond_4

    .line 78
    .line 79
    aget-object v3, p3, p1

    .line 80
    .line 81
    new-instance v4, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string v5, "room_table_modification_trigger_"

    .line 84
    .line 85
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const/16 v5, 0x5f

    .line 92
    .line 93
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    const-string v4, "DROP TRIGGER IF EXISTS `"

    .line 104
    .line 105
    const/16 v5, 0x60

    .line 106
    .line 107
    invoke-static {v5, v4, v3}, La0/c;->G(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    iput-object p2, v0, Ln7/j0;->d:Ln7/q;

    .line 112
    .line 113
    iput-object v1, v0, Ln7/j0;->e:Ljava/lang/String;

    .line 114
    .line 115
    iput-object p3, v0, Ln7/j0;->f:[Ljava/lang/String;

    .line 116
    .line 117
    iput p1, v0, Ln7/j0;->g:I

    .line 118
    .line 119
    iput p0, v0, Ln7/j0;->h:I

    .line 120
    .line 121
    iput v2, v0, Ln7/j0;->k:I

    .line 122
    .line 123
    invoke-static {p2, v3, v0}, Ln7/b0;->j(Ln7/q;Ljava/lang/String;Lac/c;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 128
    .line 129
    if-ne v3, v4, :cond_3

    .line 130
    .line 131
    return-object v4

    .line 132
    :cond_3
    :goto_2
    add-int/2addr p1, v2

    .line 133
    goto :goto_1

    .line 134
    :cond_4
    sget-object p0, Lub/a0;->a:Lub/a0;

    .line 135
    .line 136
    return-object p0
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


# virtual methods
.method public final d(Lac/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Ln7/f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ln7/f0;

    .line 7
    .line 8
    iget v1, v0, Ln7/f0;->h:I

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
    iput v1, v0, Ln7/f0;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ln7/f0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ln7/f0;-><init>(Ln7/m0;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ln7/f0;->f:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ln7/f0;->h:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object v1, v0, Ln7/f0;->e:Lm0/w;

    .line 35
    .line 36
    iget-object v0, v0, Ln7/f0;->d:Ln7/m0;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Ln7/m0;->a:Lcom/cnl/kikoeru/data/db/AppDatabase_Impl;

    .line 56
    .line 57
    iget-object v1, p1, Ln7/v;->g:Lm0/w;

    .line 58
    .line 59
    invoke-virtual {v1}, Lm0/w;->t()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    sget-object v4, Lvb/t;->a:Lvb/t;

    .line 64
    .line 65
    if-eqz v3, :cond_7

    .line 66
    .line 67
    :try_start_1
    iget-object v3, p0, Ln7/m0;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    invoke-virtual {v3, v2, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 71
    .line 72
    .line 73
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    if-nez v3, :cond_3

    .line 75
    .line 76
    invoke-virtual {v1}, Lm0/w;->L()V

    .line 77
    .line 78
    .line 79
    return-object v4

    .line 80
    :cond_3
    :try_start_2
    iget-object v3, p0, Ln7/m0;->k:Lic/a;

    .line 81
    .line 82
    invoke-interface {v3}, Lic/a;->b()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    if-nez v3, :cond_4

    .line 93
    .line 94
    invoke-virtual {v1}, Lm0/w;->L()V

    .line 95
    .line 96
    .line 97
    return-object v4

    .line 98
    :cond_4
    :try_start_3
    new-instance v3, Ln7/g0;

    .line 99
    .line 100
    const/4 v4, 0x0

    .line 101
    const/4 v6, 0x1

    .line 102
    invoke-direct {v3, p0, v4, v6}, Ln7/g0;-><init>(Ln7/m0;Lyb/c;I)V

    .line 103
    .line 104
    .line 105
    iput-object p0, v0, Ln7/f0;->d:Ln7/m0;

    .line 106
    .line 107
    iput-object v1, v0, Ln7/f0;->e:Lm0/w;

    .line 108
    .line 109
    iput v2, v0, Ln7/f0;->h:I

    .line 110
    .line 111
    invoke-virtual {p1, v5, v3, v0}, Ln7/v;->n(ZLic/n;Lac/c;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 115
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 116
    .line 117
    if-ne p1, v0, :cond_5

    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_5
    move-object v0, p0

    .line 121
    :goto_1
    :try_start_4
    check-cast p1, Ljava/util/Set;

    .line 122
    .line 123
    move-object v2, p1

    .line 124
    check-cast v2, Ljava/util/Collection;

    .line 125
    .line 126
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_6

    .line 131
    .line 132
    iget-object v2, v0, Ln7/m0;->i:Li7/p2;

    .line 133
    .line 134
    invoke-virtual {v2, p1}, Li7/p2;->y(Ljava/util/Set;)V

    .line 135
    .line 136
    .line 137
    iget-object v0, v0, Ln7/m0;->e:Lde/h;

    .line 138
    .line 139
    invoke-virtual {v0, p1}, Lde/h;->a(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 140
    .line 141
    .line 142
    :cond_6
    invoke-virtual {v1}, Lm0/w;->L()V

    .line 143
    .line 144
    .line 145
    return-object p1

    .line 146
    :goto_2
    invoke-virtual {v1}, Lm0/w;->L()V

    .line 147
    .line 148
    .line 149
    throw p1

    .line 150
    :cond_7
    return-object v4
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

.method public final e([Ljava/lang/String;Lic/a;Lic/a;Lac/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p4, Ln7/h0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Ln7/h0;

    .line 7
    .line 8
    iget v1, v0, Ln7/h0;->h:I

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
    iput v1, v0, Ln7/h0;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ln7/h0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Ln7/h0;-><init>(Ln7/m0;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Ln7/h0;->f:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ln7/h0;->h:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, Ln7/h0;->e:[I

    .line 35
    .line 36
    iget-object p3, v0, Ln7/h0;->d:Lic/a;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p4}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_4

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p4}, Lub/a;->f(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ln7/m0;->h([Ljava/lang/String;)Lub/k;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object p1, p1, Lub/k;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, [I

    .line 62
    .line 63
    invoke-interface {p2}, Lic/a;->b()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :try_start_1
    iput-object p3, v0, Ln7/h0;->d:Lic/a;

    .line 67
    .line 68
    iput-object p1, v0, Ln7/h0;->e:[I

    .line 69
    .line 70
    iput v2, v0, Ln7/h0;->h:I

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Ln7/m0;->d(Lac/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 77
    .line 78
    if-ne p4, p2, :cond_3

    .line 79
    .line 80
    return-object p2

    .line 81
    :cond_3
    :goto_1
    :try_start_2
    check-cast p4, Ljava/util/Set;

    .line 82
    .line 83
    array-length p2, p1

    .line 84
    const/4 v0, 0x0

    .line 85
    if-nez p2, :cond_5

    .line 86
    .line 87
    check-cast p4, Ljava/util/Collection;

    .line 88
    .line 89
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_4

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    const/4 v2, 0x0

    .line 97
    goto :goto_3

    .line 98
    :cond_5
    array-length p2, p1

    .line 99
    const/4 v1, 0x0

    .line 100
    :goto_2
    if-ge v1, p2, :cond_4

    .line 101
    .line 102
    aget v3, p1, v1

    .line 103
    .line 104
    new-instance v4, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-direct {v4, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p4, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_6

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    invoke-interface {p3}, Lic/a;->b()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    return-object p1

    .line 127
    :goto_4
    invoke-interface {p3}, Lic/a;->b()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    throw p1
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

.method public final f(Lic/a;Lic/a;)V
    .locals 4

    .line 1
    const-string v0, "onRefreshScheduled"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onRefreshCompleted"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x1

    .line 13
    iget-object v2, p0, Ln7/m0;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Ln7/m0;->a:Lcom/cnl/kikoeru/data/db/AppDatabase_Impl;

    .line 25
    .line 26
    invoke-virtual {p1}, Ln7/v;->e()Lhf/y;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Lhf/x;

    .line 31
    .line 32
    invoke-direct {v0}, Lhf/x;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v1, Llf/w0;

    .line 36
    .line 37
    const/16 v2, 0xb

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {v1, p0, p2, v3, v2}, Llf/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 41
    .line 42
    .line 43
    const/4 p2, 0x2

    .line 44
    invoke-static {p1, v0, v3, v1, p2}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
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

.method public final g(Lac/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Ln7/k0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ln7/k0;

    .line 7
    .line 8
    iget v1, v0, Ln7/k0;->g:I

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
    iput v1, v0, Ln7/k0;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ln7/k0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ln7/k0;-><init>(Ln7/m0;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ln7/k0;->e:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ln7/k0;->g:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object v0, v0, Ln7/k0;->d:Lm0/w;

    .line 35
    .line 36
    :try_start_0
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Ln7/m0;->a:Lcom/cnl/kikoeru/data/db/AppDatabase_Impl;

    .line 54
    .line 55
    iget-object v1, p1, Ln7/v;->g:Lm0/w;

    .line 56
    .line 57
    invoke-virtual {v1}, Lm0/w;->t()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    :try_start_1
    new-instance v3, Ln7/g0;

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x2

    .line 67
    invoke-direct {v3, p0, v4, v5}, Ln7/g0;-><init>(Ln7/m0;Lyb/c;I)V

    .line 68
    .line 69
    .line 70
    iput-object v1, v0, Ln7/k0;->d:Lm0/w;

    .line 71
    .line 72
    iput v2, v0, Ln7/k0;->g:I

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-virtual {p1, v2, v3, v0}, Ln7/v;->n(ZLic/n;Lac/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 80
    .line 81
    if-ne p1, v0, :cond_3

    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_3
    move-object v0, v1

    .line 85
    :goto_1
    invoke-virtual {v0}, Lm0/w;->L()V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :catchall_1
    move-exception p1

    .line 90
    move-object v0, v1

    .line 91
    :goto_2
    invoke-virtual {v0}, Lm0/w;->L()V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_4
    :goto_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 96
    .line 97
    return-object p1
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final h([Ljava/lang/String;)Lub/k;
    .locals 7

    .line 1
    const-string v0, "names"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lwb/g;

    .line 7
    .line 8
    invoke-direct {v0}, Lwb/g;-><init>()V

    .line 9
    .line 10
    .line 11
    array-length v1, p1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    const-string v4, "toLowerCase(...)"

    .line 15
    .line 16
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    aget-object v5, p1, v3

    .line 19
    .line 20
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 21
    .line 22
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-static {v6, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v4, p0, Ln7/m0;->c:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-virtual {v4, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ljava/util/Set;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    check-cast v4, Ljava/util/Collection;

    .line 40
    .line 41
    invoke-virtual {v0, v4}, Lwb/g;->addAll(Ljava/util/Collection;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {v0, v5}, Lwb/g;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {v0}, Lud/e;->c(Lwb/g;)Lwb/g;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-array v0, v2, [Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, [Ljava/lang/String;

    .line 62
    .line 63
    array-length v0, p1

    .line 64
    new-array v1, v0, [I

    .line 65
    .line 66
    :goto_2
    if-ge v2, v0, :cond_3

    .line 67
    .line 68
    aget-object v3, p1, v2

    .line 69
    .line 70
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 71
    .line 72
    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-static {v5, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v6, p0, Ln7/m0;->f:Ljava/util/LinkedHashMap;

    .line 80
    .line 81
    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Ljava/lang/Integer;

    .line 86
    .line 87
    if-eqz v5, :cond_2

    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    aput v3, v1, v2

    .line 94
    .line 95
    add-int/lit8 v2, v2, 0x1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 99
    .line 100
    const-string v0, "There is no table with name "

    .line 101
    .line 102
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_3
    new-instance v0, Lub/k;

    .line 111
    .line 112
    invoke-direct {v0, p1, v1}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    return-object v0
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
.end method
