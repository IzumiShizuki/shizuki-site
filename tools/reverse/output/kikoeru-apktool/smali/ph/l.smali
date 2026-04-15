.class public final Lph/l;
.super Lph/b;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public b:I

.field public final c:Lsh/f;

.field public final d:Z

.field public e:S

.field public f:I

.field public final g:[I

.field public h:I

.field public i:I

.field public final j:Lph/h;


# direct methods
.method public constructor <init>(Lsh/b;ZLph/h;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lph/b;-><init>()V

    .line 8
    iput-object p1, p0, Lph/l;->c:Lsh/f;

    .line 9
    iput-boolean p2, p0, Lph/l;->d:Z

    .line 10
    iput-object p3, p0, Lph/l;->j:Lph/h;

    const/4 p1, 0x4

    .line 11
    new-array p1, p1, [I

    iput-object p1, p0, Lph/l;->g:[I

    .line 12
    invoke-virtual {p0}, Lph/l;->d()V

    return-void
.end method

.method public constructor <init>(Lsh/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lph/b;-><init>()V

    .line 2
    iput-object p1, p0, Lph/l;->c:Lsh/f;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lph/l;->d:Z

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lph/l;->j:Lph/h;

    const/4 p1, 0x4

    .line 5
    new-array p1, p1, [I

    iput-object p1, p0, Lph/l;->g:[I

    .line 6
    invoke-virtual {p0}, Lph/l;->d()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lph/l;->j:Lph/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lph/l;->c:Lsh/f;

    .line 6
    .line 7
    iget-object v0, v0, Lsh/f;->d:Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lph/h;->a()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
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

.method public final b()F
    .locals 3

    .line 1
    iget v0, p0, Lph/l;->f:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lph/l;->g:[I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    aget v1, v1, v2

    .line 9
    .line 10
    int-to-float v1, v1

    .line 11
    const/high16 v2, 0x3f800000    # 1.0f

    .line 12
    .line 13
    mul-float v1, v1, v2

    .line 14
    .line 15
    int-to-float v0, v0

    .line 16
    div-float/2addr v1, v0

    .line 17
    iget-object v0, p0, Lph/l;->c:Lsh/f;

    .line 18
    .line 19
    iget v0, v0, Lsh/f;->c:F

    .line 20
    .line 21
    div-float/2addr v1, v0

    .line 22
    iget v0, p0, Lph/l;->i:I

    .line 23
    .line 24
    int-to-float v0, v0

    .line 25
    mul-float v1, v1, v0

    .line 26
    .line 27
    iget v0, p0, Lph/l;->h:I

    .line 28
    .line 29
    int-to-float v0, v0

    .line 30
    div-float/2addr v1, v0

    .line 31
    cmpl-float v0, v1, v2

    .line 32
    .line 33
    if-ltz v0, :cond_0

    .line 34
    .line 35
    const v0, 0x3f7d70a4    # 0.99f

    .line 36
    .line 37
    .line 38
    return v0

    .line 39
    :cond_0
    return v1

    .line 40
    :cond_1
    const v0, 0x3c23d70a    # 0.01f

    .line 41
    .line 42
    .line 43
    return v0
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

.method public final c([BI)I
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x1

    .line 3
    if-ge v0, p2, :cond_3

    .line 4
    .line 5
    iget-object v2, p0, Lph/l;->c:Lsh/f;

    .line 6
    .line 7
    iget-object v3, v2, Lsh/f;->b:[B

    .line 8
    .line 9
    aget-byte v4, p1, v0

    .line 10
    .line 11
    and-int/lit16 v4, v4, 0xff

    .line 12
    .line 13
    iget-object v2, v2, Lsh/f;->a:[S

    .line 14
    .line 15
    aget-short v2, v2, v4

    .line 16
    .line 17
    const/16 v4, 0xfa

    .line 18
    .line 19
    if-ge v2, v4, :cond_0

    .line 20
    .line 21
    iget v4, p0, Lph/l;->h:I

    .line 22
    .line 23
    add-int/2addr v4, v1

    .line 24
    iput v4, p0, Lph/l;->h:I

    .line 25
    .line 26
    :cond_0
    const/16 v4, 0x40

    .line 27
    .line 28
    if-ge v2, v4, :cond_2

    .line 29
    .line 30
    iget v5, p0, Lph/l;->i:I

    .line 31
    .line 32
    add-int/2addr v5, v1

    .line 33
    iput v5, p0, Lph/l;->i:I

    .line 34
    .line 35
    iget-short v5, p0, Lph/l;->e:S

    .line 36
    .line 37
    if-ge v5, v4, :cond_2

    .line 38
    .line 39
    iget v4, p0, Lph/l;->f:I

    .line 40
    .line 41
    add-int/2addr v4, v1

    .line 42
    iput v4, p0, Lph/l;->f:I

    .line 43
    .line 44
    iget-boolean v4, p0, Lph/l;->d:Z

    .line 45
    .line 46
    iget-object v6, p0, Lph/l;->g:[I

    .line 47
    .line 48
    if-nez v4, :cond_1

    .line 49
    .line 50
    mul-int/lit8 v5, v5, 0x40

    .line 51
    .line 52
    add-int/2addr v5, v2

    .line 53
    aget-byte v3, v3, v5

    .line 54
    .line 55
    aget v4, v6, v3

    .line 56
    .line 57
    add-int/2addr v4, v1

    .line 58
    aput v4, v6, v3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    mul-int/lit8 v4, v2, 0x40

    .line 62
    .line 63
    add-int/2addr v4, v5

    .line 64
    aget-byte v3, v3, v4

    .line 65
    .line 66
    aget v4, v6, v3

    .line 67
    .line 68
    add-int/2addr v4, v1

    .line 69
    aput v4, v6, v3

    .line 70
    .line 71
    :cond_2
    :goto_1
    iput-short v2, p0, Lph/l;->e:S

    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    iget p1, p0, Lph/l;->b:I

    .line 77
    .line 78
    if-ne p1, v1, :cond_5

    .line 79
    .line 80
    iget p1, p0, Lph/l;->f:I

    .line 81
    .line 82
    const/16 p2, 0x400

    .line 83
    .line 84
    if-le p1, p2, :cond_5

    .line 85
    .line 86
    invoke-virtual {p0}, Lph/l;->b()F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    const p2, 0x3f733333    # 0.95f

    .line 91
    .line 92
    .line 93
    cmpl-float p2, p1, p2

    .line 94
    .line 95
    if-lez p2, :cond_4

    .line 96
    .line 97
    const/4 p1, 0x2

    .line 98
    iput p1, p0, Lph/l;->b:I

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    const p2, 0x3d4ccccd    # 0.05f

    .line 102
    .line 103
    .line 104
    cmpg-float p1, p1, p2

    .line 105
    .line 106
    if-gez p1, :cond_5

    .line 107
    .line 108
    const/4 p1, 0x3

    .line 109
    iput p1, p0, Lph/l;->b:I

    .line 110
    .line 111
    :cond_5
    :goto_2
    iget p1, p0, Lph/l;->b:I

    .line 112
    .line 113
    return p1
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
.end method

.method public final d()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lph/l;->b:I

    .line 3
    .line 4
    const/16 v0, 0xff

    .line 5
    .line 6
    iput-short v0, p0, Lph/l;->e:S

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    const/4 v2, 0x4

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lph/l;->g:[I

    .line 14
    .line 15
    aput v0, v2, v1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iput v0, p0, Lph/l;->f:I

    .line 21
    .line 22
    iput v0, p0, Lph/l;->h:I

    .line 23
    .line 24
    iput v0, p0, Lph/l;->i:I

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method
