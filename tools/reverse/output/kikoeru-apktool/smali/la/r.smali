.class public final synthetic Lla/r;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:F

.field public final synthetic e:Lj1/q;

.field public final synthetic f:Lf1/f;

.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JJFLy/d1;Ly/r1;Lj1/q;Lf1/f;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lla/r;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lla/r;->b:J

    iput-wide p3, p0, Lla/r;->c:J

    iput p5, p0, Lla/r;->d:F

    iput-object p6, p0, Lla/r;->h:Ljava/lang/Object;

    iput-object p7, p0, Lla/r;->i:Ljava/lang/Object;

    iput-object p8, p0, Lla/r;->e:Lj1/q;

    iput-object p9, p0, Lla/r;->f:Lf1/f;

    iput p10, p0, Lla/r;->g:I

    return-void
.end method

.method public synthetic constructor <init>(Lj1/q;Lq1/l0;JJLs/o;FLf1/f;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lla/r;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/r;->e:Lj1/q;

    iput-object p2, p0, Lla/r;->h:Ljava/lang/Object;

    iput-wide p3, p0, Lla/r;->b:J

    iput-wide p5, p0, Lla/r;->c:J

    iput-object p7, p0, Lla/r;->i:Ljava/lang/Object;

    iput p8, p0, Lla/r;->d:F

    iput-object p9, p0, Lla/r;->f:Lf1/f;

    iput p10, p0, Lla/r;->g:I

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lla/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lla/r;->h:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v6, v0

    .line 9
    check-cast v6, Ly/d1;

    .line 10
    .line 11
    iget-object v0, p0, Lla/r;->i:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v7, v0

    .line 14
    check-cast v7, Ly/r1;

    .line 15
    .line 16
    move-object v10, p1

    .line 17
    check-cast v10, Lx0/o;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget p1, p0, Lla/r;->g:I

    .line 25
    .line 26
    or-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 29
    .line 30
    .line 31
    move-result v11

    .line 32
    iget-wide v1, p0, Lla/r;->b:J

    .line 33
    .line 34
    iget-wide v3, p0, Lla/r;->c:J

    .line 35
    .line 36
    iget v5, p0, Lla/r;->d:F

    .line 37
    .line 38
    iget-object v8, p0, Lla/r;->e:Lj1/q;

    .line 39
    .line 40
    iget-object v9, p0, Lla/r;->f:Lf1/f;

    .line 41
    .line 42
    invoke-static/range {v1 .. v11}, Lm0/i0;->a(JJFLy/d1;Ly/r1;Lj1/q;Lf1/f;Lx0/o;I)V

    .line 43
    .line 44
    .line 45
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_0
    iget-object v0, p0, Lla/r;->h:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v2, v0

    .line 51
    check-cast v2, Lq1/l0;

    .line 52
    .line 53
    iget-object v0, p0, Lla/r;->i:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v7, v0

    .line 56
    check-cast v7, Ls/o;

    .line 57
    .line 58
    move-object v10, p1

    .line 59
    check-cast v10, Lx0/o;

    .line 60
    .line 61
    check-cast p2, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget p1, p0, Lla/r;->g:I

    .line 67
    .line 68
    or-int/lit8 p1, p1, 0x1

    .line 69
    .line 70
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    iget-object v1, p0, Lla/r;->e:Lj1/q;

    .line 75
    .line 76
    iget-wide v3, p0, Lla/r;->b:J

    .line 77
    .line 78
    iget-wide v5, p0, Lla/r;->c:J

    .line 79
    .line 80
    iget v8, p0, Lla/r;->d:F

    .line 81
    .line 82
    iget-object v9, p0, Lla/r;->f:Lf1/f;

    .line 83
    .line 84
    invoke-static/range {v1 .. v11}, Lla/t;->b(Lj1/q;Lq1/l0;JJLs/o;FLf1/f;Lx0/o;I)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
