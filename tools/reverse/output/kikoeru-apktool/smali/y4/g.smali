.class public final Ly4/g;
.super Lj5/a;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public A:Ln5/o;

.field public B:Ls4/f0;

.field public C:Landroidx/media3/exoplayer/offline/e;

.field public D:Landroid/os/Handler;

.field public E:Lm4/c0;

.field public F:Landroid/net/Uri;

.field public final G:Landroid/net/Uri;

.field public H:Lz4/c;

.field public I:Z

.field public J:J

.field public K:J

.field public L:J

.field public M:I

.field public N:J

.field public O:I

.field public P:Lm4/i0;

.field public final h:Z

.field public final i:Ls4/g;

.field public final j:Lah/j;

.field public final k:Lg5/w;

.field public final l:Lb5/t;

.field public final m:Lm3/l;

.field public final n:Lb0/w1;

.field public final o:J

.field public final p:J

.field public final q:Lah/j;

.field public final r:Ln5/q;

.field public final s:Ly4/d;

.field public final t:Ljava/lang/Object;

.field public final u:Landroid/util/SparseArray;

.field public final v:Ly4/c;

.field public final w:Ly4/c;

.field public final x:Ly4/d;

.field public final y:Ln5/p;

.field public z:Ls4/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer.dash"

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

.method public constructor <init>(Lm4/i0;Ls4/g;Ln5/q;Lah/j;Lg5/w;Lb5/t;Lm3/l;JJ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lj5/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly4/g;->P:Lm4/i0;

    .line 5
    .line 6
    iget-object v0, p1, Lm4/i0;->c:Lm4/c0;

    .line 7
    .line 8
    iput-object v0, p0, Ly4/g;->E:Lm4/c0;

    .line 9
    .line 10
    iget-object p1, p1, Lm4/i0;->b:Lm4/d0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, Lm4/d0;->a:Landroid/net/Uri;

    .line 16
    .line 17
    iput-object p1, p0, Ly4/g;->F:Landroid/net/Uri;

    .line 18
    .line 19
    iput-object p1, p0, Ly4/g;->G:Landroid/net/Uri;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Ly4/g;->H:Lz4/c;

    .line 23
    .line 24
    iput-object p2, p0, Ly4/g;->i:Ls4/g;

    .line 25
    .line 26
    iput-object p3, p0, Ly4/g;->r:Ln5/q;

    .line 27
    .line 28
    iput-object p4, p0, Ly4/g;->j:Lah/j;

    .line 29
    .line 30
    iput-object p6, p0, Ly4/g;->l:Lb5/t;

    .line 31
    .line 32
    iput-object p7, p0, Ly4/g;->m:Lm3/l;

    .line 33
    .line 34
    iput-wide p8, p0, Ly4/g;->o:J

    .line 35
    .line 36
    iput-wide p10, p0, Ly4/g;->p:J

    .line 37
    .line 38
    iput-object p5, p0, Ly4/g;->k:Lg5/w;

    .line 39
    .line 40
    new-instance p2, Lb0/w1;

    .line 41
    .line 42
    const/16 p3, 0x19

    .line 43
    .line 44
    invoke-direct {p2, p3}, Lb0/w1;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object p2, p0, Ly4/g;->n:Lb0/w1;

    .line 48
    .line 49
    const/4 p2, 0x0

    .line 50
    iput-boolean p2, p0, Ly4/g;->h:Z

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lj5/a;->b(Lj5/d0;)Lah/j;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Ly4/g;->q:Lah/j;

    .line 57
    .line 58
    new-instance p1, Ljava/lang/Object;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Ly4/g;->t:Ljava/lang/Object;

    .line 64
    .line 65
    new-instance p1, Landroid/util/SparseArray;

    .line 66
    .line 67
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Ly4/g;->u:Landroid/util/SparseArray;

    .line 71
    .line 72
    new-instance p1, Ly4/d;

    .line 73
    .line 74
    const/4 p2, 0x1

    .line 75
    invoke-direct {p1, p0, p2}, Ly4/d;-><init>(Ly4/g;I)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Ly4/g;->x:Ly4/d;

    .line 79
    .line 80
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    iput-wide p1, p0, Ly4/g;->N:J

    .line 86
    .line 87
    iput-wide p1, p0, Ly4/g;->L:J

    .line 88
    .line 89
    new-instance p1, Ly4/d;

    .line 90
    .line 91
    const/4 p2, 0x2

    .line 92
    invoke-direct {p1, p0, p2}, Ly4/d;-><init>(Ly4/g;I)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Ly4/g;->s:Ly4/d;

    .line 96
    .line 97
    new-instance p1, Ly4/d;

    .line 98
    .line 99
    const/4 p2, 0x3

    .line 100
    invoke-direct {p1, p0, p2}, Ly4/d;-><init>(Ly4/g;I)V

    .line 101
    .line 102
    .line 103
    iput-object p1, p0, Ly4/g;->y:Ln5/p;

    .line 104
    .line 105
    new-instance p1, Ly4/c;

    .line 106
    .line 107
    const/4 p2, 0x0

    .line 108
    invoke-direct {p1, p0, p2}, Ly4/c;-><init>(Ly4/g;I)V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, Ly4/g;->v:Ly4/c;

    .line 112
    .line 113
    new-instance p1, Ly4/c;

    .line 114
    .line 115
    const/4 p2, 0x1

    .line 116
    invoke-direct {p1, p0, p2}, Ly4/c;-><init>(Ly4/g;I)V

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, Ly4/g;->w:Ly4/c;

    .line 120
    .line 121
    return-void
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
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
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
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
.end method

.method public static u(Lz4/h;)Z
    .locals 5

    .line 1
    iget-object p0, p0, Lz4/h;->c:Ljava/util/List;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_2

    .line 10
    .line 11
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lz4/a;

    .line 16
    .line 17
    iget v2, v2, Lz4/a;->b:I

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    if-eq v2, v3, :cond_1

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    if-ne v2, v4, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    :goto_1
    return v3

    .line 30
    :cond_2
    return v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final A()V
    .locals 15

    .line 1
    iget-object v0, p0, Ly4/g;->D:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Ly4/g;->v:Ly4/c;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ly4/g;->A:Ln5/o;

    .line 9
    .line 10
    invoke-virtual {v0}, Ln5/o;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Ly4/g;->A:Ln5/o;

    .line 18
    .line 19
    invoke-virtual {v0}, Ln5/o;->d()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Ly4/g;->I:Z

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v1, p0, Ly4/g;->t:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v1

    .line 32
    :try_start_0
    iget-object v3, p0, Ly4/g;->F:Landroid/net/Uri;

    .line 33
    .line 34
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, Ly4/g;->I:Z

    .line 37
    .line 38
    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 39
    .line 40
    const-string v0, "The uri must be set."

    .line 41
    .line 42
    invoke-static {v3, v0}, Lp4/c;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v2, Ls4/m;

    .line 46
    .line 47
    const-wide/16 v4, 0x0

    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    const/4 v7, 0x0

    .line 51
    const-wide/16 v9, 0x0

    .line 52
    .line 53
    const-wide/16 v11, -0x1

    .line 54
    .line 55
    const/4 v13, 0x0

    .line 56
    const/4 v14, 0x1

    .line 57
    invoke-direct/range {v2 .. v14}, Ls4/m;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Ln5/r;

    .line 61
    .line 62
    iget-object v1, p0, Ly4/g;->z:Ls4/h;

    .line 63
    .line 64
    iget-object v3, p0, Ly4/g;->r:Ln5/q;

    .line 65
    .line 66
    const/4 v4, 0x4

    .line 67
    invoke-direct {v0, v1, v2, v4, v3}, Ln5/r;-><init>(Ls4/h;Ls4/m;ILn5/q;)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Ly4/g;->s:Ly4/d;

    .line 71
    .line 72
    iget-object v2, p0, Ly4/g;->m:Lm3/l;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    const/4 v2, 0x3

    .line 78
    iget-object v3, p0, Ly4/g;->A:Ln5/o;

    .line 79
    .line 80
    invoke-virtual {v3, v0, v1, v2}, Ln5/o;->f(Ln5/l;Ln5/j;I)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    throw v0
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

.method public final a(Lm4/i0;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ly4/g;->i()Lm4/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lm4/i0;->b:Lm4/d0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, p1, Lm4/i0;->b:Lm4/d0;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object v3, v2, Lm4/d0;->a:Landroid/net/Uri;

    .line 15
    .line 16
    iget-object v4, v1, Lm4/d0;->a:Landroid/net/Uri;

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    iget-object v3, v2, Lm4/d0;->e:Ljava/util/List;

    .line 25
    .line 26
    iget-object v4, v1, Lm4/d0;->e:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v3, v4}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    iget-object v2, v2, Lm4/d0;->c:Lm4/a0;

    .line 35
    .line 36
    iget-object v1, v1, Lm4/d0;->c:Lm4/a0;

    .line 37
    .line 38
    sget v3, Lp4/c0;->a:I

    .line 39
    .line 40
    invoke-static {v2, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    iget-object v0, v0, Lm4/i0;->c:Lm4/c0;

    .line 47
    .line 48
    iget-object p1, p1, Lm4/i0;->c:Lm4/c0;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Lm4/c0;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :cond_0
    const/4 p1, 0x0

    .line 59
    return p1
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

.method public final c(Lj5/d0;Ln5/f;J)Lj5/b0;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lj5/d0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget v3, v0, Ly4/g;->O:I

    .line 14
    .line 15
    sub-int v8, v2, v3

    .line 16
    .line 17
    invoke-virtual/range {p0 .. p1}, Lj5/a;->b(Lj5/d0;)Lah/j;

    .line 18
    .line 19
    .line 20
    move-result-object v14

    .line 21
    new-instance v12, Lb5/q;

    .line 22
    .line 23
    iget-object v2, v0, Lj5/a;->d:Lb5/q;

    .line 24
    .line 25
    iget-object v2, v2, Lb5/q;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v12, v2, v3, v1}, Lb5/q;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILj5/d0;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Ly4/b;

    .line 32
    .line 33
    iget v1, v0, Ly4/g;->O:I

    .line 34
    .line 35
    add-int v5, v1, v8

    .line 36
    .line 37
    iget-object v6, v0, Ly4/g;->H:Lz4/c;

    .line 38
    .line 39
    iget-object v10, v0, Ly4/g;->B:Ls4/f0;

    .line 40
    .line 41
    iget-wide v1, v0, Ly4/g;->L:J

    .line 42
    .line 43
    iget-object v3, v0, Lj5/a;->g:Lw4/k;

    .line 44
    .line 45
    invoke-static {v3}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v7, v0, Ly4/g;->n:Lb0/w1;

    .line 49
    .line 50
    iget-object v9, v0, Ly4/g;->j:Lah/j;

    .line 51
    .line 52
    iget-object v11, v0, Ly4/g;->l:Lb5/t;

    .line 53
    .line 54
    iget-object v13, v0, Ly4/g;->m:Lm3/l;

    .line 55
    .line 56
    iget-object v15, v0, Ly4/g;->y:Ln5/p;

    .line 57
    .line 58
    move-wide/from16 v16, v1

    .line 59
    .line 60
    iget-object v1, v0, Ly4/g;->k:Lg5/w;

    .line 61
    .line 62
    iget-object v2, v0, Ly4/g;->x:Ly4/d;

    .line 63
    .line 64
    move-wide/from16 v18, v16

    .line 65
    .line 66
    move-object/from16 v17, v15

    .line 67
    .line 68
    move-wide/from16 v15, v18

    .line 69
    .line 70
    move-object/from16 v18, p2

    .line 71
    .line 72
    move-object/from16 v19, v1

    .line 73
    .line 74
    move-object/from16 v20, v2

    .line 75
    .line 76
    move-object/from16 v21, v3

    .line 77
    .line 78
    invoke-direct/range {v4 .. v21}, Ly4/b;-><init>(ILz4/c;Lb0/w1;ILah/j;Ls4/f0;Lb5/t;Lb5/q;Lm3/l;Lah/j;JLn5/p;Ln5/f;Lg5/w;Ly4/d;Lw4/k;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, v0, Ly4/g;->u:Landroid/util/SparseArray;

    .line 82
    .line 83
    invoke-virtual {v1, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-object v4
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

.method public final declared-synchronized i()Lm4/i0;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ly4/g;->P:Lm4/i0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
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

.method public final k()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/g;->y:Ln5/p;

    .line 2
    .line 3
    invoke-interface {v0}, Ln5/p;->b()V

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

.method public final m(Ls4/f0;)V
    .locals 2

    .line 1
    iput-object p1, p0, Ly4/g;->B:Ls4/f0;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lj5/a;->g:Lw4/k;

    .line 8
    .line 9
    invoke-static {v0}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Ly4/g;->l:Lb5/t;

    .line 13
    .line 14
    invoke-interface {v1, p1, v0}, Lb5/t;->g(Landroid/os/Looper;Lw4/k;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Lb5/t;->c()V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, p0, Ly4/g;->h:Z

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1}, Ly4/g;->y(Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object p1, p0, Ly4/g;->i:Ls4/g;

    .line 30
    .line 31
    invoke-interface {p1}, Ls4/g;->q()Ls4/h;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Ly4/g;->z:Ls4/h;

    .line 36
    .line 37
    new-instance p1, Ln5/o;

    .line 38
    .line 39
    const-string v0, "DashMediaSource"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ln5/o;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Ly4/g;->A:Ln5/o;

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-static {p1}, Lp4/c0;->n(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Ly4/g;->D:Landroid/os/Handler;

    .line 52
    .line 53
    invoke-virtual {p0}, Ly4/g;->A()V

    .line 54
    .line 55
    .line 56
    return-void
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

.method public final o(Lj5/b0;)V
    .locals 5

    .line 1
    check-cast p1, Ly4/b;

    .line 2
    .line 3
    iget-object v0, p1, Ly4/b;->m:Ly4/o;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, v0, Ly4/o;->i:Z

    .line 7
    .line 8
    iget-object v0, v0, Ly4/o;->d:Landroid/os/Handler;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, Ly4/b;->r:[Lk5/i;

    .line 15
    .line 16
    array-length v2, v0

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-ge v3, v2, :cond_0

    .line 19
    .line 20
    aget-object v4, v0, v3

    .line 21
    .line 22
    invoke-virtual {v4, p1}, Lk5/i;->C(Ly4/b;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-object v1, p1, Ly4/b;->q:Lj5/a0;

    .line 29
    .line 30
    iget-object v0, p0, Ly4/g;->u:Landroid/util/SparseArray;

    .line 31
    .line 32
    iget p1, p1, Ly4/b;->a:I

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 35
    .line 36
    .line 37
    return-void
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
.end method

.method public final q()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ly4/g;->I:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Ly4/g;->z:Ls4/h;

    .line 6
    .line 7
    iget-object v2, p0, Ly4/g;->A:Ln5/o;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ln5/o;->e(Ln5/m;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Ly4/g;->A:Ln5/o;

    .line 15
    .line 16
    :cond_0
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    iput-wide v2, p0, Ly4/g;->J:J

    .line 19
    .line 20
    iput-wide v2, p0, Ly4/g;->K:J

    .line 21
    .line 22
    iget-object v2, p0, Ly4/g;->G:Landroid/net/Uri;

    .line 23
    .line 24
    iput-object v2, p0, Ly4/g;->F:Landroid/net/Uri;

    .line 25
    .line 26
    iput-object v1, p0, Ly4/g;->C:Landroidx/media3/exoplayer/offline/e;

    .line 27
    .line 28
    iget-object v2, p0, Ly4/g;->D:Landroid/os/Handler;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Ly4/g;->D:Landroid/os/Handler;

    .line 36
    .line 37
    :cond_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    iput-wide v1, p0, Ly4/g;->L:J

    .line 43
    .line 44
    iput v0, p0, Ly4/g;->M:I

    .line 45
    .line 46
    iput-wide v1, p0, Ly4/g;->N:J

    .line 47
    .line 48
    iget-object v0, p0, Ly4/g;->u:Landroid/util/SparseArray;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Ly4/g;->n:Lb0/w1;

    .line 54
    .line 55
    iget-object v1, v0, Lb0/w1;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 60
    .line 61
    .line 62
    iget-object v1, v0, Lb0/w1;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 67
    .line 68
    .line 69
    iget-object v0, v0, Lb0/w1;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Ljava/util/HashMap;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Ly4/g;->l:Lb5/t;

    .line 77
    .line 78
    invoke-interface {v0}, Lb5/t;->a()V

    .line 79
    .line 80
    .line 81
    return-void
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

.method public final declared-synchronized t(Lm4/i0;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Ly4/g;->P:Lm4/i0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
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

.method public final v()V
    .locals 4

    .line 1
    iget-object v0, p0, Ly4/g;->A:Ln5/o;

    .line 2
    .line 3
    new-instance v1, Ly4/d;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Ly4/d;-><init>(Ly4/g;I)V

    .line 7
    .line 8
    .line 9
    sget-object v2, Lo5/b;->b:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v2

    .line 12
    :try_start_0
    sget-boolean v3, Lo5/b;->c:Z

    .line 13
    .line 14
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Ly4/d;->a()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    if-nez v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Ln5/o;

    .line 24
    .line 25
    const-string v2, "SntpClient"

    .line 26
    .line 27
    invoke-direct {v0, v2}, Ln5/o;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    new-instance v2, Lm3/l;

    .line 31
    .line 32
    const/16 v3, 0xe

    .line 33
    .line 34
    invoke-direct {v2, v3}, Lm3/l;-><init>(I)V

    .line 35
    .line 36
    .line 37
    new-instance v3, Li7/p2;

    .line 38
    .line 39
    invoke-direct {v3, v1}, Li7/p2;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {v0, v2, v3, v1}, Ln5/o;->f(Ln5/l;Ln5/j;I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw v0
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

.method public final w(Ln5/r;J)V
    .locals 11

    .line 1
    new-instance v1, Lj5/u;

    .line 2
    .line 3
    iget-wide v2, p1, Ln5/r;->a:J

    .line 4
    .line 5
    iget-object v0, p1, Ln5/r;->d:Ls4/d0;

    .line 6
    .line 7
    iget-object v0, v0, Ls4/d0;->c:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-direct {v1, p2, p3}, Lj5/u;-><init>(J)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Ly4/g;->m:Lm3/l;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v2, p1, Ln5/r;->c:I

    .line 18
    .line 19
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Ly4/g;->q:Lah/j;

    .line 30
    .line 31
    const/4 v3, -0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    invoke-virtual/range {v0 .. v10}, Lah/j;->A(Lj5/u;IILm4/q;ILjava/lang/Object;JJ)V

    .line 36
    .line 37
    .line 38
    return-void
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

.method public final x(Ljava/io/IOException;)V
    .locals 4

    .line 1
    const-string v0, "DashMediaSource"

    .line 2
    .line 3
    const-string v1, "Failed to resolve time offset."

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    sub-long/2addr v0, v2

    .line 17
    iput-wide v0, p0, Ly4/g;->L:J

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Ly4/g;->y(Z)V

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

.method public final y(Z)V
    .locals 43

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    :goto_0
    iget-object v0, v1, Ly4/g;->u:Landroid/util/SparseArray;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    if-ge v3, v4, :cond_9

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    iget v6, v1, Ly4/g;->O:I

    .line 18
    .line 19
    if-lt v4, v6, :cond_8

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v6, v0

    .line 26
    check-cast v6, Ly4/b;

    .line 27
    .line 28
    iget-object v7, v1, Ly4/g;->H:Lz4/c;

    .line 29
    .line 30
    iget v0, v1, Ly4/g;->O:I

    .line 31
    .line 32
    sub-int/2addr v4, v0

    .line 33
    iput-object v7, v6, Ly4/b;->u:Lz4/c;

    .line 34
    .line 35
    iput v4, v6, Ly4/b;->v:I

    .line 36
    .line 37
    iget-object v0, v6, Ly4/b;->m:Ly4/o;

    .line 38
    .line 39
    iput-boolean v2, v0, Ly4/o;->h:Z

    .line 40
    .line 41
    iput-object v7, v0, Ly4/o;->f:Lz4/c;

    .line 42
    .line 43
    iget-object v8, v0, Ly4/o;->e:Ljava/util/TreeMap;

    .line 44
    .line 45
    invoke-virtual {v8}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    :cond_0
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-eqz v9, :cond_1

    .line 58
    .line 59
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    check-cast v9, Ljava/util/Map$Entry;

    .line 64
    .line 65
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    check-cast v9, Ljava/lang/Long;

    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v9

    .line 75
    iget-object v11, v0, Ly4/o;->f:Lz4/c;

    .line 76
    .line 77
    iget-wide v11, v11, Lz4/c;->h:J

    .line 78
    .line 79
    cmp-long v13, v9, v11

    .line 80
    .line 81
    if-gez v13, :cond_0

    .line 82
    .line 83
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    iget-object v8, v6, Ly4/b;->r:[Lk5/i;

    .line 88
    .line 89
    if-eqz v8, :cond_4

    .line 90
    .line 91
    array-length v9, v8

    .line 92
    const/4 v10, 0x0

    .line 93
    :goto_2
    if-ge v10, v9, :cond_3

    .line 94
    .line 95
    aget-object v0, v8, v10

    .line 96
    .line 97
    iget-object v11, v0, Lk5/i;->e:Ly4/k;

    .line 98
    .line 99
    iget-object v0, v11, Ly4/k;->i:[Ly4/i;

    .line 100
    .line 101
    :try_start_0
    iput-object v7, v11, Ly4/k;->k:Lz4/c;

    .line 102
    .line 103
    iput v4, v11, Ly4/k;->l:I

    .line 104
    .line 105
    invoke-virtual {v7, v4}, Lz4/c;->d(I)J

    .line 106
    .line 107
    .line 108
    move-result-wide v12

    .line 109
    invoke-virtual {v11}, Ly4/k;->a()Ljava/util/ArrayList;

    .line 110
    .line 111
    .line 112
    move-result-object v14
    :try_end_0
    .catch Lj5/b; {:try_start_0 .. :try_end_0} :catch_1

    .line 113
    const/4 v15, 0x0

    .line 114
    const/16 v16, 0x1

    .line 115
    .line 116
    :goto_3
    :try_start_1
    array-length v5, v0

    .line 117
    if-ge v15, v5, :cond_2

    .line 118
    .line 119
    iget-object v5, v11, Ly4/k;->j:Lm5/r;

    .line 120
    .line 121
    invoke-interface {v5, v15}, Lm5/r;->i(I)I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    check-cast v5, Lz4/m;

    .line 130
    .line 131
    aget-object v2, v0, v15

    .line 132
    .line 133
    invoke-virtual {v2, v12, v13, v5}, Ly4/i;->c(JLz4/m;)Ly4/i;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    aput-object v2, v0, v15
    :try_end_1
    .catch Lj5/b; {:try_start_1 .. :try_end_1} :catch_0

    .line 138
    .line 139
    add-int/lit8 v15, v15, 0x1

    .line 140
    .line 141
    const/4 v2, 0x0

    .line 142
    goto :goto_3

    .line 143
    :catch_0
    move-exception v0

    .line 144
    goto :goto_4

    .line 145
    :catch_1
    move-exception v0

    .line 146
    const/16 v16, 0x1

    .line 147
    .line 148
    :goto_4
    iput-object v0, v11, Ly4/k;->m:Lj5/b;

    .line 149
    .line 150
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 151
    .line 152
    const/4 v2, 0x0

    .line 153
    goto :goto_2

    .line 154
    :cond_3
    const/16 v16, 0x1

    .line 155
    .line 156
    iget-object v0, v6, Ly4/b;->q:Lj5/a0;

    .line 157
    .line 158
    invoke-interface {v0, v6}, Lj5/d1;->c(Lj5/e1;)V

    .line 159
    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_4
    const/16 v16, 0x1

    .line 163
    .line 164
    :goto_5
    invoke-virtual {v7, v4}, Lz4/c;->b(I)Lz4/h;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iget-object v0, v0, Lz4/h;->d:Ljava/util/List;

    .line 169
    .line 170
    iput-object v0, v6, Ly4/b;->w:Ljava/util/List;

    .line 171
    .line 172
    iget-object v0, v6, Ly4/b;->s:[Ly4/l;

    .line 173
    .line 174
    array-length v2, v0

    .line 175
    const/4 v5, 0x0

    .line 176
    :goto_6
    if-ge v5, v2, :cond_8

    .line 177
    .line 178
    aget-object v8, v0, v5

    .line 179
    .line 180
    iget-object v9, v6, Ly4/b;->w:Ljava/util/List;

    .line 181
    .line 182
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    if-eqz v10, :cond_7

    .line 191
    .line 192
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    check-cast v10, Lz4/g;

    .line 197
    .line 198
    invoke-virtual {v10}, Lz4/g;->a()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v11

    .line 202
    iget-object v12, v8, Ly4/l;->e:Lz4/g;

    .line 203
    .line 204
    invoke-virtual {v12}, Lz4/g;->a()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v12

    .line 208
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    if-eqz v11, :cond_5

    .line 213
    .line 214
    iget-object v9, v7, Lz4/c;->m:Ljava/util/List;

    .line 215
    .line 216
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 217
    .line 218
    .line 219
    move-result v9

    .line 220
    add-int/lit8 v9, v9, -0x1

    .line 221
    .line 222
    iget-boolean v11, v7, Lz4/c;->d:Z

    .line 223
    .line 224
    if-eqz v11, :cond_6

    .line 225
    .line 226
    if-ne v4, v9, :cond_6

    .line 227
    .line 228
    const/4 v9, 0x1

    .line 229
    goto :goto_7

    .line 230
    :cond_6
    const/4 v9, 0x0

    .line 231
    :goto_7
    invoke-virtual {v8, v10, v9}, Ly4/l;->c(Lz4/g;Z)V

    .line 232
    .line 233
    .line 234
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 238
    .line 239
    const/4 v2, 0x0

    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :cond_9
    const/16 v16, 0x1

    .line 243
    .line 244
    iget-object v0, v1, Ly4/g;->H:Lz4/c;

    .line 245
    .line 246
    const/4 v2, 0x0

    .line 247
    invoke-virtual {v0, v2}, Lz4/c;->b(I)Lz4/h;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iget-object v2, v1, Ly4/g;->H:Lz4/c;

    .line 252
    .line 253
    iget-object v2, v2, Lz4/c;->m:Ljava/util/List;

    .line 254
    .line 255
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    add-int/lit8 v2, v2, -0x1

    .line 260
    .line 261
    iget-object v3, v1, Ly4/g;->H:Lz4/c;

    .line 262
    .line 263
    invoke-virtual {v3, v2}, Lz4/c;->b(I)Lz4/h;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    iget-object v4, v1, Ly4/g;->H:Lz4/c;

    .line 268
    .line 269
    invoke-virtual {v4, v2}, Lz4/c;->d(I)J

    .line 270
    .line 271
    .line 272
    move-result-wide v4

    .line 273
    iget-wide v6, v1, Ly4/g;->L:J

    .line 274
    .line 275
    invoke-static {v6, v7}, Lp4/c0;->z(J)J

    .line 276
    .line 277
    .line 278
    move-result-wide v6

    .line 279
    invoke-static {v6, v7}, Lp4/c0;->N(J)J

    .line 280
    .line 281
    .line 282
    move-result-wide v6

    .line 283
    iget-object v2, v1, Ly4/g;->H:Lz4/c;

    .line 284
    .line 285
    const/4 v8, 0x0

    .line 286
    invoke-virtual {v2, v8}, Lz4/c;->d(I)J

    .line 287
    .line 288
    .line 289
    move-result-wide v9

    .line 290
    iget-wide v11, v0, Lz4/h;->b:J

    .line 291
    .line 292
    iget-object v2, v0, Lz4/h;->c:Ljava/util/List;

    .line 293
    .line 294
    invoke-static {v11, v12}, Lp4/c0;->N(J)J

    .line 295
    .line 296
    .line 297
    move-result-wide v11

    .line 298
    invoke-static {v0}, Ly4/g;->u(Lz4/h;)Z

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    move/from16 v18, v8

    .line 303
    .line 304
    move-wide v14, v11

    .line 305
    const/4 v13, 0x0

    .line 306
    :goto_8
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 307
    .line 308
    .line 309
    move-result v8

    .line 310
    move-wide/from16 v19, v11

    .line 311
    .line 312
    if-ge v13, v8, :cond_10

    .line 313
    .line 314
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v8

    .line 318
    check-cast v8, Lz4/a;

    .line 319
    .line 320
    const-wide/16 v22, 0x0

    .line 321
    .line 322
    iget-object v11, v8, Lz4/a;->c:Ljava/util/List;

    .line 323
    .line 324
    iget v8, v8, Lz4/a;->b:I

    .line 325
    .line 326
    const/4 v12, 0x1

    .line 327
    if-eq v8, v12, :cond_a

    .line 328
    .line 329
    const/4 v12, 0x2

    .line 330
    if-eq v8, v12, :cond_a

    .line 331
    .line 332
    const/4 v8, 0x1

    .line 333
    goto :goto_9

    .line 334
    :cond_a
    const/4 v8, 0x0

    .line 335
    :goto_9
    if-eqz v18, :cond_b

    .line 336
    .line 337
    if-nez v8, :cond_f

    .line 338
    .line 339
    :cond_b
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 340
    .line 341
    .line 342
    move-result v8

    .line 343
    if-eqz v8, :cond_c

    .line 344
    .line 345
    goto :goto_b

    .line 346
    :cond_c
    const/4 v8, 0x0

    .line 347
    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v11

    .line 351
    check-cast v11, Lz4/m;

    .line 352
    .line 353
    invoke-virtual {v11}, Lz4/m;->d()Ly4/h;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    if-nez v8, :cond_d

    .line 358
    .line 359
    goto :goto_a

    .line 360
    :cond_d
    invoke-interface {v8, v9, v10, v6, v7}, Ly4/h;->y(JJ)J

    .line 361
    .line 362
    .line 363
    move-result-wide v11

    .line 364
    cmp-long v24, v11, v22

    .line 365
    .line 366
    if-nez v24, :cond_e

    .line 367
    .line 368
    :goto_a
    move-wide/from16 v11, v19

    .line 369
    .line 370
    goto :goto_c

    .line 371
    :cond_e
    invoke-interface {v8, v9, v10, v6, v7}, Ly4/h;->e(JJ)J

    .line 372
    .line 373
    .line 374
    move-result-wide v11

    .line 375
    invoke-interface {v8, v11, v12}, Ly4/h;->b(J)J

    .line 376
    .line 377
    .line 378
    move-result-wide v11

    .line 379
    add-long v11, v11, v19

    .line 380
    .line 381
    invoke-static {v14, v15, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 382
    .line 383
    .line 384
    move-result-wide v14

    .line 385
    :cond_f
    :goto_b
    add-int/lit8 v13, v13, 0x1

    .line 386
    .line 387
    move-wide/from16 v11, v19

    .line 388
    .line 389
    const/16 v16, 0x1

    .line 390
    .line 391
    goto :goto_8

    .line 392
    :cond_10
    const-wide/16 v22, 0x0

    .line 393
    .line 394
    move-wide v11, v14

    .line 395
    :goto_c
    iget-wide v8, v3, Lz4/h;->b:J

    .line 396
    .line 397
    iget-object v2, v3, Lz4/h;->c:Ljava/util/List;

    .line 398
    .line 399
    invoke-static {v8, v9}, Lp4/c0;->N(J)J

    .line 400
    .line 401
    .line 402
    move-result-wide v8

    .line 403
    invoke-static {v3}, Ly4/g;->u(Lz4/h;)Z

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    const-wide v13, 0x7fffffffffffffffL

    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    const/4 v10, 0x0

    .line 413
    :goto_d
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 414
    .line 415
    .line 416
    move-result v15

    .line 417
    if-ge v10, v15, :cond_18

    .line 418
    .line 419
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v15

    .line 423
    check-cast v15, Lz4/a;

    .line 424
    .line 425
    move/from16 v18, v3

    .line 426
    .line 427
    iget-object v3, v15, Lz4/a;->c:Ljava/util/List;

    .line 428
    .line 429
    iget v15, v15, Lz4/a;->b:I

    .line 430
    .line 431
    move-wide/from16 v19, v8

    .line 432
    .line 433
    const/4 v8, 0x1

    .line 434
    if-eq v15, v8, :cond_11

    .line 435
    .line 436
    const/4 v8, 0x2

    .line 437
    if-eq v15, v8, :cond_12

    .line 438
    .line 439
    const/4 v9, 0x1

    .line 440
    goto :goto_e

    .line 441
    :cond_11
    const/4 v8, 0x2

    .line 442
    :cond_12
    const/4 v9, 0x0

    .line 443
    :goto_e
    if-eqz v18, :cond_13

    .line 444
    .line 445
    if-nez v9, :cond_17

    .line 446
    .line 447
    :cond_13
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 448
    .line 449
    .line 450
    move-result v9

    .line 451
    if-eqz v9, :cond_14

    .line 452
    .line 453
    goto :goto_f

    .line 454
    :cond_14
    const/4 v9, 0x0

    .line 455
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v3

    .line 459
    check-cast v3, Lz4/m;

    .line 460
    .line 461
    invoke-virtual {v3}, Lz4/m;->d()Ly4/h;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    if-nez v3, :cond_15

    .line 466
    .line 467
    add-long v8, v19, v4

    .line 468
    .line 469
    goto :goto_10

    .line 470
    :cond_15
    invoke-interface {v3, v4, v5, v6, v7}, Ly4/h;->y(JJ)J

    .line 471
    .line 472
    .line 473
    move-result-wide v24

    .line 474
    cmp-long v9, v24, v22

    .line 475
    .line 476
    if-nez v9, :cond_16

    .line 477
    .line 478
    move-wide/from16 v8, v19

    .line 479
    .line 480
    goto :goto_10

    .line 481
    :cond_16
    invoke-interface {v3, v4, v5, v6, v7}, Ly4/h;->e(JJ)J

    .line 482
    .line 483
    .line 484
    move-result-wide v26

    .line 485
    add-long v26, v26, v24

    .line 486
    .line 487
    const-wide/16 v24, 0x1

    .line 488
    .line 489
    sub-long v8, v26, v24

    .line 490
    .line 491
    invoke-interface {v3, v8, v9}, Ly4/h;->b(J)J

    .line 492
    .line 493
    .line 494
    move-result-wide v24

    .line 495
    add-long v24, v24, v19

    .line 496
    .line 497
    invoke-interface {v3, v8, v9, v4, v5}, Ly4/h;->c(JJ)J

    .line 498
    .line 499
    .line 500
    move-result-wide v8

    .line 501
    add-long v8, v8, v24

    .line 502
    .line 503
    invoke-static {v13, v14, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 504
    .line 505
    .line 506
    move-result-wide v8

    .line 507
    move-wide v13, v8

    .line 508
    :cond_17
    :goto_f
    add-int/lit8 v10, v10, 0x1

    .line 509
    .line 510
    move/from16 v3, v18

    .line 511
    .line 512
    move-wide/from16 v8, v19

    .line 513
    .line 514
    goto :goto_d

    .line 515
    :cond_18
    move-wide v8, v13

    .line 516
    :goto_10
    iget-object v3, v1, Ly4/g;->H:Lz4/c;

    .line 517
    .line 518
    iget-boolean v3, v3, Lz4/c;->d:Z

    .line 519
    .line 520
    if-eqz v3, :cond_1b

    .line 521
    .line 522
    const/4 v3, 0x0

    .line 523
    :goto_11
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 524
    .line 525
    .line 526
    move-result v4

    .line 527
    if-ge v3, v4, :cond_1a

    .line 528
    .line 529
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    check-cast v4, Lz4/a;

    .line 534
    .line 535
    iget-object v4, v4, Lz4/a;->c:Ljava/util/List;

    .line 536
    .line 537
    const/4 v5, 0x0

    .line 538
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    check-cast v4, Lz4/m;

    .line 543
    .line 544
    invoke-virtual {v4}, Lz4/m;->d()Ly4/h;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    if-eqz v4, :cond_1b

    .line 549
    .line 550
    invoke-interface {v4}, Ly4/h;->s()Z

    .line 551
    .line 552
    .line 553
    move-result v4

    .line 554
    if-eqz v4, :cond_19

    .line 555
    .line 556
    goto :goto_12

    .line 557
    :cond_19
    add-int/lit8 v3, v3, 0x1

    .line 558
    .line 559
    goto :goto_11

    .line 560
    :cond_1a
    const/4 v2, 0x1

    .line 561
    goto :goto_13

    .line 562
    :cond_1b
    :goto_12
    const/4 v2, 0x0

    .line 563
    :goto_13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    if-eqz v2, :cond_1c

    .line 569
    .line 570
    iget-object v5, v1, Ly4/g;->H:Lz4/c;

    .line 571
    .line 572
    iget-wide v13, v5, Lz4/c;->f:J

    .line 573
    .line 574
    cmp-long v5, v13, v3

    .line 575
    .line 576
    if-eqz v5, :cond_1c

    .line 577
    .line 578
    invoke-static {v13, v14}, Lp4/c0;->N(J)J

    .line 579
    .line 580
    .line 581
    move-result-wide v13

    .line 582
    sub-long v13, v8, v13

    .line 583
    .line 584
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->max(JJ)J

    .line 585
    .line 586
    .line 587
    move-result-wide v11

    .line 588
    :cond_1c
    sub-long v34, v8, v11

    .line 589
    .line 590
    iget-object v5, v1, Ly4/g;->H:Lz4/c;

    .line 591
    .line 592
    iget-boolean v8, v5, Lz4/c;->d:Z

    .line 593
    .line 594
    if-eqz v8, :cond_32

    .line 595
    .line 596
    iget-wide v8, v5, Lz4/c;->a:J

    .line 597
    .line 598
    cmp-long v5, v8, v3

    .line 599
    .line 600
    if-eqz v5, :cond_1d

    .line 601
    .line 602
    const/4 v5, 0x1

    .line 603
    goto :goto_14

    .line 604
    :cond_1d
    const/4 v5, 0x0

    .line 605
    :goto_14
    invoke-static {v5}, Lp4/c;->i(Z)V

    .line 606
    .line 607
    .line 608
    iget-object v5, v1, Ly4/g;->H:Lz4/c;

    .line 609
    .line 610
    iget-wide v8, v5, Lz4/c;->a:J

    .line 611
    .line 612
    invoke-static {v8, v9}, Lp4/c0;->N(J)J

    .line 613
    .line 614
    .line 615
    move-result-wide v8

    .line 616
    sub-long/2addr v6, v8

    .line 617
    sub-long/2addr v6, v11

    .line 618
    invoke-virtual {v1}, Ly4/g;->i()Lm4/i0;

    .line 619
    .line 620
    .line 621
    move-result-object v5

    .line 622
    iget-object v5, v5, Lm4/i0;->c:Lm4/c0;

    .line 623
    .line 624
    invoke-static {v6, v7}, Lp4/c0;->c0(J)J

    .line 625
    .line 626
    .line 627
    move-result-wide v8

    .line 628
    iget-wide v13, v5, Lm4/c0;->c:J

    .line 629
    .line 630
    cmp-long v10, v13, v3

    .line 631
    .line 632
    if-eqz v10, :cond_1e

    .line 633
    .line 634
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 635
    .line 636
    .line 637
    move-result-wide v13

    .line 638
    goto :goto_15

    .line 639
    :cond_1e
    iget-object v10, v1, Ly4/g;->H:Lz4/c;

    .line 640
    .line 641
    iget-object v10, v10, Lz4/c;->j:Lm4/b0;

    .line 642
    .line 643
    if-eqz v10, :cond_1f

    .line 644
    .line 645
    iget-wide v13, v10, Lm4/b0;->c:J

    .line 646
    .line 647
    cmp-long v10, v13, v3

    .line 648
    .line 649
    if-eqz v10, :cond_1f

    .line 650
    .line 651
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 652
    .line 653
    .line 654
    move-result-wide v13

    .line 655
    goto :goto_15

    .line 656
    :cond_1f
    move-wide v13, v8

    .line 657
    :goto_15
    sub-long v18, v6, v34

    .line 658
    .line 659
    invoke-static/range {v18 .. v19}, Lp4/c0;->c0(J)J

    .line 660
    .line 661
    .line 662
    move-result-wide v18

    .line 663
    cmp-long v10, v18, v22

    .line 664
    .line 665
    if-gez v10, :cond_20

    .line 666
    .line 667
    cmp-long v10, v13, v22

    .line 668
    .line 669
    if-lez v10, :cond_20

    .line 670
    .line 671
    move-wide/from16 v18, v22

    .line 672
    .line 673
    :cond_20
    iget-object v10, v1, Ly4/g;->H:Lz4/c;

    .line 674
    .line 675
    move-wide/from16 v20, v3

    .line 676
    .line 677
    iget-wide v3, v10, Lz4/c;->c:J

    .line 678
    .line 679
    cmp-long v10, v3, v20

    .line 680
    .line 681
    if-eqz v10, :cond_21

    .line 682
    .line 683
    add-long v3, v18, v3

    .line 684
    .line 685
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 686
    .line 687
    .line 688
    move-result-wide v18

    .line 689
    :cond_21
    move-wide/from16 v26, v18

    .line 690
    .line 691
    iget-wide v3, v5, Lm4/c0;->b:J

    .line 692
    .line 693
    cmp-long v10, v3, v20

    .line 694
    .line 695
    if-eqz v10, :cond_23

    .line 696
    .line 697
    move-wide/from16 v24, v3

    .line 698
    .line 699
    move-wide/from16 v28, v8

    .line 700
    .line 701
    invoke-static/range {v24 .. v29}, Lp4/c0;->j(JJJ)J

    .line 702
    .line 703
    .line 704
    move-result-wide v26

    .line 705
    :cond_22
    :goto_16
    move-wide/from16 v30, v26

    .line 706
    .line 707
    goto :goto_17

    .line 708
    :cond_23
    move-wide/from16 v28, v8

    .line 709
    .line 710
    iget-object v3, v1, Ly4/g;->H:Lz4/c;

    .line 711
    .line 712
    iget-object v3, v3, Lz4/c;->j:Lm4/b0;

    .line 713
    .line 714
    if-eqz v3, :cond_22

    .line 715
    .line 716
    iget-wide v3, v3, Lm4/b0;->b:J

    .line 717
    .line 718
    cmp-long v8, v3, v20

    .line 719
    .line 720
    if-eqz v8, :cond_22

    .line 721
    .line 722
    move-wide/from16 v24, v3

    .line 723
    .line 724
    invoke-static/range {v24 .. v29}, Lp4/c0;->j(JJJ)J

    .line 725
    .line 726
    .line 727
    move-result-wide v26

    .line 728
    goto :goto_16

    .line 729
    :goto_17
    cmp-long v3, v30, v13

    .line 730
    .line 731
    if-lez v3, :cond_24

    .line 732
    .line 733
    move-wide/from16 v32, v30

    .line 734
    .line 735
    goto :goto_18

    .line 736
    :cond_24
    move-wide/from16 v32, v13

    .line 737
    .line 738
    :goto_18
    iget-object v3, v1, Ly4/g;->E:Lm4/c0;

    .line 739
    .line 740
    iget-wide v3, v3, Lm4/c0;->a:J

    .line 741
    .line 742
    cmp-long v8, v3, v20

    .line 743
    .line 744
    if-eqz v8, :cond_25

    .line 745
    .line 746
    goto :goto_19

    .line 747
    :cond_25
    iget-object v3, v1, Ly4/g;->H:Lz4/c;

    .line 748
    .line 749
    iget-object v4, v3, Lz4/c;->j:Lm4/b0;

    .line 750
    .line 751
    if-eqz v4, :cond_26

    .line 752
    .line 753
    iget-wide v8, v4, Lm4/b0;->a:J

    .line 754
    .line 755
    cmp-long v4, v8, v20

    .line 756
    .line 757
    if-eqz v4, :cond_26

    .line 758
    .line 759
    move-wide v3, v8

    .line 760
    goto :goto_19

    .line 761
    :cond_26
    iget-wide v3, v3, Lz4/c;->g:J

    .line 762
    .line 763
    cmp-long v8, v3, v20

    .line 764
    .line 765
    if-eqz v8, :cond_27

    .line 766
    .line 767
    goto :goto_19

    .line 768
    :cond_27
    iget-wide v3, v1, Ly4/g;->o:J

    .line 769
    .line 770
    :goto_19
    cmp-long v8, v3, v30

    .line 771
    .line 772
    if-gez v8, :cond_28

    .line 773
    .line 774
    move-wide/from16 v3, v30

    .line 775
    .line 776
    :cond_28
    const-wide/16 v8, 0x2

    .line 777
    .line 778
    iget-wide v13, v1, Ly4/g;->p:J

    .line 779
    .line 780
    cmp-long v10, v3, v32

    .line 781
    .line 782
    if-lez v10, :cond_29

    .line 783
    .line 784
    div-long v3, v34, v8

    .line 785
    .line 786
    invoke-static {v13, v14, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 787
    .line 788
    .line 789
    move-result-wide v3

    .line 790
    sub-long v3, v6, v3

    .line 791
    .line 792
    invoke-static {v3, v4}, Lp4/c0;->c0(J)J

    .line 793
    .line 794
    .line 795
    move-result-wide v28

    .line 796
    invoke-static/range {v28 .. v33}, Lp4/c0;->j(JJJ)J

    .line 797
    .line 798
    .line 799
    move-result-wide v3

    .line 800
    move-wide/from16 v24, v3

    .line 801
    .line 802
    move-wide/from16 v18, v8

    .line 803
    .line 804
    move-wide/from16 v8, v30

    .line 805
    .line 806
    move-wide/from16 v41, v24

    .line 807
    .line 808
    move-wide/from16 v24, v6

    .line 809
    .line 810
    move-wide/from16 v6, v41

    .line 811
    .line 812
    :goto_1a
    move v10, v2

    .line 813
    move-wide/from16 v2, v32

    .line 814
    .line 815
    goto :goto_1b

    .line 816
    :cond_29
    move-wide/from16 v18, v8

    .line 817
    .line 818
    move-wide/from16 v8, v30

    .line 819
    .line 820
    move-wide/from16 v30, v3

    .line 821
    .line 822
    move-wide/from16 v24, v6

    .line 823
    .line 824
    move-wide/from16 v6, v30

    .line 825
    .line 826
    goto :goto_1a

    .line 827
    :goto_1b
    iget v4, v5, Lm4/c0;->d:F

    .line 828
    .line 829
    const v15, -0x800001

    .line 830
    .line 831
    .line 832
    cmpl-float v26, v4, v15

    .line 833
    .line 834
    if-eqz v26, :cond_2a

    .line 835
    .line 836
    goto :goto_1c

    .line 837
    :cond_2a
    iget-object v4, v1, Ly4/g;->H:Lz4/c;

    .line 838
    .line 839
    iget-object v4, v4, Lz4/c;->j:Lm4/b0;

    .line 840
    .line 841
    if-eqz v4, :cond_2b

    .line 842
    .line 843
    iget v4, v4, Lm4/b0;->d:F

    .line 844
    .line 845
    goto :goto_1c

    .line 846
    :cond_2b
    const v4, -0x800001

    .line 847
    .line 848
    .line 849
    :goto_1c
    iget v5, v5, Lm4/c0;->e:F

    .line 850
    .line 851
    cmpl-float v26, v5, v15

    .line 852
    .line 853
    if-eqz v26, :cond_2c

    .line 854
    .line 855
    goto :goto_1d

    .line 856
    :cond_2c
    iget-object v5, v1, Ly4/g;->H:Lz4/c;

    .line 857
    .line 858
    iget-object v5, v5, Lz4/c;->j:Lm4/b0;

    .line 859
    .line 860
    if-eqz v5, :cond_2d

    .line 861
    .line 862
    iget v5, v5, Lm4/b0;->e:F

    .line 863
    .line 864
    goto :goto_1d

    .line 865
    :cond_2d
    const v5, -0x800001

    .line 866
    .line 867
    .line 868
    :goto_1d
    cmpl-float v26, v4, v15

    .line 869
    .line 870
    if-nez v26, :cond_2f

    .line 871
    .line 872
    cmpl-float v15, v5, v15

    .line 873
    .line 874
    if-nez v15, :cond_2f

    .line 875
    .line 876
    iget-object v15, v1, Ly4/g;->H:Lz4/c;

    .line 877
    .line 878
    iget-object v15, v15, Lz4/c;->j:Lm4/b0;

    .line 879
    .line 880
    if-eqz v15, :cond_2e

    .line 881
    .line 882
    move/from16 v26, v4

    .line 883
    .line 884
    move/from16 v27, v5

    .line 885
    .line 886
    iget-wide v4, v15, Lm4/b0;->a:J

    .line 887
    .line 888
    cmp-long v15, v4, v20

    .line 889
    .line 890
    if-nez v15, :cond_30

    .line 891
    .line 892
    :cond_2e
    const/high16 v4, 0x3f800000    # 1.0f

    .line 893
    .line 894
    const/high16 v5, 0x3f800000    # 1.0f

    .line 895
    .line 896
    goto :goto_1e

    .line 897
    :cond_2f
    move/from16 v26, v4

    .line 898
    .line 899
    move/from16 v27, v5

    .line 900
    .line 901
    :cond_30
    move/from16 v4, v26

    .line 902
    .line 903
    move/from16 v5, v27

    .line 904
    .line 905
    :goto_1e
    new-instance v15, Lm4/b0;

    .line 906
    .line 907
    invoke-direct {v15}, Lm4/b0;-><init>()V

    .line 908
    .line 909
    .line 910
    iput-wide v6, v15, Lm4/b0;->a:J

    .line 911
    .line 912
    iput-wide v8, v15, Lm4/b0;->b:J

    .line 913
    .line 914
    iput-wide v2, v15, Lm4/b0;->c:J

    .line 915
    .line 916
    iput v4, v15, Lm4/b0;->d:F

    .line 917
    .line 918
    iput v5, v15, Lm4/b0;->e:F

    .line 919
    .line 920
    new-instance v2, Lm4/c0;

    .line 921
    .line 922
    invoke-direct {v2, v15}, Lm4/c0;-><init>(Lm4/b0;)V

    .line 923
    .line 924
    .line 925
    iput-object v2, v1, Ly4/g;->E:Lm4/c0;

    .line 926
    .line 927
    iget-object v2, v1, Ly4/g;->H:Lz4/c;

    .line 928
    .line 929
    iget-wide v2, v2, Lz4/c;->a:J

    .line 930
    .line 931
    invoke-static {v11, v12}, Lp4/c0;->c0(J)J

    .line 932
    .line 933
    .line 934
    move-result-wide v4

    .line 935
    add-long/2addr v4, v2

    .line 936
    iget-object v2, v1, Ly4/g;->E:Lm4/c0;

    .line 937
    .line 938
    iget-wide v2, v2, Lm4/c0;->a:J

    .line 939
    .line 940
    invoke-static {v2, v3}, Lp4/c0;->N(J)J

    .line 941
    .line 942
    .line 943
    move-result-wide v2

    .line 944
    sub-long v6, v24, v2

    .line 945
    .line 946
    div-long v2, v34, v18

    .line 947
    .line 948
    invoke-static {v13, v14, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 949
    .line 950
    .line 951
    move-result-wide v2

    .line 952
    cmp-long v8, v6, v2

    .line 953
    .line 954
    if-gez v8, :cond_31

    .line 955
    .line 956
    move-wide/from16 v36, v2

    .line 957
    .line 958
    move-wide/from16 v27, v4

    .line 959
    .line 960
    goto :goto_1f

    .line 961
    :cond_31
    move-wide/from16 v27, v4

    .line 962
    .line 963
    move-wide/from16 v36, v6

    .line 964
    .line 965
    goto :goto_1f

    .line 966
    :cond_32
    move v10, v2

    .line 967
    move-wide/from16 v20, v3

    .line 968
    .line 969
    move-wide/from16 v27, v20

    .line 970
    .line 971
    move-wide/from16 v36, v22

    .line 972
    .line 973
    :goto_1f
    iget-wide v2, v0, Lz4/h;->b:J

    .line 974
    .line 975
    invoke-static {v2, v3}, Lp4/c0;->N(J)J

    .line 976
    .line 977
    .line 978
    move-result-wide v2

    .line 979
    sub-long v32, v11, v2

    .line 980
    .line 981
    new-instance v24, Ly4/e;

    .line 982
    .line 983
    iget-object v0, v1, Ly4/g;->H:Lz4/c;

    .line 984
    .line 985
    iget-wide v2, v0, Lz4/c;->a:J

    .line 986
    .line 987
    iget-wide v4, v1, Ly4/g;->L:J

    .line 988
    .line 989
    iget v6, v1, Ly4/g;->O:I

    .line 990
    .line 991
    invoke-virtual {v1}, Ly4/g;->i()Lm4/i0;

    .line 992
    .line 993
    .line 994
    move-result-object v39

    .line 995
    iget-object v7, v1, Ly4/g;->H:Lz4/c;

    .line 996
    .line 997
    iget-boolean v7, v7, Lz4/c;->d:Z

    .line 998
    .line 999
    if-eqz v7, :cond_33

    .line 1000
    .line 1001
    iget-object v7, v1, Ly4/g;->E:Lm4/c0;

    .line 1002
    .line 1003
    :goto_20
    move-object/from16 v38, v0

    .line 1004
    .line 1005
    move-wide/from16 v25, v2

    .line 1006
    .line 1007
    move-wide/from16 v29, v4

    .line 1008
    .line 1009
    move/from16 v31, v6

    .line 1010
    .line 1011
    move-object/from16 v40, v7

    .line 1012
    .line 1013
    goto :goto_21

    .line 1014
    :cond_33
    const/4 v7, 0x0

    .line 1015
    goto :goto_20

    .line 1016
    :goto_21
    invoke-direct/range {v24 .. v40}, Ly4/e;-><init>(JJJIJJJLz4/c;Lm4/i0;Lm4/c0;)V

    .line 1017
    .line 1018
    .line 1019
    move-object/from16 v0, v24

    .line 1020
    .line 1021
    invoke-virtual {v1, v0}, Lj5/a;->n(Lm4/i1;)V

    .line 1022
    .line 1023
    .line 1024
    iget-boolean v0, v1, Ly4/g;->h:Z

    .line 1025
    .line 1026
    if-nez v0, :cond_3d

    .line 1027
    .line 1028
    iget-object v0, v1, Ly4/g;->D:Landroid/os/Handler;

    .line 1029
    .line 1030
    iget-object v2, v1, Ly4/g;->w:Ly4/c;

    .line 1031
    .line 1032
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1033
    .line 1034
    .line 1035
    if-eqz v10, :cond_3a

    .line 1036
    .line 1037
    iget-object v0, v1, Ly4/g;->D:Landroid/os/Handler;

    .line 1038
    .line 1039
    iget-object v3, v1, Ly4/g;->H:Lz4/c;

    .line 1040
    .line 1041
    iget-wide v4, v1, Ly4/g;->L:J

    .line 1042
    .line 1043
    invoke-static {v4, v5}, Lp4/c0;->z(J)J

    .line 1044
    .line 1045
    .line 1046
    move-result-wide v4

    .line 1047
    iget-object v6, v3, Lz4/c;->m:Ljava/util/List;

    .line 1048
    .line 1049
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1050
    .line 1051
    .line 1052
    move-result v6

    .line 1053
    const/16 v16, 0x1

    .line 1054
    .line 1055
    add-int/lit8 v6, v6, -0x1

    .line 1056
    .line 1057
    invoke-virtual {v3, v6}, Lz4/c;->b(I)Lz4/h;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v7

    .line 1061
    iget-wide v8, v7, Lz4/h;->b:J

    .line 1062
    .line 1063
    iget-object v7, v7, Lz4/h;->c:Ljava/util/List;

    .line 1064
    .line 1065
    invoke-static {v8, v9}, Lp4/c0;->N(J)J

    .line 1066
    .line 1067
    .line 1068
    move-result-wide v8

    .line 1069
    invoke-virtual {v3, v6}, Lz4/c;->d(I)J

    .line 1070
    .line 1071
    .line 1072
    move-result-wide v10

    .line 1073
    invoke-static {v4, v5}, Lp4/c0;->N(J)J

    .line 1074
    .line 1075
    .line 1076
    move-result-wide v4

    .line 1077
    iget-wide v12, v3, Lz4/c;->a:J

    .line 1078
    .line 1079
    invoke-static {v12, v13}, Lp4/c0;->N(J)J

    .line 1080
    .line 1081
    .line 1082
    move-result-wide v12

    .line 1083
    iget-wide v14, v3, Lz4/c;->e:J

    .line 1084
    .line 1085
    invoke-static {v14, v15}, Lp4/c0;->N(J)J

    .line 1086
    .line 1087
    .line 1088
    move-result-wide v14

    .line 1089
    const-wide/32 v18, 0x4c4b40

    .line 1090
    .line 1091
    .line 1092
    cmp-long v3, v14, v20

    .line 1093
    .line 1094
    if-eqz v3, :cond_34

    .line 1095
    .line 1096
    cmp-long v3, v14, v18

    .line 1097
    .line 1098
    if-gez v3, :cond_34

    .line 1099
    .line 1100
    goto :goto_22

    .line 1101
    :cond_34
    move-wide/from16 v14, v18

    .line 1102
    .line 1103
    :goto_22
    const/4 v3, 0x0

    .line 1104
    :goto_23
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1105
    .line 1106
    .line 1107
    move-result v6

    .line 1108
    if-ge v3, v6, :cond_39

    .line 1109
    .line 1110
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v6

    .line 1114
    check-cast v6, Lz4/a;

    .line 1115
    .line 1116
    iget-object v6, v6, Lz4/a;->c:Ljava/util/List;

    .line 1117
    .line 1118
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 1119
    .line 1120
    .line 1121
    move-result v16

    .line 1122
    if-eqz v16, :cond_35

    .line 1123
    .line 1124
    move/from16 v16, v3

    .line 1125
    .line 1126
    const/4 v3, 0x0

    .line 1127
    goto :goto_24

    .line 1128
    :cond_35
    move/from16 v16, v3

    .line 1129
    .line 1130
    const/4 v3, 0x0

    .line 1131
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v6

    .line 1135
    check-cast v6, Lz4/m;

    .line 1136
    .line 1137
    invoke-virtual {v6}, Lz4/m;->d()Ly4/h;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v6

    .line 1141
    if-eqz v6, :cond_38

    .line 1142
    .line 1143
    add-long v17, v12, v8

    .line 1144
    .line 1145
    invoke-interface {v6, v10, v11, v4, v5}, Ly4/h;->g(JJ)J

    .line 1146
    .line 1147
    .line 1148
    move-result-wide v24

    .line 1149
    add-long v24, v24, v17

    .line 1150
    .line 1151
    sub-long v24, v24, v4

    .line 1152
    .line 1153
    cmp-long v6, v24, v22

    .line 1154
    .line 1155
    if-gtz v6, :cond_36

    .line 1156
    .line 1157
    goto :goto_24

    .line 1158
    :cond_36
    const-wide/32 v17, 0x186a0

    .line 1159
    .line 1160
    .line 1161
    sub-long v26, v14, v17

    .line 1162
    .line 1163
    cmp-long v6, v24, v26

    .line 1164
    .line 1165
    if-ltz v6, :cond_37

    .line 1166
    .line 1167
    cmp-long v6, v24, v14

    .line 1168
    .line 1169
    if-lez v6, :cond_38

    .line 1170
    .line 1171
    add-long v17, v14, v17

    .line 1172
    .line 1173
    cmp-long v6, v24, v17

    .line 1174
    .line 1175
    if-gez v6, :cond_38

    .line 1176
    .line 1177
    :cond_37
    move-wide/from16 v14, v24

    .line 1178
    .line 1179
    :cond_38
    :goto_24
    add-int/lit8 v6, v16, 0x1

    .line 1180
    .line 1181
    move v3, v6

    .line 1182
    goto :goto_23

    .line 1183
    :cond_39
    const-wide/16 v3, 0x3e8

    .line 1184
    .line 1185
    sget-object v5, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 1186
    .line 1187
    invoke-static {v14, v15, v3, v4, v5}, La/a;->A(JJLjava/math/RoundingMode;)J

    .line 1188
    .line 1189
    .line 1190
    move-result-wide v3

    .line 1191
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1192
    .line 1193
    .line 1194
    :cond_3a
    iget-boolean v0, v1, Ly4/g;->I:Z

    .line 1195
    .line 1196
    if-eqz v0, :cond_3b

    .line 1197
    .line 1198
    invoke-virtual {v1}, Ly4/g;->A()V

    .line 1199
    .line 1200
    .line 1201
    goto :goto_25

    .line 1202
    :cond_3b
    if-eqz p1, :cond_3d

    .line 1203
    .line 1204
    iget-object v0, v1, Ly4/g;->H:Lz4/c;

    .line 1205
    .line 1206
    iget-boolean v2, v0, Lz4/c;->d:Z

    .line 1207
    .line 1208
    if-eqz v2, :cond_3d

    .line 1209
    .line 1210
    iget-wide v2, v0, Lz4/c;->e:J

    .line 1211
    .line 1212
    cmp-long v0, v2, v20

    .line 1213
    .line 1214
    if-eqz v0, :cond_3d

    .line 1215
    .line 1216
    cmp-long v0, v2, v22

    .line 1217
    .line 1218
    if-nez v0, :cond_3c

    .line 1219
    .line 1220
    const-wide/16 v2, 0x1388

    .line 1221
    .line 1222
    :cond_3c
    iget-wide v4, v1, Ly4/g;->J:J

    .line 1223
    .line 1224
    add-long/2addr v4, v2

    .line 1225
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1226
    .line 1227
    .line 1228
    move-result-wide v2

    .line 1229
    sub-long/2addr v4, v2

    .line 1230
    move-wide/from16 v2, v22

    .line 1231
    .line 1232
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 1233
    .line 1234
    .line 1235
    move-result-wide v2

    .line 1236
    iget-object v0, v1, Ly4/g;->D:Landroid/os/Handler;

    .line 1237
    .line 1238
    iget-object v4, v1, Ly4/g;->v:Ly4/c;

    .line 1239
    .line 1240
    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1241
    .line 1242
    .line 1243
    :cond_3d
    :goto_25
    return-void
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
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
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
.end method

.method public final z(Lff/g;Ln5/q;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ln5/r;

    .line 4
    .line 5
    iget-object v2, v0, Ly4/g;->z:Ls4/h;

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    iget-object v3, v3, Lff/g;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    sget-object v10, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 16
    .line 17
    const-string v3, "The uri must be set."

    .line 18
    .line 19
    invoke-static {v5, v3}, Lp4/c;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Ls4/m;

    .line 23
    .line 24
    const-wide/16 v6, 0x0

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    const/4 v9, 0x0

    .line 28
    const-wide/16 v11, 0x0

    .line 29
    .line 30
    const-wide/16 v13, -0x1

    .line 31
    .line 32
    const/4 v15, 0x0

    .line 33
    const/16 v16, 0x1

    .line 34
    .line 35
    invoke-direct/range {v4 .. v16}, Ls4/m;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    const/4 v3, 0x5

    .line 39
    move-object/from16 v5, p2

    .line 40
    .line 41
    invoke-direct {v1, v2, v4, v3, v5}, Ln5/r;-><init>(Ls4/h;Ls4/m;ILn5/q;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Ly4/d;

    .line 45
    .line 46
    const/4 v3, 0x4

    .line 47
    invoke-direct {v2, v0, v3}, Ly4/d;-><init>(Ly4/g;I)V

    .line 48
    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    iget-object v4, v0, Ly4/g;->A:Ln5/o;

    .line 52
    .line 53
    invoke-virtual {v4, v1, v2, v3}, Ln5/o;->f(Ln5/l;Ln5/j;I)V

    .line 54
    .line 55
    .line 56
    return-void
    .line 57
    .line 58
.end method
