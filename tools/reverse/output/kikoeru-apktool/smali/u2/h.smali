.class public final Lu2/h;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:Landroid/text/TextPaint;

.field public final d:I

.field public final e:Landroid/text/TextDirectionHeuristic;

.field public final f:Landroid/text/Layout$Alignment;

.field public final g:I

.field public final h:Landroid/text/TextUtils$TruncateAt;

.field public final i:I

.field public final j:I

.field public final k:Z

.field public final l:I

.field public final m:I

.field public final n:I

.field public final o:I


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;ILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IIZIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu2/h;->a:Ljava/lang/CharSequence;

    .line 5
    .line 6
    iput p2, p0, Lu2/h;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lu2/h;->c:Landroid/text/TextPaint;

    .line 9
    .line 10
    iput p4, p0, Lu2/h;->d:I

    .line 11
    .line 12
    iput-object p5, p0, Lu2/h;->e:Landroid/text/TextDirectionHeuristic;

    .line 13
    .line 14
    iput-object p6, p0, Lu2/h;->f:Landroid/text/Layout$Alignment;

    .line 15
    .line 16
    iput p7, p0, Lu2/h;->g:I

    .line 17
    .line 18
    iput-object p8, p0, Lu2/h;->h:Landroid/text/TextUtils$TruncateAt;

    .line 19
    .line 20
    iput p9, p0, Lu2/h;->i:I

    .line 21
    .line 22
    iput p10, p0, Lu2/h;->j:I

    .line 23
    .line 24
    iput-boolean p11, p0, Lu2/h;->k:Z

    .line 25
    .line 26
    iput p12, p0, Lu2/h;->l:I

    .line 27
    .line 28
    iput p13, p0, Lu2/h;->m:I

    .line 29
    .line 30
    iput p14, p0, Lu2/h;->n:I

    .line 31
    .line 32
    iput p15, p0, Lu2/h;->o:I

    .line 33
    .line 34
    if-ltz p2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p3, "invalid start value"

    .line 38
    .line 39
    invoke-static {p3}, Lz2/a;->a(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-ltz p2, :cond_1

    .line 47
    .line 48
    if-gt p2, p1, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p1, "invalid end value"

    .line 52
    .line 53
    invoke-static {p1}, Lz2/a;->a(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    if-ltz p7, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const-string p1, "invalid maxLines value"

    .line 60
    .line 61
    invoke-static {p1}, Lz2/a;->a(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_2
    if-ltz p4, :cond_3

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    const-string p1, "invalid width value"

    .line 68
    .line 69
    invoke-static {p1}, Lz2/a;->a(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :goto_3
    if-ltz p9, :cond_4

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_4
    const-string p1, "invalid ellipsizedWidth value"

    .line 76
    .line 77
    invoke-static {p1}, Lz2/a;->a(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :goto_4
    return-void
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
    .line 115
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
.end method
