.class public final Ln8/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lh8/h;

.field public final b:Lx8/i;

.field public final c:Lm0/w;

.field public final d:Li7/p2;


# direct methods
.method public constructor <init>(Lh8/h;Lx8/i;Lm0/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln8/g;->a:Lh8/h;

    .line 5
    .line 6
    iput-object p2, p0, Ln8/g;->b:Lx8/i;

    .line 7
    .line 8
    iput-object p3, p0, Ln8/g;->c:Lm0/w;

    .line 9
    .line 10
    new-instance p2, Li7/p2;

    .line 11
    .line 12
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p2, Li7/p2;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p2, p0, Ln8/g;->d:Li7/p2;

    .line 18
    .line 19
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

.method public static final a(Ln8/g;Lm8/m;Lh8/b;Ls8/i;Ljava/lang/Object;Ls8/m;Lh8/c;Lac/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p7, Ln8/b;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p7

    .line 9
    check-cast v0, Ln8/b;

    .line 10
    .line 11
    iget v1, v0, Ln8/b;->n:I

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
    iput v1, v0, Ln8/b;->n:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Ln8/b;

    .line 24
    .line 25
    invoke-direct {v0, p0, p7}, Ln8/b;-><init>(Ln8/g;Lac/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p7, v0, Ln8/b;->l:Ljava/lang/Object;

    .line 29
    .line 30
    iget v1, v0, Ln8/b;->n:I

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v3, :cond_1

    .line 37
    .line 38
    iget p0, v0, Ln8/b;->k:I

    .line 39
    .line 40
    iget-object p1, v0, Ln8/b;->j:Lh8/c;

    .line 41
    .line 42
    iget-object p2, v0, Ln8/b;->i:Ls8/m;

    .line 43
    .line 44
    iget-object p3, v0, Ln8/b;->h:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object p4, v0, Ln8/b;->g:Ls8/i;

    .line 47
    .line 48
    iget-object p5, v0, Ln8/b;->f:Lh8/b;

    .line 49
    .line 50
    iget-object p6, v0, Ln8/b;->e:Lm8/m;

    .line 51
    .line 52
    iget-object v1, v0, Ln8/b;->d:Ln8/g;

    .line 53
    .line 54
    invoke-static {p7}, Lub/a;->f(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-object v7, v1

    .line 58
    move v1, p0

    .line 59
    move-object p0, v7

    .line 60
    move-object v7, p6

    .line 61
    move-object p6, p1

    .line 62
    move-object p1, v7

    .line 63
    move-object v7, p5

    .line 64
    move-object p5, p2

    .line 65
    move-object p2, v7

    .line 66
    move-object v7, p4

    .line 67
    move-object p4, p3

    .line 68
    move-object p3, v7

    .line 69
    goto :goto_3

    .line 70
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_2
    invoke-static {p7}, Lub/a;->f(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/4 p7, 0x0

    .line 82
    :goto_1
    iget-object v1, p0, Ln8/g;->a:Lh8/h;

    .line 83
    .line 84
    iget-object v1, p2, Lh8/b;->e:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-ge p7, v4, :cond_3

    .line 91
    .line 92
    invoke-interface {v1, p7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lj8/c;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    new-instance v4, Lj8/e;

    .line 102
    .line 103
    iget-object v5, p1, Lm8/m;->a:Lj8/n;

    .line 104
    .line 105
    iget-object v6, v1, Lj8/c;->b:Lrf/i;

    .line 106
    .line 107
    iget-object v1, v1, Lj8/c;->a:Lj8/j;

    .line 108
    .line 109
    invoke-direct {v4, v5, p5, v6, v1}, Lj8/e;-><init>(Lj8/n;Ls8/m;Lrf/e;Lj8/j;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p7

    .line 116
    new-instance v1, Lub/k;

    .line 117
    .line 118
    invoke-direct {v1, v4, p7}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    move-object v1, v2

    .line 123
    :goto_2
    if-eqz v1, :cond_8

    .line 124
    .line 125
    iget-object p7, v1, Lub/k;->a:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p7, Lj8/e;

    .line 128
    .line 129
    iget-object v1, v1, Lub/k;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, Ljava/lang/Number;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    add-int/2addr v1, v3

    .line 138
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iput-object p0, v0, Ln8/b;->d:Ln8/g;

    .line 142
    .line 143
    iput-object p1, v0, Ln8/b;->e:Lm8/m;

    .line 144
    .line 145
    iput-object p2, v0, Ln8/b;->f:Lh8/b;

    .line 146
    .line 147
    iput-object p3, v0, Ln8/b;->g:Ls8/i;

    .line 148
    .line 149
    iput-object p4, v0, Ln8/b;->h:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object p5, v0, Ln8/b;->i:Ls8/m;

    .line 152
    .line 153
    iput-object p6, v0, Ln8/b;->j:Lh8/c;

    .line 154
    .line 155
    iput v1, v0, Ln8/b;->k:I

    .line 156
    .line 157
    iput v3, v0, Ln8/b;->n:I

    .line 158
    .line 159
    invoke-virtual {p7, v0}, Lj8/e;->a(Lac/c;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p7

    .line 163
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 164
    .line 165
    if-ne p7, v4, :cond_4

    .line 166
    .line 167
    return-object v4

    .line 168
    :cond_4
    :goto_3
    check-cast p7, Lj8/g;

    .line 169
    .line 170
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    if-eqz p7, :cond_7

    .line 174
    .line 175
    new-instance p0, Ln8/a;

    .line 176
    .line 177
    iget-object p2, p7, Lj8/g;->a:Landroid/graphics/drawable/BitmapDrawable;

    .line 178
    .line 179
    iget-boolean p3, p7, Lj8/g;->b:Z

    .line 180
    .line 181
    iget-object p4, p1, Lm8/m;->c:Lj8/f;

    .line 182
    .line 183
    iget-object p1, p1, Lm8/m;->a:Lj8/n;

    .line 184
    .line 185
    instance-of p5, p1, Lj8/m;

    .line 186
    .line 187
    if-eqz p5, :cond_5

    .line 188
    .line 189
    check-cast p1, Lj8/m;

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_5
    move-object p1, v2

    .line 193
    :goto_4
    if-eqz p1, :cond_6

    .line 194
    .line 195
    iget-object v2, p1, Lj8/m;->c:Ljava/lang/String;

    .line 196
    .line 197
    :cond_6
    invoke-direct {p0, p2, p3, p4, v2}, Ln8/a;-><init>(Landroid/graphics/drawable/Drawable;ZLj8/f;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    return-object p0

    .line 201
    :cond_7
    move p7, v1

    .line 202
    goto :goto_1

    .line 203
    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    const-string p1, "Unable to create a decoder that supports: "

    .line 206
    .line 207
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 218
    .line 219
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw p1
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
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
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
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
.end method

.method public static final b(Ln8/g;Ls8/i;Ljava/lang/Object;Ls8/m;Lh8/c;Lac/c;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    instance-of v2, v1, Ln8/c;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Ln8/c;

    .line 11
    .line 12
    iget v3, v2, Ln8/c;->n:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Ln8/c;->n:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Ln8/c;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Ln8/c;-><init>(Ln8/g;Lac/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v6, Ln8/c;->l:Ljava/lang/Object;

    .line 32
    .line 33
    iget v2, v6, Ln8/c;->n:I

    .line 34
    .line 35
    const/4 v7, 0x3

    .line 36
    const/4 v8, 0x2

    .line 37
    const/4 v3, 0x1

    .line 38
    const/4 v9, 0x0

    .line 39
    sget-object v10, Lzb/a;->a:Lzb/a;

    .line 40
    .line 41
    if-eqz v2, :cond_4

    .line 42
    .line 43
    if-eq v2, v3, :cond_3

    .line 44
    .line 45
    if-eq v2, v8, :cond_2

    .line 46
    .line 47
    if-ne v2, v7, :cond_1

    .line 48
    .line 49
    invoke-static {v1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_9

    .line 53
    .line 54
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_2
    iget-object v2, v6, Ln8/c;->h:Ljc/y;

    .line 63
    .line 64
    iget-object v0, v6, Ln8/c;->g:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ljc/y;

    .line 67
    .line 68
    iget-object v3, v6, Ln8/c;->f:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v3, Lh8/c;

    .line 71
    .line 72
    iget-object v4, v6, Ln8/c;->e:Ls8/i;

    .line 73
    .line 74
    iget-object v5, v6, Ln8/c;->d:Ln8/g;

    .line 75
    .line 76
    :try_start_0
    invoke-static {v1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    goto/16 :goto_3

    .line 80
    .line 81
    :catchall_0
    move-exception v0

    .line 82
    goto/16 :goto_a

    .line 83
    .line 84
    :cond_3
    iget-object v0, v6, Ln8/c;->k:Ljc/y;

    .line 85
    .line 86
    iget-object v2, v6, Ln8/c;->j:Ljc/y;

    .line 87
    .line 88
    iget-object v3, v6, Ln8/c;->i:Ljc/y;

    .line 89
    .line 90
    iget-object v4, v6, Ln8/c;->h:Ljc/y;

    .line 91
    .line 92
    iget-object v5, v6, Ln8/c;->g:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v5, Lh8/c;

    .line 95
    .line 96
    iget-object v11, v6, Ln8/c;->f:Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v12, v6, Ln8/c;->e:Ls8/i;

    .line 99
    .line 100
    iget-object v13, v6, Ln8/c;->d:Ln8/g;

    .line 101
    .line 102
    :try_start_1
    invoke-static {v1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    .line 104
    .line 105
    move-object/from16 v17, v3

    .line 106
    .line 107
    move-object/from16 v20, v4

    .line 108
    .line 109
    move-object/from16 v21, v5

    .line 110
    .line 111
    move-object/from16 v19, v11

    .line 112
    .line 113
    move-object v15, v13

    .line 114
    goto :goto_2

    .line 115
    :cond_4
    invoke-static {v1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance v11, Ljc/y;

    .line 119
    .line 120
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    move-object/from16 v1, p3

    .line 124
    .line 125
    iput-object v1, v11, Ljc/y;->a:Ljava/lang/Object;

    .line 126
    .line 127
    new-instance v12, Ljc/y;

    .line 128
    .line 129
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 130
    .line 131
    .line 132
    iget-object v1, v0, Ln8/g;->a:Lh8/h;

    .line 133
    .line 134
    iget-object v1, v1, Lh8/h;->g:Lh8/b;

    .line 135
    .line 136
    iput-object v1, v12, Ljc/y;->a:Ljava/lang/Object;

    .line 137
    .line 138
    new-instance v13, Ljc/y;

    .line 139
    .line 140
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 141
    .line 142
    .line 143
    :try_start_2
    iget-object v1, v0, Ln8/g;->c:Lm0/w;

    .line 144
    .line 145
    iget-object v2, v11, Ljc/y;->a:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Ls8/m;

    .line 148
    .line 149
    invoke-virtual {v1, v2}, Lm0/w;->M(Ls8/m;)Ls8/m;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iput-object v1, v11, Ljc/y;->a:Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object v1, v12, Ljc/y;->a:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, Lh8/b;

    .line 161
    .line 162
    iget-object v2, v11, Ljc/y;->a:Ljava/lang/Object;

    .line 163
    .line 164
    move-object v4, v2

    .line 165
    check-cast v4, Ls8/m;

    .line 166
    .line 167
    iput-object v0, v6, Ln8/c;->d:Ln8/g;

    .line 168
    .line 169
    move-object/from16 v2, p1

    .line 170
    .line 171
    iput-object v2, v6, Ln8/c;->e:Ls8/i;

    .line 172
    .line 173
    move-object/from16 v5, p2

    .line 174
    .line 175
    iput-object v5, v6, Ln8/c;->f:Ljava/lang/Object;

    .line 176
    .line 177
    move-object/from16 v14, p4

    .line 178
    .line 179
    iput-object v14, v6, Ln8/c;->g:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v11, v6, Ln8/c;->h:Ljc/y;

    .line 182
    .line 183
    iput-object v12, v6, Ln8/c;->i:Ljc/y;

    .line 184
    .line 185
    iput-object v13, v6, Ln8/c;->j:Ljc/y;

    .line 186
    .line 187
    iput-object v13, v6, Ln8/c;->k:Ljc/y;

    .line 188
    .line 189
    iput v3, v6, Ln8/c;->n:I

    .line 190
    .line 191
    move-object v3, v5

    .line 192
    move-object v5, v14

    .line 193
    invoke-virtual/range {v0 .. v6}, Ln8/g;->c(Lh8/b;Ls8/i;Ljava/lang/Object;Ls8/m;Lh8/c;Lac/c;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 197
    if-ne v1, v10, :cond_5

    .line 198
    .line 199
    goto/16 :goto_8

    .line 200
    .line 201
    :cond_5
    move-object/from16 v15, p0

    .line 202
    .line 203
    move-object/from16 v19, p2

    .line 204
    .line 205
    move-object/from16 v21, p4

    .line 206
    .line 207
    move-object/from16 v20, v11

    .line 208
    .line 209
    move-object/from16 v17, v12

    .line 210
    .line 211
    move-object v0, v13

    .line 212
    move-object v2, v0

    .line 213
    move-object/from16 v12, p1

    .line 214
    .line 215
    :goto_2
    :try_start_3
    iput-object v1, v0, Ljc/y;->a:Ljava/lang/Object;

    .line 216
    .line 217
    iget-object v0, v2, Ljc/y;->a:Ljava/lang/Object;

    .line 218
    .line 219
    move-object v1, v0

    .line 220
    check-cast v1, Lm8/e;

    .line 221
    .line 222
    instance-of v3, v1, Lm8/m;

    .line 223
    .line 224
    if-eqz v3, :cond_7

    .line 225
    .line 226
    iget-object v0, v12, Ls8/i;->s:Lhf/u;

    .line 227
    .line 228
    new-instance v14, Lea/f;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 229
    .line 230
    const/16 v22, 0x0

    .line 231
    .line 232
    move-object/from16 v16, v2

    .line 233
    .line 234
    move-object/from16 v18, v12

    .line 235
    .line 236
    :try_start_4
    invoke-direct/range {v14 .. v22}, Lea/f;-><init>(Ln8/g;Ljc/y;Ljc/y;Ls8/i;Ljava/lang/Object;Ljc/y;Lh8/c;Lyb/c;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 237
    .line 238
    .line 239
    move-object/from16 v4, v18

    .line 240
    .line 241
    move-object/from16 v11, v20

    .line 242
    .line 243
    move-object/from16 v3, v21

    .line 244
    .line 245
    :try_start_5
    iput-object v15, v6, Ln8/c;->d:Ln8/g;

    .line 246
    .line 247
    iput-object v4, v6, Ln8/c;->e:Ls8/i;

    .line 248
    .line 249
    iput-object v3, v6, Ln8/c;->f:Ljava/lang/Object;

    .line 250
    .line 251
    iput-object v11, v6, Ln8/c;->g:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object v2, v6, Ln8/c;->h:Ljc/y;

    .line 254
    .line 255
    iput-object v9, v6, Ln8/c;->i:Ljc/y;

    .line 256
    .line 257
    iput-object v9, v6, Ln8/c;->j:Ljc/y;

    .line 258
    .line 259
    iput-object v9, v6, Ln8/c;->k:Ljc/y;

    .line 260
    .line 261
    iput v8, v6, Ln8/c;->n:I

    .line 262
    .line 263
    invoke-static {v0, v14, v6}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    if-ne v1, v10, :cond_6

    .line 268
    .line 269
    goto/16 :goto_8

    .line 270
    .line 271
    :cond_6
    move-object v0, v11

    .line 272
    move-object v5, v15

    .line 273
    :goto_3
    check-cast v1, Ln8/a;

    .line 274
    .line 275
    move-object v11, v0

    .line 276
    move-object/from16 v17, v5

    .line 277
    .line 278
    :goto_4
    move-object/from16 v21, v3

    .line 279
    .line 280
    move-object v12, v4

    .line 281
    goto :goto_5

    .line 282
    :catchall_1
    move-exception v0

    .line 283
    move-object/from16 v2, v16

    .line 284
    .line 285
    goto/16 :goto_a

    .line 286
    .line 287
    :cond_7
    move-object v4, v12

    .line 288
    move-object/from16 v11, v20

    .line 289
    .line 290
    move-object/from16 v3, v21

    .line 291
    .line 292
    instance-of v1, v1, Lm8/d;

    .line 293
    .line 294
    if-eqz v1, :cond_f

    .line 295
    .line 296
    new-instance v1, Ln8/a;

    .line 297
    .line 298
    move-object v5, v0

    .line 299
    check-cast v5, Lm8/d;

    .line 300
    .line 301
    iget-object v5, v5, Lm8/d;->a:Landroid/graphics/drawable/Drawable;

    .line 302
    .line 303
    move-object v8, v0

    .line 304
    check-cast v8, Lm8/d;

    .line 305
    .line 306
    iget-boolean v8, v8, Lm8/d;->b:Z

    .line 307
    .line 308
    check-cast v0, Lm8/d;

    .line 309
    .line 310
    iget-object v0, v0, Lm8/d;->c:Lj8/f;

    .line 311
    .line 312
    invoke-direct {v1, v5, v8, v0, v9}, Ln8/a;-><init>(Landroid/graphics/drawable/Drawable;ZLj8/f;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 313
    .line 314
    .line 315
    move-object/from16 v17, v15

    .line 316
    .line 317
    goto :goto_4

    .line 318
    :goto_5
    iget-object v0, v2, Ljc/y;->a:Ljava/lang/Object;

    .line 319
    .line 320
    instance-of v2, v0, Lm8/m;

    .line 321
    .line 322
    if-eqz v2, :cond_8

    .line 323
    .line 324
    check-cast v0, Lm8/m;

    .line 325
    .line 326
    goto :goto_6

    .line 327
    :cond_8
    move-object v0, v9

    .line 328
    :goto_6
    if-eqz v0, :cond_9

    .line 329
    .line 330
    iget-object v0, v0, Lm8/m;->a:Lj8/n;

    .line 331
    .line 332
    invoke-static {v0}, Lx8/d;->a(Ljava/io/Closeable;)V

    .line 333
    .line 334
    .line 335
    :cond_9
    iget-object v0, v11, Ljc/y;->a:Ljava/lang/Object;

    .line 336
    .line 337
    move-object/from16 v19, v0

    .line 338
    .line 339
    check-cast v19, Ls8/m;

    .line 340
    .line 341
    iput-object v9, v6, Ln8/c;->d:Ln8/g;

    .line 342
    .line 343
    iput-object v9, v6, Ln8/c;->e:Ls8/i;

    .line 344
    .line 345
    iput-object v9, v6, Ln8/c;->f:Ljava/lang/Object;

    .line 346
    .line 347
    iput-object v9, v6, Ln8/c;->g:Ljava/lang/Object;

    .line 348
    .line 349
    iput-object v9, v6, Ln8/c;->h:Ljc/y;

    .line 350
    .line 351
    iput-object v9, v6, Ln8/c;->i:Ljc/y;

    .line 352
    .line 353
    iput-object v9, v6, Ln8/c;->j:Ljc/y;

    .line 354
    .line 355
    iput-object v9, v6, Ln8/c;->k:Ljc/y;

    .line 356
    .line 357
    iput v7, v6, Ln8/c;->n:I

    .line 358
    .line 359
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    iget-object v0, v12, Ls8/i;->f:Ljava/util/List;

    .line 363
    .line 364
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    if-eqz v2, :cond_a

    .line 369
    .line 370
    goto :goto_7

    .line 371
    :cond_a
    iget-object v2, v1, Ln8/a;->a:Landroid/graphics/drawable/Drawable;

    .line 372
    .line 373
    instance-of v2, v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 374
    .line 375
    if-nez v2, :cond_b

    .line 376
    .line 377
    iget-boolean v2, v12, Ls8/i;->j:Z

    .line 378
    .line 379
    if-nez v2, :cond_b

    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_b
    iget-object v2, v12, Ls8/i;->t:Lhf/u;

    .line 383
    .line 384
    new-instance v16, Ln8/f;

    .line 385
    .line 386
    const/16 v23, 0x0

    .line 387
    .line 388
    move-object/from16 v20, v0

    .line 389
    .line 390
    move-object/from16 v18, v1

    .line 391
    .line 392
    move-object/from16 v22, v12

    .line 393
    .line 394
    invoke-direct/range {v16 .. v23}, Ln8/f;-><init>(Ln8/g;Ln8/a;Ls8/m;Ljava/util/List;Lh8/c;Ls8/i;Lyb/c;)V

    .line 395
    .line 396
    .line 397
    move-object/from16 v0, v16

    .line 398
    .line 399
    invoke-static {v2, v0, v6}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    move-object v1, v0

    .line 404
    :goto_7
    if-ne v1, v10, :cond_c

    .line 405
    .line 406
    :goto_8
    return-object v10

    .line 407
    :cond_c
    :goto_9
    check-cast v1, Ln8/a;

    .line 408
    .line 409
    iget-object v0, v1, Ln8/a;->a:Landroid/graphics/drawable/Drawable;

    .line 410
    .line 411
    instance-of v2, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 412
    .line 413
    if-eqz v2, :cond_d

    .line 414
    .line 415
    move-object v9, v0

    .line 416
    check-cast v9, Landroid/graphics/drawable/BitmapDrawable;

    .line 417
    .line 418
    :cond_d
    if-eqz v9, :cond_e

    .line 419
    .line 420
    invoke-virtual {v9}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    if-eqz v0, :cond_e

    .line 425
    .line 426
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 427
    .line 428
    .line 429
    :cond_e
    return-object v1

    .line 430
    :cond_f
    :try_start_6
    new-instance v0, Lce/j0;

    .line 431
    .line 432
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 433
    .line 434
    .line 435
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 436
    :catchall_2
    move-exception v0

    .line 437
    move-object v2, v13

    .line 438
    :goto_a
    iget-object v1, v2, Ljc/y;->a:Ljava/lang/Object;

    .line 439
    .line 440
    instance-of v2, v1, Lm8/m;

    .line 441
    .line 442
    if-eqz v2, :cond_10

    .line 443
    .line 444
    move-object v9, v1

    .line 445
    check-cast v9, Lm8/m;

    .line 446
    .line 447
    :cond_10
    if-eqz v9, :cond_11

    .line 448
    .line 449
    iget-object v1, v9, Lm8/m;->a:Lj8/n;

    .line 450
    .line 451
    invoke-static {v1}, Lx8/d;->a(Ljava/io/Closeable;)V

    .line 452
    .line 453
    .line 454
    :cond_11
    throw v0
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


# virtual methods
.method public final c(Lh8/b;Ls8/i;Ljava/lang/Object;Ls8/m;Lh8/c;Lac/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    instance-of v1, v0, Ln8/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Ln8/d;

    .line 9
    .line 10
    iget v2, v1, Ln8/d;->m:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Ln8/d;->m:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Ln8/d;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Ln8/d;-><init>(Ln8/g;Lac/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, Ln8/d;->k:Ljava/lang/Object;

    .line 32
    .line 33
    iget v3, v1, Ln8/d;->m:I

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v5, :cond_1

    .line 40
    .line 41
    iget v3, v1, Ln8/d;->j:I

    .line 42
    .line 43
    iget-object v6, v1, Ln8/d;->i:Lh8/c;

    .line 44
    .line 45
    iget-object v7, v1, Ln8/d;->h:Ls8/m;

    .line 46
    .line 47
    iget-object v8, v1, Ln8/d;->g:Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v9, v1, Ln8/d;->f:Ls8/i;

    .line 50
    .line 51
    iget-object v10, v1, Ln8/d;->e:Lh8/b;

    .line 52
    .line 53
    iget-object v11, v1, Ln8/d;->d:Ln8/g;

    .line 54
    .line 55
    invoke-static {v0}, Lub/a;->f(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-object/from16 v16, v9

    .line 59
    .line 60
    move-object v9, v1

    .line 61
    move-object/from16 v1, v16

    .line 62
    .line 63
    move-object/from16 v16, v8

    .line 64
    .line 65
    move v8, v3

    .line 66
    move-object/from16 v3, v16

    .line 67
    .line 68
    move-object/from16 v16, v7

    .line 69
    .line 70
    move-object v7, v6

    .line 71
    move-object/from16 v6, v16

    .line 72
    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v0

    .line 83
    :cond_2
    invoke-static {v0}, Lub/a;->f(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    move-object/from16 v0, p1

    .line 88
    .line 89
    move-object/from16 v3, p3

    .line 90
    .line 91
    move-object/from16 v6, p4

    .line 92
    .line 93
    move-object/from16 v7, p5

    .line 94
    .line 95
    move-object v9, v1

    .line 96
    move-object v11, v2

    .line 97
    const/4 v8, 0x0

    .line 98
    move-object/from16 v1, p2

    .line 99
    .line 100
    :goto_1
    iget-object v10, v11, Ln8/g;->a:Lh8/h;

    .line 101
    .line 102
    iget-object v10, v0, Lh8/b;->d:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    :goto_2
    if-ge v8, v12, :cond_4

    .line 109
    .line 110
    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    check-cast v13, Lub/k;

    .line 115
    .line 116
    iget-object v14, v13, Lub/k;->a:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v14, Lm8/f;

    .line 119
    .line 120
    iget-object v13, v13, Lub/k;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v13, Ljava/lang/Class;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v15

    .line 128
    invoke-virtual {v13, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 129
    .line 130
    .line 131
    move-result v13

    .line 132
    if-eqz v13, :cond_3

    .line 133
    .line 134
    const-string v13, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>"

    .line 135
    .line 136
    invoke-static {v14, v13}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v14, v3, v6}, Lm8/f;->a(Ljava/lang/Object;Ls8/m;)Lm8/g;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    if-eqz v13, :cond_3

    .line 144
    .line 145
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    new-instance v10, Lub/k;

    .line 150
    .line 151
    invoke-direct {v10, v13, v8}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_4
    move-object v10, v4

    .line 159
    :goto_3
    if-eqz v10, :cond_9

    .line 160
    .line 161
    iget-object v8, v10, Lub/k;->a:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v8, Lm8/g;

    .line 164
    .line 165
    iget-object v10, v10, Lub/k;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v10, Ljava/lang/Number;

    .line 168
    .line 169
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    add-int/2addr v10, v5

    .line 174
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    iput-object v11, v9, Ln8/d;->d:Ln8/g;

    .line 178
    .line 179
    iput-object v0, v9, Ln8/d;->e:Lh8/b;

    .line 180
    .line 181
    iput-object v1, v9, Ln8/d;->f:Ls8/i;

    .line 182
    .line 183
    iput-object v3, v9, Ln8/d;->g:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v6, v9, Ln8/d;->h:Ls8/m;

    .line 186
    .line 187
    iput-object v7, v9, Ln8/d;->i:Lh8/c;

    .line 188
    .line 189
    iput v10, v9, Ln8/d;->j:I

    .line 190
    .line 191
    iput v5, v9, Ln8/d;->m:I

    .line 192
    .line 193
    invoke-interface {v8, v9}, Lm8/g;->a(Lyb/c;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    sget-object v12, Lzb/a;->a:Lzb/a;

    .line 198
    .line 199
    if-ne v8, v12, :cond_5

    .line 200
    .line 201
    return-object v12

    .line 202
    :cond_5
    move/from16 v16, v10

    .line 203
    .line 204
    move-object v10, v0

    .line 205
    move-object v0, v8

    .line 206
    move/from16 v8, v16

    .line 207
    .line 208
    :goto_4
    move-object v12, v0

    .line 209
    check-cast v12, Lm8/e;

    .line 210
    .line 211
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 212
    .line 213
    .line 214
    if-eqz v12, :cond_6

    .line 215
    .line 216
    return-object v12

    .line 217
    :cond_6
    move-object v0, v10

    .line 218
    goto :goto_1

    .line 219
    :catchall_0
    move-exception v0

    .line 220
    instance-of v1, v12, Lm8/m;

    .line 221
    .line 222
    if-eqz v1, :cond_7

    .line 223
    .line 224
    move-object v4, v12

    .line 225
    check-cast v4, Lm8/m;

    .line 226
    .line 227
    :cond_7
    if-eqz v4, :cond_8

    .line 228
    .line 229
    iget-object v1, v4, Lm8/m;->a:Lj8/n;

    .line 230
    .line 231
    invoke-static {v1}, Lx8/d;->a(Ljava/io/Closeable;)V

    .line 232
    .line 233
    .line 234
    :cond_8
    throw v0

    .line 235
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    const-string v1, "Unable to create a fetcher that supports: "

    .line 238
    .line 239
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v1
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

.method public final d(Lc7/p;Lac/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    iget-object v2, v1, Ln8/g;->d:Li7/p2;

    .line 8
    .line 9
    instance-of v3, v0, Ln8/e;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Ln8/e;

    .line 15
    .line 16
    iget v4, v3, Ln8/e;->h:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, Ln8/e;->h:I

    .line 26
    .line 27
    :goto_0
    move-object v9, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v3, Ln8/e;

    .line 30
    .line 31
    invoke-direct {v3, v1, v0}, Ln8/e;-><init>(Ln8/g;Lac/c;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v0, v9, Ln8/e;->f:Ljava/lang/Object;

    .line 36
    .line 37
    iget v3, v9, Ln8/e;->h:I

    .line 38
    .line 39
    const/4 v10, 0x1

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    if-ne v3, v10, :cond_1

    .line 43
    .line 44
    iget-object v2, v9, Ln8/e;->e:Lc7/p;

    .line 45
    .line 46
    iget-object v3, v9, Ln8/e;->d:Ln8/g;

    .line 47
    .line 48
    :try_start_0
    invoke-static {v0}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object v7, v2

    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_2
    invoke-static {v0}, Lub/a;->f(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :try_start_1
    iget-object v0, v7, Lc7/p;->e:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ls8/i;

    .line 70
    .line 71
    iget-object v3, v0, Ls8/i;->b:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v4, v7, Lc7/p;->f:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v4, Lt8/h;

    .line 76
    .line 77
    sget-object v5, Lx8/d;->a:[Landroid/graphics/Bitmap$Config;

    .line 78
    .line 79
    iget-object v5, v7, Lc7/p;->g:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v5, Lh8/c;

    .line 82
    .line 83
    iget-object v6, v1, Ln8/g;->c:Lm0/w;

    .line 84
    .line 85
    invoke-virtual {v6, v0, v4}, Lm0/w;->H(Ls8/i;Lt8/h;)Ls8/m;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    iget-object v8, v6, Ls8/m;->e:Lt8/g;

    .line 90
    .line 91
    iget-object v11, v1, Ln8/g;->a:Lh8/h;

    .line 92
    .line 93
    iget-object v11, v11, Lh8/h;->g:Lh8/b;

    .line 94
    .line 95
    iget-object v11, v11, Lh8/b;->b:Ljava/util/List;

    .line 96
    .line 97
    move-object v12, v11

    .line 98
    check-cast v12, Ljava/util/Collection;

    .line 99
    .line 100
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    const/4 v13, 0x0

    .line 105
    :goto_2
    if-ge v13, v12, :cond_4

    .line 106
    .line 107
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v14

    .line 111
    check-cast v14, Lub/k;

    .line 112
    .line 113
    iget-object v15, v14, Lub/k;->a:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v15, Lp8/a;

    .line 116
    .line 117
    iget-object v14, v14, Lub/k;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v14, Ljava/lang/Class;

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    invoke-virtual {v14, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-eqz v10, :cond_3

    .line 130
    .line 131
    const-string v10, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>"

    .line 132
    .line 133
    invoke-static {v15, v10}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v15, v3, v6}, Lp8/a;->a(Ljava/lang/Object;Ls8/m;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    if-eqz v10, :cond_3

    .line 141
    .line 142
    move-object v3, v10

    .line 143
    :cond_3
    add-int/lit8 v13, v13, 0x1

    .line 144
    .line 145
    const/4 v10, 0x1

    .line 146
    goto :goto_2

    .line 147
    :cond_4
    move-object v10, v6

    .line 148
    invoke-virtual {v2, v0, v3, v10, v5}, Li7/p2;->A(Ls8/i;Ljava/lang/Object;Ls8/m;Lh8/c;)Lq8/b;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    if-eqz v6, :cond_5

    .line 153
    .line 154
    invoke-virtual {v2, v0, v6, v4, v8}, Li7/p2;->u(Ls8/i;Lq8/b;Lt8/h;Lt8/g;)Lq8/c;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    goto :goto_3

    .line 159
    :catchall_1
    move-exception v0

    .line 160
    move-object v3, v1

    .line 161
    goto :goto_4

    .line 162
    :cond_5
    const/4 v2, 0x0

    .line 163
    :goto_3
    if-eqz v2, :cond_6

    .line 164
    .line 165
    invoke-static {v7, v0, v6, v2}, Li7/p2;->B(Lc7/p;Ls8/i;Lq8/b;Lq8/c;)Ls8/o;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    return-object v0

    .line 170
    :cond_6
    iget-object v11, v0, Ls8/i;->r:Lhf/u;

    .line 171
    .line 172
    move-object v2, v0

    .line 173
    new-instance v0, Lea/f;

    .line 174
    .line 175
    const/4 v8, 0x0

    .line 176
    move-object v4, v10

    .line 177
    invoke-direct/range {v0 .. v8}, Lea/f;-><init>(Ln8/g;Ls8/i;Ljava/lang/Object;Ls8/m;Lh8/c;Lq8/b;Lc7/p;Lyb/c;)V

    .line 178
    .line 179
    .line 180
    iput-object v1, v9, Ln8/e;->d:Ln8/g;

    .line 181
    .line 182
    iput-object v7, v9, Ln8/e;->e:Lc7/p;

    .line 183
    .line 184
    const/4 v2, 0x1

    .line 185
    iput v2, v9, Ln8/e;->h:I

    .line 186
    .line 187
    invoke-static {v11, v0, v9}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 191
    sget-object v2, Lzb/a;->a:Lzb/a;

    .line 192
    .line 193
    if-ne v0, v2, :cond_7

    .line 194
    .line 195
    return-object v2

    .line 196
    :cond_7
    return-object v0

    .line 197
    :goto_4
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 198
    .line 199
    if-nez v2, :cond_8

    .line 200
    .line 201
    iget-object v2, v3, Ln8/g;->c:Lm0/w;

    .line 202
    .line 203
    iget-object v2, v7, Lc7/p;->e:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v2, Ls8/i;

    .line 206
    .line 207
    invoke-static {v2, v0}, Lm0/w;->x(Ls8/i;Ljava/lang/Throwable;)Ls8/e;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    return-object v0

    .line 212
    :cond_8
    throw v0
    .line 213
    .line 214
.end method
