.class public final Lcom/tencent/bugly/crashreport/crash/c;
.super Ljava/lang/Thread;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/bugly/crashreport/crash/c;->a:I

    iput-object p2, p0, Lcom/tencent/bugly/crashreport/crash/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method public constructor <init>(Lf5/b;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcom/tencent/bugly/crashreport/crash/c;->a:I

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/crashreport/crash/c;->b:Ljava/lang/Object;

    const-string p1, "ExoPlayer:SimpleDecoder"

    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lcom/tencent/bugly/crashreport/crash/c;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v1, Lcom/tencent/bugly/crashreport/crash/c;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v4, Lf5/b;

    .line 13
    .line 14
    :goto_0
    :try_start_0
    invoke-virtual {v4}, Lf5/b;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void

    .line 22
    :catch_0
    move-exception v0

    .line 23
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    throw v2

    .line 29
    :pswitch_0
    check-cast v4, Lcom/tencent/bugly/crashreport/common/strategy/c;

    .line 30
    .line 31
    :try_start_1
    invoke-static {}, Lcom/tencent/bugly/proguard/J;->a()Lcom/tencent/bugly/proguard/J;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget v5, Lcom/tencent/bugly/crashreport/common/strategy/c;->a:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-virtual {v0, v5, v6, v3}, Lcom/tencent/bugly/proguard/J;->a(ILcom/tencent/bugly/proguard/I;Z)Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const-string v3, "device"

    .line 45
    .line 46
    :try_start_2
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    .line 52
    const-string v5, "gateway"

    .line 53
    .line 54
    :try_start_3
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, [B

    .line 59
    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    invoke-static {v4}, Lcom/tencent/bugly/crashreport/common/strategy/c;->a(Lcom/tencent/bugly/crashreport/common/strategy/c;)Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v5}, Lcom/tencent/bugly/crashreport/common/info/a;->a(Landroid/content/Context;)Lcom/tencent/bugly/crashreport/common/info/a;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    new-instance v6, Ljava/lang/String;

    .line 71
    .line 72
    invoke-direct {v6, v3}, Ljava/lang/String;-><init>([B)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v6}, Lcom/tencent/bugly/crashreport/common/info/a;->f(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto :goto_2

    .line 81
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 82
    .line 83
    invoke-static {v4}, Lcom/tencent/bugly/crashreport/common/strategy/c;->a(Lcom/tencent/bugly/crashreport/common/strategy/c;)Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {v3}, Lcom/tencent/bugly/crashreport/common/info/a;->a(Landroid/content/Context;)Lcom/tencent/bugly/crashreport/common/info/a;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    new-instance v5, Ljava/lang/String;

    .line 92
    .line 93
    invoke-direct {v5, v0}, Ljava/lang/String;-><init>([B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v5}, Lcom/tencent/bugly/crashreport/common/info/a;->e(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-virtual {v4}, Lcom/tencent/bugly/crashreport/common/strategy/c;->e()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v4, v0}, Lcom/tencent/bugly/crashreport/common/strategy/c;->a(Lcom/tencent/bugly/crashreport/common/strategy/c;Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 104
    .line 105
    .line 106
    invoke-static {v4}, Lcom/tencent/bugly/crashreport/common/strategy/c;->b(Lcom/tencent/bugly/crashreport/common/strategy/c;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-eqz v0, :cond_4

    .line 111
    .line 112
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/strategy/c;->a()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->b(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_3

    .line 121
    .line 122
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/strategy/c;->a()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_3

    .line 131
    .line 132
    invoke-static {v4}, Lcom/tencent/bugly/crashreport/common/strategy/c;->b(Lcom/tencent/bugly/crashreport/common/strategy/c;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/strategy/c;->a()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    iput-object v3, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->q:Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {v4}, Lcom/tencent/bugly/crashreport/common/strategy/c;->b(Lcom/tencent/bugly/crashreport/common/strategy/c;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/strategy/c;->a()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    iput-object v3, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->r:Ljava/lang/String;

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_3
    invoke-static {v4}, Lcom/tencent/bugly/crashreport/common/strategy/c;->b(Lcom/tencent/bugly/crashreport/common/strategy/c;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    sget-object v3, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->a:Ljava/lang/String;

    .line 158
    .line 159
    iput-object v3, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->q:Ljava/lang/String;

    .line 160
    .line 161
    invoke-static {v4}, Lcom/tencent/bugly/crashreport/common/strategy/c;->b(Lcom/tencent/bugly/crashreport/common/strategy/c;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    sget-object v3, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->b:Ljava/lang/String;

    .line 166
    .line 167
    iput-object v3, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->r:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :goto_2
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-nez v3, :cond_4

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 177
    .line 178
    .line 179
    :cond_4
    :goto_3
    invoke-static {v4}, Lcom/tencent/bugly/crashreport/common/strategy/c;->b(Lcom/tencent/bugly/crashreport/common/strategy/c;)Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v4, v0, v2}, Lcom/tencent/bugly/crashreport/common/strategy/c;->a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;Z)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :pswitch_1
    check-cast v4, Lcom/tencent/bugly/crashreport/crash/h;

    .line 188
    .line 189
    invoke-static {v4}, Lcom/tencent/bugly/crashreport/crash/h;->b(Lcom/tencent/bugly/crashreport/crash/h;)Landroid/content/Context;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-wide/16 v5, 0x2710

    .line 194
    .line 195
    const-string v7, "local_crash_lock"

    .line 196
    .line 197
    invoke-static {v0, v7, v5, v6}, Lcom/tencent/bugly/proguard/ca;->a(Landroid/content/Context;Ljava/lang/String;J)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-nez v0, :cond_5

    .line 202
    .line 203
    new-array v0, v2, [Ljava/lang/Object;

    .line 204
    .line 205
    const-string v2, "Failed to lock file for uploading local crash."

    .line 206
    .line 207
    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_5
    iget-object v0, v4, Lcom/tencent/bugly/crashreport/crash/h;->r:Lcom/tencent/bugly/crashreport/crash/e;

    .line 212
    .line 213
    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/crash/e;->b()Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    if-eqz v0, :cond_8

    .line 218
    .line 219
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-lez v5, :cond_8

    .line 224
    .line 225
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    new-array v6, v3, [Ljava/lang/Object;

    .line 234
    .line 235
    aput-object v5, v6, v2

    .line 236
    .line 237
    const-string v5, "Size of crash list: %s"

    .line 238
    .line 239
    invoke-static {v5, v6}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    int-to-long v8, v5

    .line 247
    const-wide/16 v10, 0x14

    .line 248
    .line 249
    cmp-long v6, v8, v10

    .line 250
    .line 251
    if-lez v6, :cond_7

    .line 252
    .line 253
    new-instance v6, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 259
    .line 260
    .line 261
    :goto_4
    int-to-long v8, v2

    .line 262
    cmp-long v12, v8, v10

    .line 263
    .line 264
    if-gez v12, :cond_6

    .line 265
    .line 266
    add-int/lit8 v8, v5, -0x1

    .line 267
    .line 268
    sub-int/2addr v8, v2

    .line 269
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v8

    .line 273
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    add-int/lit8 v2, v2, 0x1

    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_6
    move-object v13, v6

    .line 280
    goto :goto_5

    .line 281
    :cond_7
    move-object v13, v0

    .line 282
    :goto_5
    iget-object v12, v4, Lcom/tencent/bugly/crashreport/crash/h;->r:Lcom/tencent/bugly/crashreport/crash/e;

    .line 283
    .line 284
    const/16 v17, 0x0

    .line 285
    .line 286
    const/16 v18, 0x0

    .line 287
    .line 288
    const-wide/16 v14, 0x0

    .line 289
    .line 290
    const/16 v16, 0x0

    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Lcom/tencent/bugly/crashreport/crash/e;->a(Ljava/util/List;JZZZ)V

    .line 293
    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_8
    new-array v0, v2, [Ljava/lang/Object;

    .line 297
    .line 298
    const-string v2, "no crash need to be uploaded at this start"

    .line 299
    .line 300
    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    :goto_6
    invoke-static {v4}, Lcom/tencent/bugly/crashreport/crash/h;->b(Lcom/tencent/bugly/crashreport/crash/h;)Landroid/content/Context;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v0, v7}, Lcom/tencent/bugly/proguard/ca;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 308
    .line 309
    .line 310
    :goto_7
    return-void

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
