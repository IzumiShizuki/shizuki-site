.class public abstract Lld/n;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Ljava/lang/Object;

.field public static final c:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v0, v0, [Lld/a;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    sget-object v2, Lld/a;->d:Lld/a;

    .line 6
    .line 7
    aput-object v2, v0, v1

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    sget-object v3, Lld/a;->b:Lld/a;

    .line 11
    .line 12
    aput-object v3, v0, v2

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    sget-object v4, Lld/a;->c:Lld/a;

    .line 16
    .line 17
    aput-object v4, v0, v3

    .line 18
    .line 19
    const/4 v5, 0x3

    .line 20
    sget-object v6, Lld/a;->f:Lld/a;

    .line 21
    .line 22
    aput-object v6, v0, v5

    .line 23
    .line 24
    const/4 v6, 0x4

    .line 25
    sget-object v7, Lld/a;->e:Lld/a;

    .line 26
    .line 27
    aput-object v7, v0, v6

    .line 28
    .line 29
    invoke-static {v0}, Lud/b;->x([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v4}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    sget-object v7, Lld/x;->a:Lbe/c;

    .line 38
    .line 39
    new-instance v8, Lld/m;

    .line 40
    .line 41
    new-instance v9, Ltd/h;

    .line 42
    .line 43
    sget-object v10, Ltd/g;->c:Ltd/g;

    .line 44
    .line 45
    invoke-direct {v9, v10}, Ltd/h;-><init>(Ltd/g;)V

    .line 46
    .line 47
    .line 48
    check-cast v0, Ljava/util/Collection;

    .line 49
    .line 50
    invoke-direct {v8, v9, v0, v1, v2}, Lld/m;-><init>(Ltd/h;Ljava/util/Collection;ZZ)V

    .line 51
    .line 52
    .line 53
    new-instance v9, Lub/k;

    .line 54
    .line 55
    invoke-direct {v9, v7, v8}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v7, Lld/x;->b:Lbe/c;

    .line 59
    .line 60
    new-instance v8, Lld/m;

    .line 61
    .line 62
    new-instance v11, Ltd/h;

    .line 63
    .line 64
    invoke-direct {v11, v10}, Ltd/h;-><init>(Ltd/g;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v8, v11, v0, v1, v2}, Lld/m;-><init>(Ltd/h;Ljava/util/Collection;ZZ)V

    .line 68
    .line 69
    .line 70
    new-instance v11, Lub/k;

    .line 71
    .line 72
    invoke-direct {v11, v7, v8}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object v7, Lld/x;->c:Lbe/c;

    .line 76
    .line 77
    new-instance v8, Lld/m;

    .line 78
    .line 79
    new-instance v12, Ltd/h;

    .line 80
    .line 81
    sget-object v13, Ltd/g;->a:Ltd/g;

    .line 82
    .line 83
    invoke-direct {v12, v13}, Ltd/h;-><init>(Ltd/g;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v8, v12, v0, v6}, Lld/m;-><init>(Ltd/h;Ljava/util/Collection;I)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Lub/k;

    .line 90
    .line 91
    invoke-direct {v0, v7, v8}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    new-array v5, v5, [Lub/k;

    .line 95
    .line 96
    aput-object v9, v5, v1

    .line 97
    .line 98
    aput-object v11, v5, v2

    .line 99
    .line 100
    aput-object v0, v5, v3

    .line 101
    .line 102
    invoke-static {v5}, Lvb/w;->v([Lub/k;)Ljava/util/Map;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sput-object v0, Lld/n;->a:Ljava/lang/Object;

    .line 107
    .line 108
    sget-object v5, Lld/x;->h:Lbe/c;

    .line 109
    .line 110
    new-instance v6, Lld/m;

    .line 111
    .line 112
    new-instance v7, Ltd/h;

    .line 113
    .line 114
    invoke-direct {v7, v10}, Ltd/h;-><init>(Ltd/g;)V

    .line 115
    .line 116
    .line 117
    check-cast v4, Ljava/util/Collection;

    .line 118
    .line 119
    const/16 v8, 0xc

    .line 120
    .line 121
    invoke-direct {v6, v7, v4, v8}, Lld/m;-><init>(Ltd/h;Ljava/util/Collection;I)V

    .line 122
    .line 123
    .line 124
    new-instance v7, Lub/k;

    .line 125
    .line 126
    invoke-direct {v7, v5, v6}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    sget-object v5, Lld/x;->i:Lbe/c;

    .line 130
    .line 131
    new-instance v6, Lld/m;

    .line 132
    .line 133
    new-instance v9, Ltd/h;

    .line 134
    .line 135
    sget-object v10, Ltd/g;->b:Ltd/g;

    .line 136
    .line 137
    invoke-direct {v9, v10}, Ltd/h;-><init>(Ltd/g;)V

    .line 138
    .line 139
    .line 140
    invoke-direct {v6, v9, v4, v8}, Lld/m;-><init>(Ltd/h;Ljava/util/Collection;I)V

    .line 141
    .line 142
    .line 143
    new-instance v4, Lub/k;

    .line 144
    .line 145
    invoke-direct {v4, v5, v6}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    new-array v3, v3, [Lub/k;

    .line 149
    .line 150
    aput-object v7, v3, v1

    .line 151
    .line 152
    aput-object v4, v3, v2

    .line 153
    .line 154
    invoke-static {v3}, Lvb/w;->v([Lub/k;)Ljava/util/Map;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v0, v1}, Lvb/w;->x(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    sput-object v0, Lld/n;->c:Ljava/util/LinkedHashMap;

    .line 163
    .line 164
    return-void
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
.end method
