.class public abstract Lkf/h;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lkf/n;

.field public static final b:I

.field public static final c:I

.field public static final d:Lapp/nekogram/translator/r;

.field public static final e:Lapp/nekogram/translator/r;

.field public static final f:Lapp/nekogram/translator/r;

.field public static final g:Lapp/nekogram/translator/r;

.field public static final h:Lapp/nekogram/translator/r;

.field public static final i:Lapp/nekogram/translator/r;

.field public static final j:Lapp/nekogram/translator/r;

.field public static final k:Lapp/nekogram/translator/r;

.field public static final l:Lapp/nekogram/translator/r;

.field public static final m:Lapp/nekogram/translator/r;

.field public static final n:Lapp/nekogram/translator/r;

.field public static final o:Lapp/nekogram/translator/r;

.field public static final p:Lapp/nekogram/translator/r;

.field public static final q:Lapp/nekogram/translator/r;

.field public static final r:Lapp/nekogram/translator/r;

.field public static final s:Lapp/nekogram/translator/r;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lkf/n;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x0

    .line 5
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct/range {v0 .. v5}, Lkf/n;-><init>(JLkf/n;Lkf/f;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lkf/h;->a:Lkf/n;

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    const/16 v1, 0xc

    .line 16
    .line 17
    const-string v2, "kotlinx.coroutines.bufferedChannel.segmentSize"

    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Lnf/b;->l(IILjava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Lkf/h;->b:I

    .line 24
    .line 25
    const-string v0, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    .line 26
    .line 27
    const/16 v2, 0x2710

    .line 28
    .line 29
    invoke-static {v2, v1, v0}, Lnf/b;->l(IILjava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sput v0, Lkf/h;->c:I

    .line 34
    .line 35
    new-instance v0, Lapp/nekogram/translator/r;

    .line 36
    .line 37
    const-string v1, "BUFFERED"

    .line 38
    .line 39
    const/4 v2, 0x7

    .line 40
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lkf/h;->d:Lapp/nekogram/translator/r;

    .line 44
    .line 45
    new-instance v0, Lapp/nekogram/translator/r;

    .line 46
    .line 47
    const-string v1, "SHOULD_BUFFER"

    .line 48
    .line 49
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lkf/h;->e:Lapp/nekogram/translator/r;

    .line 53
    .line 54
    new-instance v0, Lapp/nekogram/translator/r;

    .line 55
    .line 56
    const-string v1, "S_RESUMING_BY_RCV"

    .line 57
    .line 58
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lkf/h;->f:Lapp/nekogram/translator/r;

    .line 62
    .line 63
    new-instance v0, Lapp/nekogram/translator/r;

    .line 64
    .line 65
    const-string v1, "RESUMING_BY_EB"

    .line 66
    .line 67
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sput-object v0, Lkf/h;->g:Lapp/nekogram/translator/r;

    .line 71
    .line 72
    new-instance v0, Lapp/nekogram/translator/r;

    .line 73
    .line 74
    const-string v1, "POISONED"

    .line 75
    .line 76
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lkf/h;->h:Lapp/nekogram/translator/r;

    .line 80
    .line 81
    new-instance v0, Lapp/nekogram/translator/r;

    .line 82
    .line 83
    const-string v1, "DONE_RCV"

    .line 84
    .line 85
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    sput-object v0, Lkf/h;->i:Lapp/nekogram/translator/r;

    .line 89
    .line 90
    new-instance v0, Lapp/nekogram/translator/r;

    .line 91
    .line 92
    const-string v1, "INTERRUPTED_SEND"

    .line 93
    .line 94
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 95
    .line 96
    .line 97
    sput-object v0, Lkf/h;->j:Lapp/nekogram/translator/r;

    .line 98
    .line 99
    new-instance v0, Lapp/nekogram/translator/r;

    .line 100
    .line 101
    const-string v1, "INTERRUPTED_RCV"

    .line 102
    .line 103
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 104
    .line 105
    .line 106
    sput-object v0, Lkf/h;->k:Lapp/nekogram/translator/r;

    .line 107
    .line 108
    new-instance v0, Lapp/nekogram/translator/r;

    .line 109
    .line 110
    const-string v1, "CHANNEL_CLOSED"

    .line 111
    .line 112
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 113
    .line 114
    .line 115
    sput-object v0, Lkf/h;->l:Lapp/nekogram/translator/r;

    .line 116
    .line 117
    new-instance v0, Lapp/nekogram/translator/r;

    .line 118
    .line 119
    const-string v1, "SUSPEND"

    .line 120
    .line 121
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 122
    .line 123
    .line 124
    sput-object v0, Lkf/h;->m:Lapp/nekogram/translator/r;

    .line 125
    .line 126
    new-instance v0, Lapp/nekogram/translator/r;

    .line 127
    .line 128
    const-string v1, "SUSPEND_NO_WAITER"

    .line 129
    .line 130
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    sput-object v0, Lkf/h;->n:Lapp/nekogram/translator/r;

    .line 134
    .line 135
    new-instance v0, Lapp/nekogram/translator/r;

    .line 136
    .line 137
    const-string v1, "FAILED"

    .line 138
    .line 139
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 140
    .line 141
    .line 142
    sput-object v0, Lkf/h;->o:Lapp/nekogram/translator/r;

    .line 143
    .line 144
    new-instance v0, Lapp/nekogram/translator/r;

    .line 145
    .line 146
    const-string v1, "NO_RECEIVE_RESULT"

    .line 147
    .line 148
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 149
    .line 150
    .line 151
    sput-object v0, Lkf/h;->p:Lapp/nekogram/translator/r;

    .line 152
    .line 153
    new-instance v0, Lapp/nekogram/translator/r;

    .line 154
    .line 155
    const-string v1, "CLOSE_HANDLER_CLOSED"

    .line 156
    .line 157
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    sput-object v0, Lkf/h;->q:Lapp/nekogram/translator/r;

    .line 161
    .line 162
    new-instance v0, Lapp/nekogram/translator/r;

    .line 163
    .line 164
    const-string v1, "CLOSE_HANDLER_INVOKED"

    .line 165
    .line 166
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 167
    .line 168
    .line 169
    sput-object v0, Lkf/h;->r:Lapp/nekogram/translator/r;

    .line 170
    .line 171
    new-instance v0, Lapp/nekogram/translator/r;

    .line 172
    .line 173
    const-string v1, "NO_CLOSE_CAUSE"

    .line 174
    .line 175
    invoke-direct {v0, v2, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    sput-object v0, Lkf/h;->s:Lapp/nekogram/translator/r;

    .line 179
    .line 180
    return-void
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
