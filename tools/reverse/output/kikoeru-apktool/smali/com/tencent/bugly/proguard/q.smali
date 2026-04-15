.class public final Lcom/tencent/bugly/proguard/q;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lcom/tencent/bugly/proguard/H;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/H;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tencent/bugly/proguard/q;->c:Lcom/tencent/bugly/proguard/H;

    .line 5
    .line 6
    iput p2, p0, Lcom/tencent/bugly/proguard/q;->a:I

    .line 7
    .line 8
    iput p3, p0, Lcom/tencent/bugly/proguard/q;->b:I

    .line 9
    .line 10
    return-void
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
.method public final run()V
    .locals 14

    .line 1
    iget v0, p0, Lcom/tencent/bugly/proguard/q;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tencent/bugly/proguard/q;->c:Lcom/tencent/bugly/proguard/H;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-static {v1}, Lcom/tencent/bugly/proguard/H;->a(Lcom/tencent/bugly/proguard/H;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/H;->a(Lcom/tencent/bugly/proguard/H;I)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-static {v1}, Lcom/tencent/bugly/proguard/H;->b(Lcom/tencent/bugly/proguard/H;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-nez v4, :cond_2

    .line 41
    .line 42
    new-instance v4, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lcom/tencent/bugly/proguard/H;->b(Lcom/tencent/bugly/proguard/H;)Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-static {v1}, Lcom/tencent/bugly/proguard/H;->b(Lcom/tencent/bugly/proguard/H;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Ljava/util/Map;

    .line 71
    .line 72
    invoke-static {v1}, Lcom/tencent/bugly/proguard/H;->a(Lcom/tencent/bugly/proguard/H;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    iget v5, p0, Lcom/tencent/bugly/proguard/q;->b:I

    .line 81
    .line 82
    if-nez v4, :cond_3

    .line 83
    .line 84
    :try_start_1
    new-instance v4, Lcom/tencent/bugly/proguard/E;

    .line 85
    .line 86
    invoke-direct {v4}, Lcom/tencent/bugly/proguard/E;-><init>()V

    .line 87
    .line 88
    .line 89
    int-to-long v6, v0

    .line 90
    iput-wide v6, v4, Lcom/tencent/bugly/proguard/E;->a:J

    .line 91
    .line 92
    sget-wide v6, Lcom/tencent/bugly/proguard/H;->b:J

    .line 93
    .line 94
    iput-wide v6, v4, Lcom/tencent/bugly/proguard/E;->g:J

    .line 95
    .line 96
    invoke-static {v1}, Lcom/tencent/bugly/proguard/H;->a(Lcom/tencent/bugly/proguard/H;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    iput-object v6, v4, Lcom/tencent/bugly/proguard/E;->b:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/a;->m()Lcom/tencent/bugly/crashreport/common/info/a;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    iget-object v6, v6, Lcom/tencent/bugly/crashreport/common/info/a;->E:Ljava/lang/String;

    .line 107
    .line 108
    iput-object v6, v4, Lcom/tencent/bugly/proguard/E;->f:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/a;->m()Lcom/tencent/bugly/crashreport/common/info/a;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    iget-object v6, v6, Lcom/tencent/bugly/crashreport/common/info/a;->l:Ljava/lang/String;

    .line 115
    .line 116
    iput-object v6, v4, Lcom/tencent/bugly/proguard/E;->e:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 119
    .line 120
    .line 121
    move-result-wide v6

    .line 122
    iput-wide v6, v4, Lcom/tencent/bugly/proguard/E;->c:J

    .line 123
    .line 124
    iput v5, v4, Lcom/tencent/bugly/proguard/E;->d:I

    .line 125
    .line 126
    invoke-static {v1}, Lcom/tencent/bugly/proguard/H;->b(Lcom/tencent/bugly/proguard/H;)Ljava/util/Map;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    check-cast v5, Ljava/util/Map;

    .line 139
    .line 140
    invoke-static {v1}, Lcom/tencent/bugly/proguard/H;->a(Lcom/tencent/bugly/proguard/H;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_3
    invoke-static {v1}, Lcom/tencent/bugly/proguard/H;->b(Lcom/tencent/bugly/proguard/H;)Ljava/util/Map;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, Ljava/util/Map;

    .line 161
    .line 162
    invoke-static {v1}, Lcom/tencent/bugly/proguard/H;->a(Lcom/tencent/bugly/proguard/H;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    check-cast v4, Lcom/tencent/bugly/proguard/E;

    .line 171
    .line 172
    iput v5, v4, Lcom/tencent/bugly/proguard/E;->d:I

    .line 173
    .line 174
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    const/4 v7, 0x0

    .line 184
    :cond_4
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-eqz v8, :cond_9

    .line 189
    .line 190
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    check-cast v8, Lcom/tencent/bugly/proguard/E;

    .line 195
    .line 196
    iget-wide v9, v8, Lcom/tencent/bugly/proguard/E;->g:J

    .line 197
    .line 198
    iget-wide v11, v4, Lcom/tencent/bugly/proguard/E;->g:J

    .line 199
    .line 200
    cmp-long v13, v9, v11

    .line 201
    .line 202
    if-nez v13, :cond_5

    .line 203
    .line 204
    iget-object v9, v8, Lcom/tencent/bugly/proguard/E;->b:Ljava/lang/String;

    .line 205
    .line 206
    if-eqz v9, :cond_5

    .line 207
    .line 208
    iget-object v10, v4, Lcom/tencent/bugly/proguard/E;->b:Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v9

    .line 214
    if-eqz v9, :cond_5

    .line 215
    .line 216
    iget v7, v4, Lcom/tencent/bugly/proguard/E;->d:I

    .line 217
    .line 218
    iput v7, v8, Lcom/tencent/bugly/proguard/E;->d:I

    .line 219
    .line 220
    const/4 v7, 0x1

    .line 221
    :cond_5
    iget-object v9, v8, Lcom/tencent/bugly/proguard/E;->e:Ljava/lang/String;

    .line 222
    .line 223
    if-eqz v9, :cond_6

    .line 224
    .line 225
    iget-object v10, v4, Lcom/tencent/bugly/proguard/E;->e:Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    if-eqz v9, :cond_8

    .line 232
    .line 233
    :cond_6
    iget-object v9, v8, Lcom/tencent/bugly/proguard/E;->f:Ljava/lang/String;

    .line 234
    .line 235
    if-eqz v9, :cond_7

    .line 236
    .line 237
    iget-object v10, v4, Lcom/tencent/bugly/proguard/E;->f:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    if-eqz v9, :cond_8

    .line 244
    .line 245
    :cond_7
    iget v9, v8, Lcom/tencent/bugly/proguard/E;->d:I

    .line 246
    .line 247
    if-gtz v9, :cond_4

    .line 248
    .line 249
    :cond_8
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    goto :goto_1

    .line 253
    :cond_9
    invoke-interface {v3, v5}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 254
    .line 255
    .line 256
    if-nez v7, :cond_a

    .line 257
    .line 258
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    :cond_a
    invoke-static {v1, v0, v3}, Lcom/tencent/bugly/proguard/H;->a(Lcom/tencent/bugly/proguard/H;ILjava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :catch_0
    new-array v0, v2, [Ljava/lang/Object;

    .line 266
    .line 267
    const-string v1, "saveCrashRecord failed"

    .line 268
    .line 269
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    return-void
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
