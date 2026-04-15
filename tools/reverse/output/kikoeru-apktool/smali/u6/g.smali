.class public final Lu6/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Z

.field public d:I

.field public e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:F

.field public l:Ljava/lang/String;

.field public m:I

.field public n:I

.field public o:Landroid/text/Layout$Alignment;

.field public p:Landroid/text/Layout$Alignment;

.field public q:I

.field public r:Lu6/b;

.field public s:F

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lu6/g;->f:I

    .line 6
    .line 7
    iput v0, p0, Lu6/g;->g:I

    .line 8
    .line 9
    iput v0, p0, Lu6/g;->h:I

    .line 10
    .line 11
    iput v0, p0, Lu6/g;->i:I

    .line 12
    .line 13
    iput v0, p0, Lu6/g;->j:I

    .line 14
    .line 15
    iput v0, p0, Lu6/g;->m:I

    .line 16
    .line 17
    iput v0, p0, Lu6/g;->n:I

    .line 18
    .line 19
    iput v0, p0, Lu6/g;->q:I

    .line 20
    .line 21
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 22
    .line 23
    .line 24
    iput v0, p0, Lu6/g;->s:F

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final a(Lu6/g;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_10

    .line 2
    .line 3
    iget-boolean v0, p0, Lu6/g;->c:Z

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p1, Lu6/g;->c:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v0, p1, Lu6/g;->b:I

    .line 13
    .line 14
    iput v0, p0, Lu6/g;->b:I

    .line 15
    .line 16
    iput-boolean v1, p0, Lu6/g;->c:Z

    .line 17
    .line 18
    :cond_0
    iget v0, p0, Lu6/g;->h:I

    .line 19
    .line 20
    const/4 v2, -0x1

    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    iget v0, p1, Lu6/g;->h:I

    .line 24
    .line 25
    iput v0, p0, Lu6/g;->h:I

    .line 26
    .line 27
    :cond_1
    iget v0, p0, Lu6/g;->i:I

    .line 28
    .line 29
    if-ne v0, v2, :cond_2

    .line 30
    .line 31
    iget v0, p1, Lu6/g;->i:I

    .line 32
    .line 33
    iput v0, p0, Lu6/g;->i:I

    .line 34
    .line 35
    :cond_2
    iget-object v0, p0, Lu6/g;->a:Ljava/lang/String;

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    iget-object v0, p1, Lu6/g;->a:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iput-object v0, p0, Lu6/g;->a:Ljava/lang/String;

    .line 44
    .line 45
    :cond_3
    iget v0, p0, Lu6/g;->f:I

    .line 46
    .line 47
    if-ne v0, v2, :cond_4

    .line 48
    .line 49
    iget v0, p1, Lu6/g;->f:I

    .line 50
    .line 51
    iput v0, p0, Lu6/g;->f:I

    .line 52
    .line 53
    :cond_4
    iget v0, p0, Lu6/g;->g:I

    .line 54
    .line 55
    if-ne v0, v2, :cond_5

    .line 56
    .line 57
    iget v0, p1, Lu6/g;->g:I

    .line 58
    .line 59
    iput v0, p0, Lu6/g;->g:I

    .line 60
    .line 61
    :cond_5
    iget v0, p0, Lu6/g;->n:I

    .line 62
    .line 63
    if-ne v0, v2, :cond_6

    .line 64
    .line 65
    iget v0, p1, Lu6/g;->n:I

    .line 66
    .line 67
    iput v0, p0, Lu6/g;->n:I

    .line 68
    .line 69
    :cond_6
    iget-object v0, p0, Lu6/g;->o:Landroid/text/Layout$Alignment;

    .line 70
    .line 71
    if-nez v0, :cond_7

    .line 72
    .line 73
    iget-object v0, p1, Lu6/g;->o:Landroid/text/Layout$Alignment;

    .line 74
    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    iput-object v0, p0, Lu6/g;->o:Landroid/text/Layout$Alignment;

    .line 78
    .line 79
    :cond_7
    iget-object v0, p0, Lu6/g;->p:Landroid/text/Layout$Alignment;

    .line 80
    .line 81
    if-nez v0, :cond_8

    .line 82
    .line 83
    iget-object v0, p1, Lu6/g;->p:Landroid/text/Layout$Alignment;

    .line 84
    .line 85
    if-eqz v0, :cond_8

    .line 86
    .line 87
    iput-object v0, p0, Lu6/g;->p:Landroid/text/Layout$Alignment;

    .line 88
    .line 89
    :cond_8
    iget v0, p0, Lu6/g;->q:I

    .line 90
    .line 91
    if-ne v0, v2, :cond_9

    .line 92
    .line 93
    iget v0, p1, Lu6/g;->q:I

    .line 94
    .line 95
    iput v0, p0, Lu6/g;->q:I

    .line 96
    .line 97
    :cond_9
    iget v0, p0, Lu6/g;->j:I

    .line 98
    .line 99
    if-ne v0, v2, :cond_a

    .line 100
    .line 101
    iget v0, p1, Lu6/g;->j:I

    .line 102
    .line 103
    iput v0, p0, Lu6/g;->j:I

    .line 104
    .line 105
    iget v0, p1, Lu6/g;->k:F

    .line 106
    .line 107
    iput v0, p0, Lu6/g;->k:F

    .line 108
    .line 109
    :cond_a
    iget-object v0, p0, Lu6/g;->r:Lu6/b;

    .line 110
    .line 111
    if-nez v0, :cond_b

    .line 112
    .line 113
    iget-object v0, p1, Lu6/g;->r:Lu6/b;

    .line 114
    .line 115
    iput-object v0, p0, Lu6/g;->r:Lu6/b;

    .line 116
    .line 117
    :cond_b
    iget v0, p0, Lu6/g;->s:F

    .line 118
    .line 119
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 120
    .line 121
    .line 122
    cmpl-float v0, v0, v3

    .line 123
    .line 124
    if-nez v0, :cond_c

    .line 125
    .line 126
    iget v0, p1, Lu6/g;->s:F

    .line 127
    .line 128
    iput v0, p0, Lu6/g;->s:F

    .line 129
    .line 130
    :cond_c
    iget-object v0, p0, Lu6/g;->t:Ljava/lang/String;

    .line 131
    .line 132
    if-nez v0, :cond_d

    .line 133
    .line 134
    iget-object v0, p1, Lu6/g;->t:Ljava/lang/String;

    .line 135
    .line 136
    iput-object v0, p0, Lu6/g;->t:Ljava/lang/String;

    .line 137
    .line 138
    :cond_d
    iget-object v0, p0, Lu6/g;->u:Ljava/lang/String;

    .line 139
    .line 140
    if-nez v0, :cond_e

    .line 141
    .line 142
    iget-object v0, p1, Lu6/g;->u:Ljava/lang/String;

    .line 143
    .line 144
    iput-object v0, p0, Lu6/g;->u:Ljava/lang/String;

    .line 145
    .line 146
    :cond_e
    iget-boolean v0, p0, Lu6/g;->e:Z

    .line 147
    .line 148
    if-nez v0, :cond_f

    .line 149
    .line 150
    iget-boolean v0, p1, Lu6/g;->e:Z

    .line 151
    .line 152
    if-eqz v0, :cond_f

    .line 153
    .line 154
    iget v0, p1, Lu6/g;->d:I

    .line 155
    .line 156
    iput v0, p0, Lu6/g;->d:I

    .line 157
    .line 158
    iput-boolean v1, p0, Lu6/g;->e:Z

    .line 159
    .line 160
    :cond_f
    iget v0, p0, Lu6/g;->m:I

    .line 161
    .line 162
    if-ne v0, v2, :cond_10

    .line 163
    .line 164
    iget p1, p1, Lu6/g;->m:I

    .line 165
    .line 166
    if-eq p1, v2, :cond_10

    .line 167
    .line 168
    iput p1, p0, Lu6/g;->m:I

    .line 169
    .line 170
    :cond_10
    return-void
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
