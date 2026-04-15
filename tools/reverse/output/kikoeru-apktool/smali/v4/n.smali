.class public final Lv4/n;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lp4/v;

.field public c:Lxa/i;

.field public d:Lxa/i;

.field public final e:Lv4/b;

.field public f:Lxa/i;

.field public final g:Lv4/b;

.field public final h:Landroid/os/Looper;

.field public final i:I

.field public final j:Lm4/d;

.field public final k:I

.field public final l:Z

.field public final m:Lv4/b1;

.field public final n:J

.field public final o:J

.field public final p:J

.field public final q:Lv4/h;

.field public final r:J

.field public final s:Z

.field public t:Z

.field public final u:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 1
    new-instance v0, Lv4/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p1, v1}, Lv4/b;-><init>(Landroid/content/Context;I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lv4/b;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v1, p1, v2}, Lv4/b;-><init>(Landroid/content/Context;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lv4/b;

    .line 14
    .line 15
    const/4 v3, 0x3

    .line 16
    invoke-direct {v2, p1, v3}, Lv4/b;-><init>(Landroid/content/Context;I)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lp5/m;

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    invoke-direct {v3, v4}, Lp5/m;-><init>(I)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Lv4/b;

    .line 26
    .line 27
    const/4 v5, 0x4

    .line 28
    invoke-direct {v4, p1, v5}, Lv4/b;-><init>(Landroid/content/Context;I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lv4/n;->a:Landroid/content/Context;

    .line 38
    .line 39
    iput-object v0, p0, Lv4/n;->c:Lxa/i;

    .line 40
    .line 41
    iput-object v1, p0, Lv4/n;->d:Lxa/i;

    .line 42
    .line 43
    iput-object v2, p0, Lv4/n;->e:Lv4/b;

    .line 44
    .line 45
    iput-object v3, p0, Lv4/n;->f:Lxa/i;

    .line 46
    .line 47
    iput-object v4, p0, Lv4/n;->g:Lv4/b;

    .line 48
    .line 49
    invoke-static {}, Lp4/c0;->v()Landroid/os/Looper;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lv4/n;->h:Landroid/os/Looper;

    .line 54
    .line 55
    sget-object p1, Lm4/d;->g:Lm4/d;

    .line 56
    .line 57
    iput-object p1, p0, Lv4/n;->j:Lm4/d;

    .line 58
    .line 59
    const/4 p1, 0x1

    .line 60
    iput p1, p0, Lv4/n;->k:I

    .line 61
    .line 62
    iput-boolean p1, p0, Lv4/n;->l:Z

    .line 63
    .line 64
    sget-object v0, Lv4/b1;->c:Lv4/b1;

    .line 65
    .line 66
    iput-object v0, p0, Lv4/n;->m:Lv4/b1;

    .line 67
    .line 68
    const-wide/16 v0, 0x1388

    .line 69
    .line 70
    iput-wide v0, p0, Lv4/n;->n:J

    .line 71
    .line 72
    const-wide/16 v0, 0x3a98

    .line 73
    .line 74
    iput-wide v0, p0, Lv4/n;->o:J

    .line 75
    .line 76
    const-wide/16 v0, 0xbb8

    .line 77
    .line 78
    iput-wide v0, p0, Lv4/n;->p:J

    .line 79
    .line 80
    const-wide/16 v0, 0x14

    .line 81
    .line 82
    invoke-static {v0, v1}, Lp4/c0;->N(J)J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    const-wide/16 v2, 0x1f4

    .line 87
    .line 88
    invoke-static {v2, v3}, Lp4/c0;->N(J)J

    .line 89
    .line 90
    .line 91
    move-result-wide v2

    .line 92
    new-instance v4, Lv4/h;

    .line 93
    .line 94
    invoke-direct {v4, v0, v1, v2, v3}, Lv4/h;-><init>(JJ)V

    .line 95
    .line 96
    .line 97
    iput-object v4, p0, Lv4/n;->q:Lv4/h;

    .line 98
    .line 99
    sget-object v0, Lp4/v;->a:Lp4/v;

    .line 100
    .line 101
    iput-object v0, p0, Lv4/n;->b:Lp4/v;

    .line 102
    .line 103
    const-wide/16 v0, 0x7d0

    .line 104
    .line 105
    iput-wide v0, p0, Lv4/n;->r:J

    .line 106
    .line 107
    iput-boolean p1, p0, Lv4/n;->s:Z

    .line 108
    .line 109
    const-string p1, ""

    .line 110
    .line 111
    iput-object p1, p0, Lv4/n;->u:Ljava/lang/String;

    .line 112
    .line 113
    const/16 p1, -0x3e8

    .line 114
    .line 115
    iput p1, p0, Lv4/n;->i:I

    .line 116
    .line 117
    return-void
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
