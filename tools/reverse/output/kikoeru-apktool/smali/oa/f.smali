.class public abstract Loa/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Ljava/util/List;

.field public static final b:Loa/g;

.field public static final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-string v0, "en"

    .line 2
    .line 3
    const-string v1, "zh-CN"

    .line 4
    .line 5
    const-string v2, "auto"

    .line 6
    .line 7
    const-string v3, "ja"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lud/b;->x([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Loa/f;->a:Ljava/util/List;

    .line 18
    .line 19
    new-instance v0, Loa/g;

    .line 20
    .line 21
    sget v1, Lapp/nekogram/translator/g;->d:I

    .line 22
    .line 23
    sget-object v1, Lapp/nekogram/translator/k0;->a:Lapp/nekogram/translator/g;

    .line 24
    .line 25
    const-string v2, "getInstance(...)"

    .line 26
    .line 27
    invoke-static {v1, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1}, Loa/g;-><init>(Lapp/nekogram/translator/c;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Loa/f;->b:Loa/g;

    .line 34
    .line 35
    new-instance v1, Lub/k;

    .line 36
    .line 37
    const-string v3, "google"

    .line 38
    .line 39
    invoke-direct {v1, v3, v0}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Loa/g;

    .line 43
    .line 44
    sget-object v3, Lapp/nekogram/translator/d;->d:Ljava/lang/String;

    .line 45
    .line 46
    sget-object v3, Lapp/nekogram/translator/i0;->a:Lapp/nekogram/translator/d;

    .line 47
    .line 48
    invoke-static {v3, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v3}, Loa/g;-><init>(Lapp/nekogram/translator/c;)V

    .line 52
    .line 53
    .line 54
    new-instance v3, Lub/k;

    .line 55
    .line 56
    const-string v4, "deepl"

    .line 57
    .line 58
    invoke-direct {v3, v4, v0}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Loa/d;->a:Loa/d;

    .line 62
    .line 63
    new-instance v4, Lub/k;

    .line 64
    .line 65
    const-string v5, "deeplApi"

    .line 66
    .line 67
    invoke-direct {v4, v5, v0}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Loa/g;

    .line 71
    .line 72
    sget v5, Lapp/nekogram/translator/q;->c:I

    .line 73
    .line 74
    sget-object v5, Lapp/nekogram/translator/m0;->a:Lapp/nekogram/translator/q;

    .line 75
    .line 76
    invoke-static {v5, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, v5}, Loa/g;-><init>(Lapp/nekogram/translator/c;)V

    .line 80
    .line 81
    .line 82
    new-instance v5, Lub/k;

    .line 83
    .line 84
    const-string v6, "microsoft"

    .line 85
    .line 86
    invoke-direct {v5, v6, v0}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Loa/g;

    .line 90
    .line 91
    sget v6, Lapp/nekogram/translator/k;->b:I

    .line 92
    .line 93
    sget-object v6, Lapp/nekogram/translator/l0;->a:Lapp/nekogram/translator/k;

    .line 94
    .line 95
    invoke-static {v6, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {v0, v6}, Loa/g;-><init>(Lapp/nekogram/translator/c;)V

    .line 99
    .line 100
    .line 101
    new-instance v6, Lub/k;

    .line 102
    .line 103
    const-string v7, "lingo"

    .line 104
    .line 105
    invoke-direct {v6, v7, v0}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    new-instance v0, Loa/g;

    .line 109
    .line 110
    sget v7, Lapp/nekogram/translator/b;->h:I

    .line 111
    .line 112
    sget-object v7, Lapp/nekogram/translator/g0;->a:Lapp/nekogram/translator/b;

    .line 113
    .line 114
    invoke-static {v7, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-direct {v0, v7}, Loa/g;-><init>(Lapp/nekogram/translator/c;)V

    .line 118
    .line 119
    .line 120
    new-instance v7, Lub/k;

    .line 121
    .line 122
    const-string v8, "baidu"

    .line 123
    .line 124
    invoke-direct {v7, v8, v0}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    new-instance v0, Loa/g;

    .line 128
    .line 129
    sget v8, Lapp/nekogram/translator/w;->l:I

    .line 130
    .line 131
    sget-object v8, Lapp/nekogram/translator/n0;->a:Lapp/nekogram/translator/w;

    .line 132
    .line 133
    invoke-static {v8, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {v0, v8}, Loa/g;-><init>(Lapp/nekogram/translator/c;)V

    .line 137
    .line 138
    .line 139
    new-instance v2, Lub/k;

    .line 140
    .line 141
    const-string v8, "tencent"

    .line 142
    .line 143
    invoke-direct {v2, v8, v0}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    const/4 v0, 0x7

    .line 147
    new-array v0, v0, [Lub/k;

    .line 148
    .line 149
    const/4 v8, 0x0

    .line 150
    aput-object v1, v0, v8

    .line 151
    .line 152
    const/4 v1, 0x1

    .line 153
    aput-object v3, v0, v1

    .line 154
    .line 155
    const/4 v1, 0x2

    .line 156
    aput-object v4, v0, v1

    .line 157
    .line 158
    const/4 v1, 0x3

    .line 159
    aput-object v5, v0, v1

    .line 160
    .line 161
    const/4 v1, 0x4

    .line 162
    aput-object v6, v0, v1

    .line 163
    .line 164
    const/4 v1, 0x5

    .line 165
    aput-object v7, v0, v1

    .line 166
    .line 167
    const/4 v1, 0x6

    .line 168
    aput-object v2, v0, v1

    .line 169
    .line 170
    invoke-static {v0}, Lvb/w;->v([Lub/k;)Ljava/util/Map;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    sput-object v0, Loa/f;->c:Ljava/lang/Object;

    .line 175
    .line 176
    return-void
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
.end method

.method public static a()Loa/e;
    .locals 4

    .line 1
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "translateEngine"

    .line 12
    .line 13
    const-string v3, "google"

    .line 14
    .line 15
    invoke-static {v0, v2, v3, v1}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lhg/b;->a()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    sget-object v1, Loa/f;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Loa/e;

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    sget-object v0, Loa/f;->b:Loa/g;

    .line 36
    .line 37
    :cond_0
    return-object v0
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
